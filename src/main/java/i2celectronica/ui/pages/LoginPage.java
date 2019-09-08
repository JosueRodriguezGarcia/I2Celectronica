package i2celectronica.ui.pages;

import i2celectronica.common.ReadAppProperties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * This class is use for implement the login to Page.
 *
 * @author Josue Rodriguez Garcia.
 * @version 0.0.1
 */
public class LoginPage extends BasePage {
    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "passwd")
    private WebElement passWdField;

    @FindBy(css = "#SubmitLogin > span")
    private WebElement submitLoginButton;

    @FindBy(css = ".account > span")
    private WebElement account;

    public void login(String email, String passwd) {
        setEmailField(ReadAppProperties.getInstance().getProperty(email));
        setPassWdField(ReadAppProperties.getInstance().getProperty(passwd));
        clickSubmitLoginButton();
    }

    /**
     * This method is used for set the field email on a page.
     * @param email
     */
    public void setEmailField(String email) {
        emailField.sendKeys(email);
    }

    public void setPassWdField(String passwd) {
        passWdField.sendKeys(passwd);
    }

    public WebElement getSubmitLoginButton() {
        return submitLoginButton;
    }

    public void clickSubmitLoginButton() {
        submitLoginButton.click();
    }

    public String getAccount() {
        return account.getText();
    }

    public void quitWindows() {
        webDriver.quit();
    }
}
