package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class userregistrationTest {
    UserRegistration userRegistration = new UserRegistration();
    @ParameterizedTest
    @CsvSource({
            "abc@yahoo.com,true",
            "abc-100@yahoo.com,false",
            "abc.100@yahoo.com,false",
            "abc111@abc.com,false",
            "abc-100@abc.net,false",
            "abc.100@abc.com.au,false",
            "abc@1.com,false" ,
            "abc@gmail.com.com,false",
            "abc+100@gmail.com,false"})


    void testEmailValidation(String emailAddress, boolean expected) {
        boolean isValid = userRegistration.email(emailAddress);
       Assertions.assertTrue(isValid == expected, "Expected: " + expected + ", Actual: " + isValid);
    }

//
//
    @Test
    public void toSeeTheFirstNameIsValid(){
        Assertions.assertTrue(userRegistration.Fname("Sanket"));
    }

    @Test
    public void toSeeTheLastNameIsValid(){
        Assertions.assertTrue(userRegistration.Lname("Jadhav"));
    }

    @Test
    public void toSeeTheEmailIsValid(){
        Assertions.assertTrue(userRegistration.email("sanket@gmail.com"));
    }

    @Test
    public void toSeeTheMobileNumberIsValid(){
        Assertions.assertTrue(userRegistration.validMobileNumber("91 8451098400"));
    }


    @Test
    public void toSeeThePasswordIsValid(){
        Assertions.assertTrue(userRegistration.validPasswordAccordingRule4("Sanket@123"));
    }



//    @ParameterizedTest
//    @CsvSource({"abc@yahoo.com,true","abc-100@yahoo.com,false","abc.100@yahoo.com,false","abc111@abc.com,false","abc-100@abc.net,false","abc.100@abc.com.au,false","abc@1.com,false" ,"abc@gmail.com.com,false","abc+100@gmail.com,false"})
}
