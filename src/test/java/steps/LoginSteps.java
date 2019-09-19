package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import phptravels.ui.PageTransporter;
import phptravels.ui.pages.AccountPage;
import phptravels.ui.pages.LoginPage;

/**
 * LoginSteps class.
 *
 * @author Josue Rodriguez Garcia.
 * @version 0.0.1
 */
public class LoginSteps {
    private static LoginPage loginPage = new LoginPage();

    /**
     * This method configure the pre-requirements.
     *
     * @param endpoint the parameter endpoint defines a input string with the endpoint.
     */
    @Given("I go the (.*) page")
    public void iGoThePage(final String endpoint) {
        PageTransporter.goToUrl(endpoint);
    }

    /**
     * This method is used for set the parameter.
     *
     * @param email  The parameter email defines a emai
     * @param passwd The passwd email defines a PASSWORD.
     */
    @When("I fill the form with (.*) and (.*)")
    public void iFillTheFormWithAnd(final String email, final String passwd) {
        loginPage.login(email, passwd);
    }

    /**
     * This method is used for do the assertions, and close the page.
     * @param message defines a input string with the message.
     */
    @Then("The message (.*) should appear in the page")
    public void theMessageShouldAppearInThePage(final String message) {
        AccountPage accountPage = new AccountPage();
        Assert.assertEquals(accountPage.getTitleHeading(), message, "It is not the same Title");
    }
}
