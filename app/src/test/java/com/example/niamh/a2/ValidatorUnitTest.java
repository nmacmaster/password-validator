package com.example.niamh.a2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorUnitTest {

    //create new validator object
    Validator vd = new Validator();

    //check if password is 'password' (case insensitive)
    //not 'password', return true, else return false
    @Test
    public void s1_isPasswordTest(){
       assertFalse(vd.notPassword("password"));
       assertFalse(vd.notPassword("passworD"));
       assertTrue(vd.notPassword("notpassword"));
    }

    //if password length >= 8 return true, else return false
    @Test
    public void s1_length8Test(){
        assertTrue(vd.validLength("abc12345"));
        assertFalse(vd.validLength("abc123"));
        assertFalse(vd.validLength("x"));
    }

    //check if password contains multiple cases
    @Test
    public void s2_casesTest(){
        assertTrue(vd.multipleCases("aBcdEF1"));
        assertTrue(vd.multipleCases("AcbDfe"));
        assertFalse(vd.multipleCases("abcdef1"));
    }

    //check if the password contains an integer
    @Test
    public void s2_includesNumTest(){
        assertFalse(vd.hasNum("abcdefgh"));
        assertTrue(vd.hasNum("Summer2018"));
        assertTrue(vd.hasNum("a1b2c3d4ef"));
        assertTrue(vd.hasNum("07734"));
    }

    //check if the password contains a special character
    @Test
    public void s2_specialCharTest(){
        assertTrue(vd.hasSpecial("abc!d"));
        assertTrue(vd.hasSpecial("$#@$%^"));
        assertFalse(vd.hasSpecial("abcdE"));
        assertTrue(vd.hasSpecial("aBcd@"));
    }

    //check if password is 'valid' (i.e. returns true for all above methods)
    @Test
    public void s25_isValidPasswordTest(){
        assertTrue(vd.isValidPassword("Summer2018!"));
        assertFalse(vd.isValidPassword("PassworD1"));
    }

}