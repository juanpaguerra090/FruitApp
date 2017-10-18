package Models;
public class Supplier {
    String id;
    String name;
    String middlename;
    String lastname;
    float latitude;
    float longitude;
    String phonenumber;
    String[] fruits;
    String[] certificates;
    
    public Supplier(String name, String lastname, String[] fruits, String[] certificates){
        this.name = name;
        this.lastname = lastname;
        this.fruits = fruits;
        this.certificates = certificates;
    }
    
    public String getId(){
        return this.id;
    }
    
   
}