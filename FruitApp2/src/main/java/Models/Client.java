package Models;

public class Client {
    String id;
    String name;
    String middleName;
    String lastName;
    float latitude;
    float longitude;
    String phoneNumber;
    String companyName;
    
    public Client(String name, String lastname, String phonenumber, String companyname, String mName, String lat, String lng){

        this.name = name;
        this.lastName = lastname;
        this.middleName = mName;
        this.phoneNumber = phonenumber;
        this.latitude = Float.parseFloat(lat);
        this.longitude = Float.parseFloat(lng);
        this.companyName = companyname;
    }
    
    public String getId(){
        return this.id;
    }  
    
    public String getName(){
        return this.name;
    }
    
    public String getMName(){
        return this.middleName;
    }
    
    public String getLName(){
        return this.lastName;
    }  
    public float getLatitude(){
        return this.latitude;
    }
    
    public float getLongitude(){
        return this.longitude;
    } 
    
    public String getPhone(){
        return this.phoneNumber;
    }
    
    public String getCompany(){
        return this.companyName;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setLName(String lastname){
        this.lastName = lastname;
    }
    
    public void setMName(String middlename){
        this.middleName = middlename;
    }  
    
    public void setLatitude(float latitude){
        this.latitude = latitude;
    }
    
    public void setLongitude(float longitude){
        this.longitude = longitude;
    } 
    
    public void setPhone(String phonenumber){
        this.phoneNumber = phonenumber;
    }
    
    public void setCompany(String companyname){
        this.companyName = companyname;
    }
}