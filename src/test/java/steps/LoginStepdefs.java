package steps;


import i2celectronica.ui.PageTransporter;
import i2celectronica.ui.pages.AccountPage;
import i2celectronica.ui.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

/**
 * This class is used for defines the steps of the scenarios.
 *
 * @author Josue Rodriguez Garcia.
 * @version 0.0.1
 */
public class LoginStepdefs {
    private LoginPage loginPage;

    /**
     * This method configure the pre-requirements.
     */
    @Given("I go the login page")
    public void iGoTheLoginPage() {
        loginPage = PageTransporter.getInstance().goToUrlLogin();
    }

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
     * This method is uses for do the assertions, and close the page.
     */
    @Then("My Account should appear in the title of the page")
    public void usernameShouldAppearInTheLeftPanel() {
        AccountPage accountPage = new AccountPage();
        Assert.assertEquals(accountPage.getTextPageHeading(), "MI CUENTA", "It is not the same Title");
    }


}
