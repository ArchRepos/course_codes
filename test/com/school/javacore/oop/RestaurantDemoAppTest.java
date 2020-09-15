package com.school.javacore.oop;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RestaurantDemoAppTest {

    RestaurantDemoApp restaurantDemoApp = new RestaurantDemoApp();
    @Test
    public void constructorInitializesUsersList(){

        boolean loginCheck = restaurantDemoApp.login("randomUser", "qwerty");
        boolean loginCheck1 = restaurantDemoApp.login("user1", "s3cr3t");

        assertThat(loginCheck, is(false));
        assertThat(loginCheck1, is(equalTo(true)));

        assertFalse(loginCheck);
        assertTrue(loginCheck1);
        assertEquals(false, loginCheck);
        assertEquals(true, loginCheck1);
    }

    @Test
    public void testLogin2ReturnsUser(){
        User user = restaurantDemoApp.login2("adaddddadffsd", "asdasdda");
        assertThat(user, is(nullValue()));

        User user1 = restaurantDemoApp.login2("user1", "s3cr3t");
        assertThat(user1, is(notNullValue()));
        assertThat(user1.getUsername(), is(equalTo("user1")));
        assertThat(user1.getPassword(), is(equalTo("s3cr3t")));
    }
}
