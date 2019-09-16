package core.selenium.util;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This class is used for operations.
 *
 * @author Josue Rodriguez Garcia.
 * @version 0.0.1
 */
public final class DriverMethod {
    /**
     * Constructor private.
     */
    private DriverMethod() { }

    /**
     * Sets the text into the webElement.
     *
     * @param webElement that sets its text.
     * @param text new value of webElement.
     */
    public static void setTxt(final WebElement webElement, final String text) {
        webElement.clear();
        webElement.sendKeys(text);
    }

    /**
     * Selects an option from combo-box sending the element and the text to select the option.
     *
     * @param webElement for the combo-box.
     * @param option to select from combo-box.
     */
    public static void selectOptionFromComboBox(final WebElement webElement, final String option) {
        final Select selectType = new Select(webElement);
        selectType.selectByVisibleText(option);
    }

    /**
     * Waits until that web element is Clickable.
     *
     * @param driver     it is the manager of get UI page.
     * @param webElement is for verifies if it is clickable.
     */
    public static void waitUntilElementIsClickable(final WebDriver driver, final WebElement webElement) {
        int index = 0;
        boolean isClickable = false;
        do {
            try {
                final WebDriverWait wait = new WebDriverWait(driver, 10);
                isClickable = wait.until(ExpectedConditions.elementToBeClickable(webElement)) != null;
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (!isClickable && index++ < 3);
    }
}
