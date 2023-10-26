package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


public class userregistrationTest {

    UserRegistration userRegistration = new UserRegistration();
    @ParameterizedTest
    @ValueSource(strings ={
            "abc-100@yahoo.com",
            "abc.100@yahoo.com",
            "abc111@abc.com",
            "abc-100@abc.net",
            "abc.100@abc.com.au",
            "abc@1.com" ,
            "abc@gmail.com.com",
            "abc+100@gmail.com"})

    void testEmailValidation(String emailAdd) {
        boolean isValid = userRegistration.validEmail(emailAdd);
        Assertions.assertTrue(isValid);
    }

//    void testEmailValidation(String emailAdd,boolean excepted) {
//        boolean isValid = userRegistration.validEmail(emailAdd);
//        Assertions.assertEquals(excepted,isValid);
//    }


    @ParameterizedTest
    @CsvSource({"abc","abc@.com.my","abc123@gmail.a","abc123@.com","abc123@.com.com",
    ".abc@abc.com","abc()*@gmail.com","abc@%*.com","abc..2002@gmail.com","abc..2002@gmail.com",
    "abc@abc@gmail.com","abc@gmail.com.1a","abc@gmail.com.aa.au"})

    void testInvalidEmail(String email){
        boolean isInvalid=userRegistration.validEmail(email);
        Assertions.assertFalse(isInvalid);
    }


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

}
