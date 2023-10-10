package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public boolean Fname(String name){
        Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches()){
          return true;
        }else {
            return false;
        }
    }

    public boolean Lname(String name){
        Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches()){
            return true;
        }else {
            return false;
        }
    }

}
