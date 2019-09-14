package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import phptravels.ui.pages.AccountPage;

import java.util.Map;

public class AccountSteps {
    AccountPage accountPage = new AccountPage();
    @Given("I go My Profile section in Account page")
    public void iGoMyProfileSectionInAccountPage() {
        accountPage.clickMyProfileButton();
    }

    @When("I fill the form with new address in account page")
    public void iFillTheFormWithNewAddressInAcconutPage(final Map<String, String> DataTable) {
        accountPage.fillAddress1Field(DataTable.get("address1"));
        accountPage.fillAddress2Field(DataTable.get("address2"));
        accountPage.fillCityField(DataTable.get("city"));
        accountPage.fillStateField(DataTable.get("state"));
        accountPage.fillZipField(DataTable.get("zip"));
        accountPage.clickSubmitButton();
    }

    @Then("The Message (.*) is Display.")
    public void theMessageIsDisplay(String message) {
        Assert.assertEquals(accountPage.getSuccess(), message ,"It is not the same Message");
    }
}
