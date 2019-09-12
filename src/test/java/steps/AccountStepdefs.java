package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.testng.Assert;
import phptravels.ui.pages.AccountPage;

import java.util.Map;

public class AccountStepdefs {
    AccountPage accountPage =  new AccountPage();
    @Given("I go My Profile section in Account page")
    public void iGoSectionInAccountPage() {
        accountPage.clickMyProfileButton();
    }

    @When("I fill the form with new address in Acconut page")
    public void iFillTheFormWithAndInAcconutPage(final Map<String, String> list) {
        accountPage.fillAddress1Field(list.get("address1"));
        accountPage.fillAddress2Field(list.get("address2"));
        accountPage.fillCityField(list.get("city"));
        accountPage.fillStateField(list.get("state"));
        accountPage.fillZipField(list.get("zip"));
        accountPage.clickSubmitButton();
    }

    @Then("The Message {string} is Display.")
    public void theMessageIsDisplay(String message) {
        Assert.assertEquals(accountPage.getSuccess(), message, "It is not the same Title");
    }
}
