package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void longerThan8_returnTrue_whenP12345678(){
        //GIVEN
        String p = "12345678";
        //WHEN
        boolean actual = Main.longerThan8(p);
        //THEN
        assertTrue(actual);
    }
    @Test
    void longerThan8_returnFalse_whenP12345(){
        //GIVEN
        String p = "12345";
        //WHEN
        boolean actual = Main.longerThan8(p);
        //THEN
        assertFalse(actual);
    }
    @Test
    void digit_returnTrue_whenP123abc(){
        String p = "123abc";
        boolean actual = Main.digit(p);
        assertTrue(actual);
    }
    @Test
    void digit_returnFalse_whenPabcd(){
        String p = "abcd";
        boolean actual = Main.digit(p);
        assertFalse(actual);
    }
    @Test
    void upperAndLower_returnTrue_whenPabCD(){
        String p = "abCD";
        boolean actual = Main.upperAndLower(p);
        assertTrue(actual);
    }
    @Test
    void upperAndLower_returnFalse_whenPabcd(){
        String p = "abcd";
        boolean actual = Main.upperAndLower(p);
        assertFalse(actual);
    }
    @Test
    void oldPopular_returnTrue_whenPAa345678(){
        String p = "Aa345678";
        boolean actual = Main.oldPopular(p);
        assertTrue(actual);
    }
    @Test
    void oldPopular_returnFalse_whenPHello3456(){
        String p = "Hello3456";
        boolean actual = Main.oldPopular(p);
        assertFalse(actual);
    }
    @Test
    void oldPopular_returnTrue_whenPAa34567890(){
        String p = "Aa34567890";
        boolean actual = Main.oldPopular(p);
        assertTrue(actual);
    }
    @Test
    void oldPopular_returnTrue_whenPPassword(){
        String p = "Password12";
        boolean actual = Main.oldPopular(p);
        assertTrue(actual);
    }
}