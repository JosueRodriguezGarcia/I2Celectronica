package phptravels.ui.pages;

import phptravels.common.ReadAppProperties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * This class is use for implement the login to Page.
 *
 * @author Josue Rodriguez Garcia.
 * @version 0.0.1
 */
public class LoginPage extends BasePage {
    @FindBy(name = "username")
    private WebElement userNameField;

    @FindBy(name = "password")
    private WebElement passWdField;


    @FindBy(css = ".btn-action")
    private WebElement loginButton;

    /**
     * This method is used for fill the fields the page login.
     *
     * @param email  The parameter email defines a email.
     * @param passwd The passwd email defines a password.
     */
    public void login(final String email, final String passwd) {
        setEmailField(ReadAppProperties.getInstance().getProperty(email));
        setPassWdField(ReadAppProperties.getInstance().getProperty(passwd));
        clickLoginButton();
    }

    /**
     * This method is used for set the field email on a page.
     *
     * @param email the email parameter defines a input email.
     */
    private void setEmailField(final String email) {
        userNameField.sendKeys(email);
    }

    /**
     * This method is used for set the field password on a page.
     *
     * @param passwd the email parameter defines a input password.
     */
    private void setPassWdField(final String passwd) {
        passWdField.sendKeys(passwd);
    }

    /**
     * This method is used for click in the button log in.
     */
    private void clickLoginButton() {
        loginButton.click();
    }

    @Override
    protected void waitUntilPageObjectIsLoaded() {

    }
}
