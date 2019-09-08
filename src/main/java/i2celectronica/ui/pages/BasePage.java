package i2celectronica.ui.pages;

import core.selenium.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * This class is used like base of the Page.
 *
 * @author Josue Rodriguez Garcia.
 * @version 0.0.1
 */
public abstract class BasePage {
    protected WebDriver webDriver;

    /**
     * This method is used for initializes a page.
     */
    public BasePage() {
        this.webDriver = WebDriverManager.getInstance().getWebDriver();
        PageFactory.initElements(webDriver, this);
    }
}
