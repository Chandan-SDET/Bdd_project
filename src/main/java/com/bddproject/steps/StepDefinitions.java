package com.bddproject.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
//import org.testng.Assert;

public class StepDefinitions {

    private String message;

    @Given("I say {string}")
    public void iSay(String message) {
        System.out.println("The code is in given"+ message);
        this.message = message;
        System.out.println("Just for the git"+ message);
    }

    @Then("I should see {string}")
    public void iShouldSee(String expectedMessage) {
       System.out.println("The code is in then "+ expectedMessage);
        //Assert.assertEquals(this.message, expectedMessage);

    }
}
