package phptravels.entities;

import core.StrategySetter;

import java.util.HashMap;
import java.util.Map;

import static phptravels.keys.AccountKeys.ADDRESS_1;
import static phptravels.keys.AccountKeys.ADDRESS_2;
import static phptravels.keys.AccountKeys.CITY;
import static phptravels.keys.AccountKeys.COUNTRY;
import static phptravels.keys.AccountKeys.STATE;
import static phptravels.keys.AccountKeys.ZIP;

/**
 * Account class.
 *
 * @author Josue Rodriguez Garcia.
 * @version 0.0.1
 */
public class Account {
    private String firstName;
    private String lastName;
    private String phone;

    private String email;
    private String password;
    private String confirmPassword;

    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zip;
    private String country;

    /**
     * This method is used for get the first name.
     * @return a string with the first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This methos is used for set the first name.
     * @param firstName The parameter defines a input string with the first name.
     */
    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    /**
     * This methos is used for get the last name.
     *
     * @return a string with the last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * this metohd is used for set the last name.
     *
     * @param lastName The parameter lastName defines a input string with the last name.
     */
    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    /**
     * This method is used for get the phone.
     *
     * @return a string with the phone.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method is used for set the phone.
     *
     * @param phone The parameter phone defines a input string with the phone.
     */
    public void setPhone(final String phone) {
        this.phone = phone;
    }

    /**
     * This methos is used for get the email.
     *
     * @return a string with the email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method is used for sets the email.
     *
     * @param email The parameter email defines an imput string with the email.
     */
    public void setEmail(final String email) {
        this.email = email;
    }

    /**
     * This method is used for get the password.
     *
     * @return a string with the password.
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method is used for sets the password.
     *
     * @param password the parameter password defines a input string with the password.
     */
    public void setPassword(final String password) {
        this.password = password;
    }

    /**
     * This methos is used for get the confirm paswword.
     *
     * @return a string with the confirm password.
     */
    public String getConfirmPassword() {
        return confirmPassword;
    }

    /**
     * This methos is used for set the confirm password.
     *
     * @param confirmPassword the parameter defines a input string with the password.
     */
    public void setConfirmPassword(final String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    /**
     * This method  is used for get the address.
     *
     * @return a string with the address.
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * This method is used for set address.
     *
     * @param address1 the parameters address1 defienes a input string with the address.
     */
    public void setAddress1(final String address1) {
        this.address1 = address1;
    }

    /**
     * This method is used for get the address2.
     *
     * @return a string with the address2.
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * This method is used for set address2.
     *
     * @param address2 the parameter address define a input string with address.
     */
    public void setAddress2(final String address2) {
        this.address2 = address2;
    }

    /**
     * This method is used for get the city.
     *
     * @return a strig with the city.
     */
    public String getCity() {
        return city;
    }

    /**
     * This method is used for set the city.
     *
     * @param city defiens a input string with the city.
     */
    public void setCity(final String city) {
        this.city = city;
    }

    /**
     * this method is used got set the state.
     *
     * @return a string with the state.
     */
    public String getState() {
        return state;
    }

    /**
     * This method is used for set the state.
     *
     * @param state defines a input string with the state.
     */
    public void setState(final String state) {
        this.state = state;
    }

    /**
     * This methos is used for get the zip.
     *
     * @return a string with the zip.
     */
    public String getZip() {
        return zip;
    }

    /**
     * This method is used for set the zip.
     *
     * @param zip defines a input with the zip.
     */
    public void setZip(final String zip) {
        this.zip = zip;
    }

    /**
     * This methos is used for get the country.
     *
     * @return a string with the country.
     */
    public String getCountry() {
        return country;
    }

    /**
     * This method is used for set country field.
     *
     * @param country the parameter country defines a input string with the country.
     */
    public void setCountry(final String country) {
        this.country = country;
    }

    /**
     * This method is used for set the information from a map.
     *
     * @param accountMap the parameters accountMaps defines a input map with the infoamtion.
     */
    public void setInformationAccount(final Map<String, String> accountMap) {
        HashMap<String, StrategySetter> strategyMap = composeStrategyMap(accountMap);
        accountMap.keySet().forEach(key -> strategyMap.get(key).executeMethod());
    }

    /**
     * Thi method is used for set the field with tjeh information of the map.
     *
     * @param accountMap the parameter accountMap defines a input map with the information.
     *
     * @return a map.
     */
    private HashMap<String, StrategySetter> composeStrategyMap(final Map<String, String> accountMap) {
        HashMap<String, StrategySetter> strategyMap = new HashMap<>();
        strategyMap.put(ADDRESS_1, () -> setAddress1(accountMap.get(ADDRESS_1)));
        strategyMap.put(ADDRESS_2, () -> setAddress2(accountMap.get(ADDRESS_2)));
        strategyMap.put(CITY, () -> setCity(accountMap.get(CITY)));
        strategyMap.put(STATE, () -> setState(accountMap.get(STATE)));
        strategyMap.put(ZIP, () -> setZip(accountMap.get(ZIP)));
        strategyMap.put(COUNTRY, () -> setCountry(accountMap.get(COUNTRY)));
        return strategyMap;
    }
}
