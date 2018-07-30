package com.wickerlabs.adapter;

/**
 * Created by wickerman on 7/30/18.
 */
public class GoogleToInstagramAdapter implements Instagram {

    private String fullName, email, password, phoneNumber, username;
    private Google googleUser;

    public GoogleToInstagramAdapter(Google google) {
        this.googleUser = google;
        adaptGoogleUserToInstagramUser();
    }

    @Override
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getFullName() {
        return this.fullName;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public String toString() {
        return "InstagramUser: {" +
                "fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    private void adaptGoogleUserToInstagramUser(){
        setFullName(String.format("%s %s", this.googleUser.getFirstName(), this.googleUser.getLastName()));
        setEmail(String.format("%s@%s",this.googleUser.getUsername(),"gmail.com"));
        setUsername(this.googleUser.getUsername());
        setPhoneNumber(this.googleUser.getPhoneNumber());
        setPassword(this.googleUser.getPassword());
    }
}
