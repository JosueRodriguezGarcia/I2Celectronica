package phptravels.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

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

//Your Address
    @FindBy(name = "address1")
    private WebElement address1;

    @FindBy(name = "address2")
    private WebElement address2;

    @FindBy(name = "city")
    private WebElement city;

    @FindBy(name = "state")
    private WebElement state;

    @FindBy(name = "zip")
    private WebElement zip;

    @FindBy(name = "country")
    private WebElement country;

    @FindBy(css = ".updateprofile")
    private WebElement submit;

    @FindBy(css = ".alert-success")
    private WebElement success;


    public void fillAddress1Field(final String address){
        this.address1.clear();
        this.address1.sendKeys(address);
    }

    public void fillAddress2Field(final String address){
        this.address2.clear();
        this.address2.sendKeys(address);
    }

    public void fillCityField(final String city){
        this.city.clear();
        this.city.sendKeys(city);
    }

    public void fillStateField(final String state){
        this.state.clear();
        this.state.sendKeys(state);
    }
    public void fillZipField(final String zip){
        this.zip.clear();
        this.zip.sendKeys(zip);
    }

    public void clickSubmitButton(){
        this.submit.click();
    }

    public String getSuccess(){
        return this.success.getText();
    }

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
