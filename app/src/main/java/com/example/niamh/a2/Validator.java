package com.example.niamh.a2;

public class Validator {

    public boolean notPassword(String pass){
        return (pass.toLowerCase()).equals("password") ? false : true;
    }

    public boolean validLength(String pass){
        return pass.length() >= 8 ? true : false;
    }

    public boolean multipleCases(String pass){
        /*
        if password does not equal its all lowercase nor all uppercase version,
        then the string contains a mix of upper and lower cases
        */
        return (!pass.equals(pass.toLowerCase())&&(!pass.equals(pass.toUpperCase())))?true:false;
    }

    public boolean hasNum(String pass){
        return(pass.matches(".*\\d+.*"))?true:false;
    }

    public boolean hasSpecial(String pass){
        return(pass.matches(".*[!@#$%^&*()].*"))?true:false;
    }
}
