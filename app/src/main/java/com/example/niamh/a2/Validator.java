package com.example.niamh.a2;

public class Validator {

    //check if password is 'password' (case insensitive)
    //not 'password', return true, else return false
    public boolean notPassword(String pass){
        return !((pass.toLowerCase()).equals("password")) ? true : false;
    }

    //if password length >= 8 return true, else return false
    public boolean validLength(String pass){
        return pass.length() >= 8 ? true : false;
    }

    //check if password contains multiple cases
    public boolean multipleCases(String pass){
        /*
        if password does not equal its all lowercase nor all uppercase version,
        then the string contains a mix of upper and lower cases
        */
        return (!pass.equals(pass.toLowerCase())&&(!pass.equals(pass.toUpperCase())))?true:false;
    }

    //check if the password contains an integer
    public boolean hasNum(String pass){
        return(pass.matches(".*\\d+.*"))?true:false;
    }

    //check if the password contains a special character
    public boolean hasSpecial(String pass){
        return(pass.matches(".*[!@#$%^&*()].*"))?true:false;
    }

    //check if password is 'valid' (i.e. returns true for all above methods)
    public boolean isValidPassword(String pass){
        return (notPassword(pass)&&validLength(pass)&&multipleCases(pass)&&hasNum(pass)&&hasSpecial(pass))?true:false;
    }
}
