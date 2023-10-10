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

    public boolean email(String email){
        Pattern pattern = Pattern.compile("^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2})*$");
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()){
            return true;
        }else {
            return false;
        }
    }

    public boolean validMobileNumber(String  mobileNumber){
        Pattern pattern = Pattern.compile("^[9][1]\\s[6-9][0-9]{9}$");
        Matcher matcher = pattern.matcher(mobileNumber);
        if (matcher.matches()){
            return true;
        }else {
            return false;
        }
    }

    public boolean validPasswordAccordingRule1(String  password){
        Pattern pattern = Pattern.compile("^[a-z]{8,}$");
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()){
            return true;
        }else {
            return false;
        }
    }

    public boolean validPasswordAccordingRule2(String  password){
        Pattern pattern = Pattern.compile("\"[a-z]{7,}[A-Z]{1,}\"");
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()){
            return true;
        }else {
            return false;
        }
    }

    public boolean validPasswordAccordingRule3(String  password){
        Pattern pattern = Pattern.compile("\"[a-z]{7,}[A-Z]{1,}[0-9]{1,}\"");
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()){
            return true;
        }else {
            return false;
        }
    }

    public boolean validPasswordAccordingRule4(String  password){
        Pattern pattern = Pattern.compile("\"[a-z]{1,}[A-Z]{1,}[0-9]{1,}[!@#$%^&*]\"");
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()){
            return true;
        }else {
            return false;
        }
    }



}
