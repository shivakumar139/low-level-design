package entity;

import java.util.UUID;

public class User {
    private String id;
    private String mobile;
    private String email;
    public User(String mobile, String email){
        this.id = UUID.randomUUID().toString();
        this.mobile = mobile;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

}
