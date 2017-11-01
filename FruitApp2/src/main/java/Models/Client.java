package Models;

public class Client {
    String id;
    String name;
    //String middlename;
    String lastname;
    float latitude;
    float longitude;
    String phonenumber;
    String companyname;
    
    public Client(String name, String lastname, String phonenumber, String companyname){

        this.name = name;
        this.lastname = lastname;
        this.phonenumber = phonenumber;
        this.companyname = companyname;
    }
    
    public String getId(){
        return this.id;
    }  
    
    public String getName(){
        return this.name;
    }
    
    public String getLName(){
        return this.lastname;
    }  
    public float getLatitude(){
        return this.latitude;
    }
    
    public float getLongitude(){
        return this.longitude;
    } 
    
    public String getPhone(){
        return this.phonenumber;
    }
    
    public String getCompany(){
        return this.companyname;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setLName(String lastname){
        this.lastname = lastname;
    }  
    public void setLatitude(float latitude){
        this.latitude = latitude;
    }
    
    public void setLongitude(float longitude){
        this.longitude = longitude;
    } 
    
    public void setPhone(String phonenumber){
        this.phonenumber = phonenumber;
    }
    
    public void setCompany(String companyname){
        this.companyname = companyname;
    }
}