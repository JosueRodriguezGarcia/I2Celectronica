package phptravels.ui.pages;

import phptravels.common.ReadAppProperties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import phptravels.ui.PageTransporter;

/**
 * This class is use for implement the Login to Page.
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

    @FindBy(css = ".btn-block")
    private WebElement loginAdminButton;

    /**
     * This method is used for fill the fields the page Login.
     *
     * @param email  The parameter email defines a email.
     * @param passwd The passwd email defines a PASSWORD.
     */
    public void login(final String email, final String passwd) {
        setEmailField(ReadAppProperties.getInstance().getAppProperties().get(email));
        setPassWdField(ReadAppProperties.getInstance().getAppProperties().get(passwd));
        if(getEmailField().contains("admin")){

        }else{
            clickLoginButton();
        }

    }

    private String getEmailField(){
        return userNameField.getAttribute("value");
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
     * This method is used for set the field PASSWORD on a page.
     *
     * @param passwd the email parameter defines a input PASSWORD.
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

    private void clickLoginAdminButton(){
        loginAdminButton.click();
    }
    @Override
    protected void waitUntilPageObjectIsLoaded() {

    }
}
