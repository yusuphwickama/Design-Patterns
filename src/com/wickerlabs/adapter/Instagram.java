package com.wickerlabs.adapter;

/**
 * Created by wickerman on 7/30/18.
 */
public interface Instagram {

    void setFullName(String fullName);
    void setUsername(String username);
    void setPassword(String password);
    void setPhoneNumber(String phoneNumber);
    void setEmail(String email);

    String getFullName();
    String getUsername();
    String getPassword(); // Just for learning purposes
    String getPhoneNumber();
    String getEmail();

    String toString();

}
