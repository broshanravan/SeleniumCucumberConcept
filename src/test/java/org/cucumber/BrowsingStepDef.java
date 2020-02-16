package org.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java8.En;

public class BrowsingStepDef implements En {


    public BrowsingStepDef() {

        Given("^I am on the home of http://www\\.softpost\\.org$", () -> {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("Given");

            throw new PendingException();

        });

        Then("^I should see that title contaild tutorials$", () -> {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("Brows Tester Then");
            throw new PendingException();
        });

        Given("^I am on the home of http://www\\.google\\.com$", () -> {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("Brows Tester Given");

            throw new PendingException();

        });

        Then("^I should see that title contaild google$", () -> {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("Brows Tester Then");
            throw new PendingException();
        });
    }



}
