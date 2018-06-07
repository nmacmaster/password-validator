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
    public void s1_isNotPassword(){
       assertFalse(vd.notPassword("password"));
    }

    @Test
    public void s1_length8(){
        assertTrue(vd.validLength("abc12345"));
    }

}