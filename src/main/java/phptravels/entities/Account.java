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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(final String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(final String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(final String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(final String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(final String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public void setInformationAccount(final Map<String, String> accountMap) {
        HashMap<String, StrategySetter> strategyMap = composeStrategyMap(accountMap);
        accountMap.keySet().forEach(key -> strategyMap.get(key).executeMethod());
    }

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
