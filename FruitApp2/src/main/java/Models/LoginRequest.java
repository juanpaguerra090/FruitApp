package Models;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/** @author juanrmz */
public class LoginRequest {
    private String client_id,
            client_secret,
            username,
            password,
            grant_type,
            scope;
    
    public LoginRequest(String client_id, String client_secret, String username, String password, String grant_type, String scope){
        this.client_id = client_id;
        this.client_secret = client_secret;
        this.username = username;
        this.password = password;
        this.grant_type = grant_type;
        this.scope = scope;
    }
    
    public String serialize() throws UnsupportedEncodingException{
        return ("username="+this.username+"&password="+URLEncoder.encode(this.password,"UTF-8")+"&grant_type="+this.grant_type+"&scopes="+this.scope+"&client_id="+this.client_id+"&client_secret="+this.client_secret);
    }
}
