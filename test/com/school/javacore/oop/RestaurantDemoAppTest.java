package com.school.javacore.oop;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RestaurantDemoAppTest {

    @Test
    public void constructorInitializesUsersList(){
        RestaurantDemoApp restaurantDemoApp = new RestaurantDemoApp();
        boolean loginCheck = restaurantDemoApp.login("randomUser", "qwerty");
        boolean loginCheck1 = restaurantDemoApp.login("user1", "s3cr3t");

        assertThat(loginCheck, is(false));
        assertThat(loginCheck1, is(equalTo(true)));


    }
}
