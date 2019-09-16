package phptravels.ui.pages;

import core.StrategySetter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.HashMap;
import java.util.Map;

import static phptravels.keys.AccountKeys.ADDRESS_1;
import static phptravels.keys.AccountKeys.ADDRESS_2;
import static phptravels.keys.AccountKeys.CITY;
import static phptravels.keys.AccountKeys.COUNTRY;
import static phptravels.keys.AccountKeys.STATE;
import static phptravels.keys.AccountKeys.ZIP;

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
    private WebElement selectCountry;

    @FindBy(xpath = "//option[.='Bolivia']")
    private WebElement country;

    @FindBy(css = ".updateprofile")
    private WebElement submitButton;

    @FindBy(css = ".alert-success")
    private WebElement success;

    /**
     * This method is used for fill the address1 field on form.
     *
     * @param address1 The parameter address1 defines a input address.
     */
    public void fillAddress1Field(final String address1) {
        this.address1.clear();
        this.address1.sendKeys(address1);
    }

    /**
     * This method is used for fill the address2 field on form.
     *
     * @param address2 The parameter address1 defines a input address.
     */
    public void fillAddress2Field(final String address2) {
        this.address2.clear();
        this.address2.sendKeys(address2);
    }

    /**
     * This method is used for fill the city field on form.
     *
     * @param city The parameter city defines a input city.
     */
    public void fillCityField(final String city) {
        this.city.clear();
        this.city.sendKeys(city);
    }

    /**
     * This method is used for fill the state field on form.
     *
     * @param state The parameter state defines a input string with state.
     */
    public void fillStateField(final String state) {
        this.state.clear();
        this.state.sendKeys(state);
    }

    /**
     * This method is used for fill the zip field on form.
     *
     * @param zip The parameter zip defines a input string with zip.
     */
    public void fillZipField(final String zip) {
        this.zip.clear();
        this.zip.sendKeys(zip);
    }

    /**
     * This method is used for fill the country field on form.
     *
     * @param country The parameter country defines a input string with country.
     */
    public void selectCountry(final String country) {
        this.country.click();
    }

    /**
     * This method is used for do click on submit button.
     */
    public void clickSubmitButton() {
        this.submitButton.click();
    }

    /**
     * This method is used for get message the success.
     *
     * @return a String with the message.
     */
    public String getSuccess() {
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

    /**
     * This method is used for catch the data table.
     *
     * @param accountMap The parameter accountMap defines a input map.
     */
    public void setInformationAccount(final Map<String, String> accountMap) {
        HashMap<String, StrategySetter> strategyMap = composeStrategyMap(accountMap);
        accountMap.keySet().forEach(key -> strategyMap.get(key).executeMethod());
    }

    /**
     * This method is used for sets the field the form.
     *
     * @param accountMap The parameter accountMap defines a input map.
     * @return a Map.
     */
    private HashMap<String, StrategySetter> composeStrategyMap(final Map<String, String> accountMap) {
        HashMap<String, StrategySetter> strategyMap = new HashMap<>();
        strategyMap.put(ADDRESS_1, () -> fillAddress1Field(accountMap.get(ADDRESS_1)));
        strategyMap.put(ADDRESS_2, () -> fillAddress2Field(accountMap.get(ADDRESS_2)));
        strategyMap.put(CITY, () -> fillCityField(accountMap.get(CITY)));
        strategyMap.put(STATE, () -> fillStateField(accountMap.get(STATE)));
        strategyMap.put(ZIP, () -> fillZipField(accountMap.get(ZIP)));
        strategyMap.put(COUNTRY, () -> selectCountry(accountMap.get(COUNTRY)));
        return strategyMap;
    }
}
