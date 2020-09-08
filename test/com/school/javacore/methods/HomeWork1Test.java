package com.school.javacore.methods;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HomeWork1Test {

    @Test
    public void testIsOdd(){
        HomeWork1 hw1 = new HomeWork1();
        boolean actualResult = hw1.isOdd(3);
        assertEquals("Should return true on odd numbers",true, actualResult);

        boolean actualResultEven = hw1.isOdd(4);
        assertEquals("Should return false on even numbers: ", false, actualResultEven);

        boolean actualResultNegative = hw1.isOdd(-4);
        assertEquals("Should return false on even numbers: ", false, actualResultEven);
    }
}
