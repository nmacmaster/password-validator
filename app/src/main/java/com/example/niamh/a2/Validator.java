package com.example.niamh.a2;

public class Validator {

    public boolean notPassword(String pass){
        return pass.equals("password") ? false : true;
    }

    public boolean validLength(String pass){
        return pass.length() >= 8 ? true : false;
    }
}
