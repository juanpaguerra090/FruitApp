package Models;

import java.util.List;

public class Supplier {
    String id;
    String name;
    String middlename;
    String lastname;
    float latitude;
    float longitude;
    String phonenumber;
    List fruits;
    List certificates;
    
    public Supplier(String name, String lastname, List fruits, List certificates){
        this.name = name;
        this.lastname = lastname;
        this.fruits = fruits;
        this.certificates = certificates;
    }
    
    public String getId(){
        return this.id;
    }
    
   
}