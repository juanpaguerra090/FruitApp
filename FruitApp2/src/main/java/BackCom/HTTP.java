/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackCom;
import Models.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Base64;

/**
 * @author juanrmz
 */
public class  HTTP <I> {
    String token;
    Gson serializer;
    boolean success;
    public HTTP(String token){
        this.token = token;
        this.serializer = new GsonBuilder().create();
    }
    
    public Client[] getClients(String dir)throws MalformedURLException, IOException{
        URL obj = new URL(dir);
        HttpURLConnection connect = (HttpURLConnection) obj.openConnection();
        connect.setRequestMethod("GET");
        connect.setRequestProperty("Authorization", "Bearer " + this.token);
        int responseCode = connect.getResponseCode();
        if(responseCode == HttpURLConnection.HTTP_OK){
            BufferedReader in = new BufferedReader(new InputStreamReader (
            connect.getInputStream()));
            
            String inputLine; 
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null ){
                response.append(inputLine);
            }
            in.close();
            //TODO: Revisar si es <client[]> o <Supplier[]>
            Type listType = new TypeToken<Client[]>(){}.getType();   
            Client[] object = this.serializer.fromJson(response.toString(), listType);
            return object;
        }
        return null;
    }
    
    public Object[] get(String dir) throws MalformedURLException, IOException{
        URL obj = new URL(dir);
        HttpURLConnection connect = (HttpURLConnection) obj.openConnection();
        connect.setRequestMethod("GET");
        connect.setRequestProperty("Authorization", "Bearer " + this.token);
        int responseCode = connect.getResponseCode();
        if(responseCode == HttpURLConnection.HTTP_OK){
            BufferedReader in = new BufferedReader(new InputStreamReader (
            connect.getInputStream()));
            
            String inputLine; 
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null ){
                response.append(inputLine);
            }
            in.close();
            Type listType = new TypeToken<Supplier[]>(){}.getType();   
            Object[] object = this.serializer.fromJson(response.toString(), listType);
            return object;
        }
        return null;
    }
    
    // Se cambió de objeto tipo supplier a Object 
    public boolean post(Object a, String dir) throws MalformedURLException, ProtocolException, IOException {
        //http://fruitappapi.azurewebsites.net/API/clients
        URL obj = new URL(dir);
        HttpURLConnection connect = (HttpURLConnection) obj.openConnection();
        connect.setRequestMethod("POST");
        connect.setDoOutput(true);
        connect.setRequestProperty("Authorization", "Bearer " + this.token);
        String gson = this.serializer.toJson(a);
        connect.setRequestProperty("Content-Type", "Application/JSON");
        
        System.out.println(gson);
        
        OutputStreamWriter wr = new OutputStreamWriter(connect.getOutputStream());
        wr.write(gson);
        wr.close();
        if(connect.getResponseCode() == HttpURLConnection.HTTP_CREATED){
             BufferedReader in = new BufferedReader(new InputStreamReader (
            connect.getInputStream()));
            
            String inputLine; 
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null ){
                response.append(inputLine);
            }
            in.close();
            Object newSupplier = this.serializer.fromJson(response.toString(), Object.class);
            //return newSupplier.getId(); 
            return true;
        }
        return false;
    }
    
    
    public boolean put(Object a, String dir) throws MalformedURLException, ProtocolException, IOException {
        // https://fruitappapi.azurewebsites.net/API/providers
        URL obj = new URL(dir);
        HttpURLConnection connect = (HttpURLConnection) obj.openConnection();
        connect.setRequestMethod("PUT");
        connect.setDoOutput(true);
        connect.setRequestProperty("Authorization", "Bearer " + this.token);
        String gson = this.serializer.toJson(a);
        connect.setRequestProperty("Content-Type", "Application/JSON");
        
        System.out.println(gson);
        
        OutputStreamWriter wr = new OutputStreamWriter(connect.getOutputStream());
        wr.write(gson);
        wr.close();
        if(connect.getResponseCode() == HttpURLConnection.HTTP_CREATED){
             BufferedReader in = new BufferedReader(new InputStreamReader (
            connect.getInputStream()));
            
            String inputLine; 
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null ){
                response.append(inputLine);
            }
            in.close();
            Object newSupplier = this.serializer.fromJson(response.toString(), Object.class);
            //return newSupplier.getId(); 
            return true;
        }
        return false;
    }
    
    
    
    
    
    /**
     * Method for posting an authentication request
     * @param a LoginRequest user to authenticate
     * @param dir url for sending request
     * @return
     * @throws MalformedURLException
     * @throws ProtocolException
     * @throws IOException 
     */
    public boolean postAuth(LoginRequest a, String client_id, String client_secret) throws MalformedURLException, ProtocolException, IOException {  
        URL obj = new URL("https://fruitappapi.azurewebsites.net/connect/token");
        HttpURLConnection connect = (HttpURLConnection) obj.openConnection();
        connect.setRequestMethod("POST");
        connect.setDoOutput(true);
        connect.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        String encoded = Base64.getEncoder().encodeToString((client_id + ":" + client_secret).getBytes());
        connect.setRequestProperty("Authorization", "Basic " + encoded);  
        OutputStreamWriter wr = new OutputStreamWriter(connect.getOutputStream());
        wr.write(a.serialize());
        System.out.println(a.serialize());
        wr.close();
        if(connect.getResponseCode() == HttpURLConnection.HTTP_OK){
             BufferedReader in = new BufferedReader(new InputStreamReader (
            connect.getInputStream()));
            
            String inputLine; 
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null ){
                response.append(inputLine);
            }
            in.close();
            
            System.out.println(response.toString());
            LoginResponse newResponse = this.serializer.fromJson(response.toString(), LoginResponse.class);
            System.out.println(newResponse.getAccessToken());
            this.token = newResponse.getAccessToken();
            return true;
        }
        else{
            System.out.println(connect.getResponseCode());
            return false;
        }
    }    
}
