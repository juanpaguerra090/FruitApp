package Models;

import java.util.List;

public class Supplier {
    String id;
    String name;
    String middleName;
    String lastName;
    float latitude;
    float longitude;
    String phoneNumber;
    List fruits;
    List certificates;
    
    public Supplier(String name, String lastname, List fruits, List certificates, float lat, float lon, String phone){
        this.name = name;
        this.middleName = "";
        this.lastName = lastname;
        this.fruits = fruits;
        this.certificates = certificates;
        this.latitude = lat;
        this.longitude = lon;
        this.phoneNumber = phone;
           
    }
    
    public String getPhone(){
        return this.phoneNumber;
    }
    public List getFruits(){
        return this.fruits;
    }
    public List getCertificates(){
        return this.certificates;
    }
    public float getLat(){
        return this.latitude;
    }
    public float getLon(){
        return this.longitude;
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
    
    public String getId(){
        return this.id;
    }
    
   
}