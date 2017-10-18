/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author juanrmz
 */
public class LoginResponse {
    String token_type, 
            access_token;
    int expires_in;
    
    public LoginResponse(String token_type, String access_token, int expires_in){
        this.token_type = token_type;
        this.access_token = access_token;
        this.expires_in = expires_in;
    }
    
    public String getAccessToken(){
        return this.access_token;
    }
}
