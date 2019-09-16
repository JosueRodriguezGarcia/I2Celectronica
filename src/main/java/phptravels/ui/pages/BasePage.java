package phptravels.ui.pages;

import core.selenium.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This class is used like base of the Page.
 *
 * @author Josue Rodriguez Garcia.
 * @version 0.0.1
 */
public abstract class BasePage {
    @FindBy(css = ".nav:nth-child(1) > li:nth-child(1) > .dropdown-toggle")
    private WebElement body;
    @FindBy(linkText = "Logout")
    private WebElement logout;

    protected WebDriver webDriver;
    protected WebDriverWait webDriverWait;


    /**
     * This method is used for initializes a page.
     */
    public BasePage() {
        this.webDriver = WebDriverManager.getInstance().getWebDriver();
        this.webDriverWait = WebDriverManager.getInstance().getWebDriverWait();
        PageFactory.initElements(webDriver, this);
        waitUntilPageObjectIsLoaded();
    }

    /**
     * This method is used for apply the waits.
     */
    protected abstract void waitUntilPageObjectIsLoaded();
    /**
     * This method is used for closed the browser.
     */
    public void quitWindows() {
        webDriver.quit();
    }

    /**
     * This method is used for closed the browser.
     */
    public void closeWindows() {
        webDriver.close();
    }

    public void clickLogout(){
        logout.click();
    }
    public void clickBody(){
        body.click();
    }

}
