package project_name.ui.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This class implement the logic the test class.
 * @author Josue Rodriguez Garcia
 * @version 0.0.1
 */
public class CalculatorPage {
    private WebDriver driver;
    @FindBy(linkText = "=")
    private WebElement equalButton;
    @FindBy(name = "expr")
    private WebElement exprDisplay;

    /**
     * This method constructor is use for initialize the attributes.
     * @param driver The driver parameter defines the input driver.
     */
    public CalculatorPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    /**
     * This method is used fot get a string.
     * @return a string that represent the result of the calculator.
     */
    public String getExprDisplay(){
        return exprDisplay.getAttribute("value");
    }

    /**
     * This method defines the behavior of element "="
     */
    public void clickEqualButton(){
        equalButton.click();
    }

    /**
     * This method is used for get the result of the display.
     * @return a String with th value of display
     */
    public String getValue() {
        return getExprDisplay();
    }

    /**
     * This method is used for solved the operation.
     * @param operation The operation parameter defines the input operation.
     */
    public void operation(String operation) {
        if (!operation.contains(" ")) {
            for (int index = 0; index < operation.length(); index++) {
                driver.findElement(By.linkText(Character.toString(operation.charAt(index)))).click();
            }
            clickEqualButton();
        } else {
            throw new IllegalArgumentException("Numerical Expression: "+operation + " is Invalid");
        }
    }
}
