package com.github.songjiang951130.ioc.core.aspectj;

public class User {

    public void login(){
        System.out.println("user is login in");
    }

    public static void main(String[] args) {
        User user = new User();
        user.login();
    }
}
