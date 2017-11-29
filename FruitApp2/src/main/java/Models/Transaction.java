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
public class Transaction {
    
    String transactionId;
    int action;
    int prevQuantity;
    int changeQuantity;
    int postQuantity;
    String message;
    
    public Transaction(int action, int prevQuantity, int changeQuantity, int postQuantity, String message){
        this.action = action;
        this.prevQuantity = prevQuantity;
        this.changeQuantity = changeQuantity;
        this.postQuantity = postQuantity;
        this.message = message;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public int getAction() {
        return action;
    }

    public void setAction(int action) {
        this.action = action;
    }

    public int getPrevQuantity() {
        return prevQuantity;
    }

    public void setPrevQuantity(int prevQuantity) {
        this.prevQuantity = prevQuantity;
    }

    public int getChangeQuantity() {
        return changeQuantity;
    }

    public void setChangeQuantity(int changeQuantity) {
        this.changeQuantity = changeQuantity;
    }

    public int getPostQuantity() {
        return postQuantity;
    }

    public void setPostQuantity(int postQuantity) {
        this.postQuantity = postQuantity;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
    
}
