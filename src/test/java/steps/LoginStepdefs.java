package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import i2celectronica.ui.PageTransporter;
import i2celectronica.ui.pages.LoginPage;
import org.testng.Assert;

/**
 * @author Josue Rodriguez Garcia.
 * @version 0.0.1
 */
public class LoginStepdefs {
    private LoginPage loginPage;

    @Given("I go the login page")
    public void iGoTheLoginPage() {
        loginPage = PageTransporter.getInstance().goToUrlLogin();
    }

    @When("I fill the form with {string} and {string}")
    public void iFillTheFormWithAnd(String email, String passwd) {
        loginPage.login(email,passwd);
    }

    @Then("Username should appear in the left panel")
    public void usernameShouldAppearInTheLeftPanel() {
        Assert.assertEquals(loginPage.getAccount(), "Josue Rodriguez Garcia","It is not the same name");
        loginPage.quitWindows();
    }
}
