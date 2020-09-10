package com.school.javacore.oop;

import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantDemoApp {

    ArrayList<User> userList = new ArrayList<>();

    public RestaurantDemoApp() {
        User user1 = new User("user1", "s3cr3t");
        User user2 = new User("user2", "s3cr3t");
        User user3 = new User("user3", "s3cr3t");
        this.userList.add(user1);
        this.userList.add(user2);
        this.userList.add(user3);
    }

    public static void main(String[] args){

        RestaurantDemoApp restaurantDemoApp = new RestaurantDemoApp();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your username and password to login!");
        String username = input.next();
        String password = input.next();

        boolean loggedIn = restaurantDemoApp.login(username, password);
        System.out.println(loggedIn);
        for (User u: restaurantDemoApp.userList) {
            System.out.println(u.getUsername());
        }

    }

    public boolean login(String username, String password) {
        boolean isLoginSuccessful = false;
        for (User u: this.userList) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password))
                isLoginSuccessful = true;
        }
        return isLoginSuccessful;
    }


}
