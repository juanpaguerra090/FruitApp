/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackCom;
import Models.Supplier;
import Models.Client;
import Models.Transaction;
import Models.Order;
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

/**
 * @author juanrmz
 */
public class  HTTP <I> {
    String token;
    Gson serializer;
    public HTTP(String token){
        this.token = token;
        this.serializer = new GsonBuilder().create();
    }
    
    public Order[] getOrder(String dir) throws MalformedURLException, IOException{
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
            Type listType = new TypeToken<Order[]>(){}.getType();   
            Order[] object = this.serializer.fromJson(response.toString(), listType);
            return object;
        }
        return null;
    }
    
    public Supplier[] get(String dir) throws MalformedURLException, IOException{
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
            Supplier[] object = this.serializer.fromJson(response.toString(), listType);
            return object;
        }
        return null;
    }
    
    public Client[] getClient(String dir) throws MalformedURLException, IOException{
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
            Type listType = new TypeToken<Client[]>(){}.getType();   
            Client[] object = this.serializer.fromJson(response.toString(), listType);
            return object;
        }
        return null;
    }
    
    public Transaction[] getTransction(String dir) throws MalformedURLException, IOException{
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
            Type listType = new TypeToken<Client[]>(){}.getType();   
            Transaction[] object = this.serializer.fromJson(response.toString(), listType);
            return object;
        }
        return null;
    }
    
    public String post(Object a, String dir) throws MalformedURLException, ProtocolException, IOException {
        // https://fruitappapi.azurewebsites.net/API/providers
        URL obj = new URL(dir);
        HttpURLConnection connect = (HttpURLConnection) obj.openConnection();
        connect.setRequestMethod("POST");
        connect.setDoOutput(true);
        connect.setRequestProperty("Authorization", "Bearer " + this.token);
        String gson = this.serializer.toJson(a);
        connect.setRequestProperty("Content-Type", "Application/JSON");
        
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
            Supplier newSupplier = this.serializer.fromJson(response.toString(), Supplier.class);
            return newSupplier.getId(); 
        }
        return null;
    }
    
    
    
    public String put(Object a, String dir) throws MalformedURLException, ProtocolException, IOException {
        // https://fruitappapi.azurewebsites.net/API/providers
        URL obj = new URL(dir);
        HttpURLConnection connect = (HttpURLConnection) obj.openConnection();
        connect.setRequestMethod("PUT");
        connect.setDoOutput(true);
        connect.setRequestProperty("Authorization", "Bearer " + this.token);
        String gson = this.serializer.toJson(a);
        connect.setRequestProperty("Content-Type", "Application/JSON");
        
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
            Supplier newSupplier = this.serializer.fromJson(response.toString(), Supplier.class);
            return newSupplier.getId(); 
        }
        return null;
    }
    
}
