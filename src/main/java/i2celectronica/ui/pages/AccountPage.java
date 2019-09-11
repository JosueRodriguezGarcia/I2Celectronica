package i2celectronica.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * This class is use for implement the account to Page.
 *
 * @author Josue Rodriguez Garcia.
 * @version 0.0.1
 */
public class AccountPage extends BasePage {

    @FindBy(css = ".col-md-6 > .RTL")
    private WebElement textTitle;

    @FindBy(linkText = "My Profile")
    private WebElement myProfileButton;

    @FindBy(name = "firstname")
    private WebElement firstNameField;

    @FindBy(name = "lastname")
    private WebElement lastNameField;

    @FindBy(name = "phone")
    private WebElement phoneField;

    /**
     * This method do click the my profile button.
     */
    public void clickMyProfileButton() {
        myProfileButton.click();
    }

    /**
     * This method get the name of user on account page.
     *
     * @return a String with first name of the user.
     */
    public String getTextFirstName() {
        return firstNameField.getAttribute("value");
    }

    /**
     * This method get the name of user on account page.
     *
     * @return a String with last name of the user.
     */
    public String getTextLastName() {
        return lastNameField.getAttribute("value");
    }

    /**
     * This method get the name of user on account page.
     *
     * @return a String with phone of the user.
     */
    public String getTestPhone() {
        return phoneField.getAttribute("value");
    }

    /**
     * This method get the Title of account page.
     *
     * @return a String with title of the account user.
     */
    public String getTitleHeading() {
        return textTitle.getText();
    }

    /**
     * This method is used for implemented the waits.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        webDriverWait.until(ExpectedConditions.visibilityOf(myProfileButton));
    }
}
