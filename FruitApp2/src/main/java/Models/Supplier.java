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
    public void setPhone(String phone){
        this.phoneNumber = phone;
    }
    public List getFruits(){
        return this.fruits;
    }
    public void setFruits(List f){
        this.fruits = f;
    }
    public List getCertificates(){
        return this.certificates;
    }
    public void setCertificates(List c){
        this.certificates = c;
    }
    public float getLat(){
        return this.latitude;
    }
    public void setLat(float lat){
        this.latitude = lat;
    }
    public float getLon(){
        return this.longitude;
    }
    public void setLon(float lon){
        this.longitude = lon;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String n){
        this.name = n;
    }
    public String getMName(){
        return this.middleName;
    }
    public void setMName(String mn){
        this.middleName = mn;
    }
    public String getLName(){
        return this.lastName;
    }
    public void setLName(String ln){
        this.lastName = ln;
    }
    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }
    
   
}