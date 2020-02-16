package org.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java8.En;

public class FindEmployeeStepDef implements En {

    public FindEmployeeStepDef() {

        /*****************************************************Invalid Username********************************************************/
        Given("^users clicks search button$", () -> {
            // Write code here that turns the phrase above into concrete actions

        });

        When("^username is not valid$", () -> {
            // Write code here that turns the phrase above into concrete actions

        });


        Then("^Display an error message$", () -> {
            // Write code here that turns the phrase above into concrete actions

        });

        /***************************************************** Valid Username********************************************************/


        When("^username is valid$", () -> {
            // Write code here that turns the phrase above into concrete actions

        });

        Then("^employee details are displayed$", () -> {
            // Write code here that turns the phrase above into concrete actions

        });








    }
}
