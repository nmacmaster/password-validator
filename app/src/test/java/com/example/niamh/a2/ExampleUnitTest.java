package com.example.niamh.a2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    Validator vd = new Validator();

    @Test
    public void s1_isPasswordTest(){
       assertFalse(vd.notPassword("password"));
       assertFalse(vd.notPassword("passworD"));
       assertTrue(vd.notPassword("notpassword"));
    }

    @Test
    public void s1_length8Test(){
        assertTrue(vd.validLength("abc12345"));
        assertFalse(vd.validLength("abc123"));
        assertFalse(vd.validLength("x"));
    }

    @Test
    public void s2_casesTest(){
        assertTrue(vd.multipleCases("aBcdEF1"));
        assertTrue(vd.multipleCases("AcbDfe"));
        assertFalse(vd.multipleCases("abcdef1"));
    }

    @Test
    public void s2_includesNumTest(){
        assertFalse(vd.hasNum("abcdefgh"));
        assertTrue(vd.hasNum("Summer2018"));
        assertTrue(vd.hasNum("a1b2c3d4ef"));
        assertTrue(vd.hasNum("07734"));
    }

    @Test
    public void s2_specialCharTest(){
        assertTrue(vd.hasSpecial("abc!d"));
        assertTrue(vd.hasSpecial("$#@$%^"));
        assertFalse(vd.hasSpecial("abcdE"));
        assertTrue(vd.hasSpecial("aBcd@"));
    }

}