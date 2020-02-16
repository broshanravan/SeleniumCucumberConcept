package org.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java8.En;

public class LoginStepDef implements En{


    @Given("^user inserts username$")
    public void userInsertsUsername() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }

    @And("^user inserts password$")
    public void userInsertsPassword() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @And("^users clicks log in button$")
    public void usersClicksLogInButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }

    @When("^username and password are valid$")
    public void usernameAndPasswordAreValid() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^the login should be successful$")
    public void theLoginShouldBeSuccessful() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^username or password are invalid$")
    public void usernameOrPasswordAreInvalid() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^the login should be unsuccessful$")
    public void theLoginShouldBeUnsuccessful() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

}
