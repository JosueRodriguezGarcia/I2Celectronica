package i2celectronica.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * This class is use for implement the account to Page.
 *
 * @author Josue Rodriguez Garcia.
 * @version 0.0.1
 */
public class AccountPage extends BasePage {
    @FindBy(css = ".page-heading")
    private WebElement account;

    /**
     * This method get the name of user on account page.
     *
     * @return a String with name the user.
     */
    public String getTextPageHeading() {
        return account.getText();
    }
}
