package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



@FunctionalInterface
interface  LambdaFunction{
  boolean isvalid(String regex,String input);
}

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
        Pattern pattern = Pattern.compile("[a-z]{7,}[A-Z]{1,}[0-9]{1,}");
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()){
            return true;
        }else {
            return false;
        }
    }

    public boolean validPasswordAccordingRule4(String  password){
        Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$");
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()){
            return true;
        }else {
            return false;
        }
    }


    public boolean validEmail(String email){
        Pattern pattern = Pattern.compile("^[a-z]{3}@[a-z]{2,}.[a-z]{3,}$");
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()){
            return true;
        }
         pattern = Pattern.compile("^[a-z]{3}-[0-9]{3}@[a-z]{3,}.[a-z]{2,}$");
        matcher = pattern.matcher(email);
        if (matcher.matches()){
            return true;
        }

        pattern = Pattern.compile("^[a-z]{3}.[0-9]{3}@[a-z]{3,}.[a-z]{2,}$");
        matcher = pattern.matcher(email);
        if (matcher.matches()){
            return true;
        }

         pattern = Pattern.compile("^[a-z0-9]{2,}@[a-z]{3}.[a-z]{2,}$");
         matcher = pattern.matcher(email);
        if (matcher.matches()){
            return true;
        }

         pattern = Pattern.compile("^[a-z]{2,}-[0-9]{2,}@[a-z]{2,}.[a-z]{2,}");
         matcher= pattern.matcher(email);
        if (matcher.matches()){
            return true;
        }

         pattern = Pattern.compile("^[a-z]{3}.[0-9]{3}@[a-z]{3}.[a-z]{3}.[a-z]{2}$");
         matcher = pattern.matcher(email);
        if (matcher.matches()){
            return true;
        }

         pattern = Pattern.compile("^[a-z]{3}@[a-z]{2,}.[a-z]{3}.[a-z]{3}$");
         matcher = pattern.matcher(email);
        if (matcher.matches()){
            return true;
        }

         pattern = Pattern.compile("[a-z]{3,}[+]\\d{2,}@[a-z]{2,}.[a-z]{3,}");
         matcher = pattern.matcher(email);
        if (matcher.matches()){
            return true;
        }

         pattern = Pattern.compile("^[a-z]{2,}@[0-9]{1,}.[a-z]{2,}$");
         matcher = pattern.matcher(email);
        if (matcher.matches()){
            return true;
        }

      return false;
    }


    public static void main(String[] args) {

        LambdaFunction firstName= ( output , input) -> Pattern.matches(output,input);
        System.out.println("FirstName:- "+firstName.isvalid("^[A-Z]+[a-zA-Z]{2,}[0-9]*$","Sanket"));


        LambdaFunction lastName= ( output , input) -> Pattern.matches(output,input);
        System.out.println("LastName:- "+lastName.isvalid("^[A-Z]+[a-zA-Z]{2,}[0-9]*$","Jadhav"));


        LambdaFunction email= ( output , input) -> Pattern.matches(output,input);
        System.out.println("Email:- "+email.isvalid("^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2})*$","sanket@gmail.com"));

        LambdaFunction mobileNumber= ( output , input) -> Pattern.matches(output,input);
        System.out.println("MObile Number:- "+mobileNumber.isvalid("^[9][1]\\s[6-9][0-9]{9}$","91 8451098400"));

        LambdaFunction passoword1= (output,input)-> Pattern.matches(output,input);
        System.out.println("Password Rule 1:- "+passoword1.isvalid("^[a-z]{8,}$","Sanket@9856"));

        LambdaFunction passoword2= (output,input)-> Pattern.matches(output,input);
        System.out.println("Password Rule 2:- "+passoword2.isvalid("[a-z]{7,}[A-Z]{1,}","Sanket@9856"));

        LambdaFunction passoword3= (output,input)-> Pattern.matches(output,input);
        System.out.println("Password Rule 3:- "+passoword3.isvalid("[a-z]{7,}[A-Z]{1,}[0-9]{1,}","Sanket@9856"));

        LambdaFunction passoword4= (output,input)-> Pattern.matches(output,input);
        System.out.println("Password Rule 4:- "+passoword4.isvalid("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$","Sanket@9856"));



    }

}
