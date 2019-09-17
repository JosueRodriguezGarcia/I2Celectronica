package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import phptravels.entities.Context;
import phptravels.ui.pages.AccountPage;

import java.util.Map;

/**
 * AccountSteps class.
 *
 * @author Josue Rodriguez Garcia.
 * @version 0.0.1
 */
public class AccountSteps {
    private AccountPage accountPage = new AccountPage();
    private Context context = new Context();

    /**
     * This method is used to go to account page.
     */
    @Given("I go My Profile section in Account page")
    public void iGoMyProfileSectionInAccountPage() {
        accountPage.clickMyProfileButton();
    }

    /**
     * This methos is used for get into a data table.
     *
     * @param dataTable defines a input data table in way the map.
     */
    @When("I fill the form with new address in account page")
    public void iFillTheFormWithNewAddressInAccountPage(final Map<String, String> dataTable) {
        context.getAccount().setInformationAccount(dataTable);
        accountPage.setInformationAccount(dataTable);
        accountPage.clickSubmitButton();
    }

    /**
     * This method is used for verify the message.
     *
     * @param message defines the message that want compare.
     */
    @Then("The Message (.*) is Display.")
    public void theMessageIsDisplay(final String message) {
        Assert.assertEquals(accountPage.getSuccess(), message, "It is not the same Message");
    }
}
