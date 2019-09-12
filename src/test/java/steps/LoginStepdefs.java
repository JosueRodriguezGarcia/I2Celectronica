package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import phptravels.ui.pages.AccountPage;
import phptravels.ui.pages.LoginPage;
import org.testng.Assert;


/**
 * This class is used for defines the steps of the scenarios.
 *
 * @author Josue Rodriguez Garcia.
 * @version 0.0.1
 */
public class LoginStepdefs {
    private static LoginPage loginPage = new LoginPage();;

    /**
     * This method is used for set the parameter.
     *
     * @param email  The parameter email defines a emai
     * @param passwd The passwd email defines a password.
     */
    @When("^I fill the form with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iFillTheFormWithAnd(final String email, final String passwd) {
        loginPage.login(email, passwd);
    }

    /**
     * This method is used for do the assertions, and close the page.
     */
    @Then("The Message \"([^\"]*)\" is Display on Account Page")
    public void usernameShouldAppearInTheLeftPanel(String message) {
        AccountPage accountPage = new AccountPage();
        Assert.assertEquals(accountPage.getTitleHeading(), message, "It is not the same Title");
    }
}
