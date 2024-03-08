package entity;

import java.util.UUID;

public class User {
    private String id;
    private String name;
    private String email;
    private String phoneNo;

    public User(String _name, String _email, String _phoneNo){
        id = UUID.randomUUID().toString();
        name = _name;
        email = _email;
        phoneNo = _phoneNo;
    }

    public String getEmail(){
        return this.email;
    }
    public String getPhoneNo(){
        return this.phoneNo;
    }
}
