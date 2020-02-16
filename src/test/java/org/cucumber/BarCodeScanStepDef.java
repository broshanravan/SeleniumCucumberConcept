package org.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class BarCodeScanStepDef {

    WebDriver driver;
    Checkout checkout = Checkout.getInstance();
    GroceryItem groceryItem = null;
    String barCode = null;

    @Given("^customer scant the bar code$")
    public void customerScantTheBarCode() throws Throwable {
        groceryItem = checkout.getItem(barCode);
    }

    @When("^bar code is valid$")
    public void barCodeIsValid() throws Throwable {
        barCode = "1234";
    }

    @Then("^the system will display goods details$")
    public void theSystemWillDisplayGoodsDetails() throws Throwable {
        System.out.println("In valid Bar code Testing");

       assert "apple".equalsIgnoreCase(groceryItem.getName());
    }

    @When("^bar code is not valid$")
    public void barCodeIsNotValid() throws Throwable {
        barCode = "1234";
    }

    @Then("^the system will indicates an error$")
    public void theSystemWillIndicatesAnError() throws Throwable {
        System.out.println("In invalid Bar code Testing");
        assert (groceryItem == null);
    }
}
