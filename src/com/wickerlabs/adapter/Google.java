package com.wickerlabs.adapter;

/**
 * Created by wickerman on 7/30/18.
 */
public interface Google {

    void setFirstName(String firstName);
    void setLastName(String lastName);
    void setUsername(String username);
    void setPassword(String password);
    void setPhoneNumber(String phoneNumber);

    String getFirstName();
    String getLastName();
    String getUsername();
    String getPassword(); // Just for learning purposes
    String getPhoneNumber();

    String toString();

}
