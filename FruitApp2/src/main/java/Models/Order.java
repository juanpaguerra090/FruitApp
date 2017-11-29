/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author scastro81
 */
public class Order {
    String orderId;
    String fruit;
    int quantity;
    int pendingQty;
    String[] certificates;
    float Latitude;
    float Longitude;
    
    public Order(int quantity, String fruit, String[] certs, float lat, float lon){
        this.quantity = quantity;
        this.fruit = fruit;
        this.certificates = certs;
        this.Latitude = lat;
        this.Longitude = lon;
    }

    public float getLatitude() {
        return Latitude;
    }

    public void setLatitude(float Latitude) {
        this.Latitude = Latitude;
    }

    public float getLongitude() {
        return Longitude;
    }

    public void setLongitude(float Longitude) {
        this.Longitude = Longitude;
    }
    
    public int getPendingQty() {
        return pendingQty;
    }

    public void setPendingQty(int pendingQty) {
        this.pendingQty = pendingQty;
    }

    public String[] getCerts() {
        return certificates;
    }

    public void setCerts(String[] certs) {
        this.certificates = certs;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getName() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }   
}
