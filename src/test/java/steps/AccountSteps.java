package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import phptravels.entities.Context;
import phptravels.ui.pages.AccountPage;

import java.util.Map;

public class AccountSteps {
    private AccountPage accountPage = new AccountPage();
    private Context context;
    @Given("I go My Profile section in Account page")
    public void iGoMyProfileSectionInAccountPage() {
        accountPage.clickMyProfileButton();
    }

    @When("I fill the form with new address in account page")
    public void iFillTheFormWithNewAddressInAccountPage(final Map<String, String> DataTable) {
        //context.getAccount().setInformationAccount(DataTable);
        accountPage.setInformationAccount(DataTable);
        accountPage.clickSubmitButton();
    }

    @Then("The Message (.*) is Display.")
    public void theMessageIsDisplay(String message) {
        Assert.assertEquals(accountPage.getSuccess(), message ,"It is not the same Message");
    }
}
