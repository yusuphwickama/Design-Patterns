package com.wickerlabs;

import com.wickerlabs.adapter.Google;
import com.wickerlabs.adapter.GoogleToInstagramAdapter;
import com.wickerlabs.adapter.GoogleUser;
import com.wickerlabs.adapter.Instagram;

public class Main {

    public static void main(String[] args) {
        // 1. Adapter design pattern to transform a Google User to Instagram user.
        adapterDesignPattern();
    }

    private static void adapterDesignPattern(){
        // Google user
        Google google = new GoogleUser();
        google.setUsername("wickerman");
        google.setPassword("plainOldPassword");
        google.setPhoneNumber("+255657000001");
        google.setFirstName("Yusuph");
        google.setLastName("Wickama");

        // Use adapter to create Instagram user from Google user
        Instagram instagram = new GoogleToInstagramAdapter(google);

        // Print googleUser
        println(google.toString());

        // Print instagramUser
        println(instagram.toString());

    }

    private static void println(String message){
        System.out.println(message);
    }
}
