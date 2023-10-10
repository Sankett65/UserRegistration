package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class userregistrationTest {

    UserRegistration userRegistration = new UserRegistration();

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
