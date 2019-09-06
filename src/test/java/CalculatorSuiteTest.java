import core.selenium.WebDriverManager;
import org.junit.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import project_name.ui.pages.CalculatorPage;

/**
 * This class is uses for testing the Cacculadora.org page.
 * @author Josue Rodriguez Garcia.
 * @version 0.0.1
 */
public class CalculatorSuiteTest {
    private static WebDriver driver;
    CalculatorPage calculator;

    /**
     * This method initializes each time that is execute a test.
     */
    @Before
    public void setUp() {
        driver = WebDriverManager.getInstance().getWebDriver();
        calculator = new CalculatorPage(driver);
    }

    /**
     * This method is used for close the page when the test finalizes.
     */
    @AfterClass
    public static void tearDown() {
//        driver.findElement(By.linkText("expr")).clear();
        driver.quit();
    }

    @After
    public void clean() {
        driver.findElement(By.linkText("C")).click();
    }
    /**
     * This method testing the operation of addition of two numbers with one digit.
     */
    @Test
    public void addition() {
        calculator.operation("5+3");
        assertThat(calculator.getValue(), is("8"));

    }

    /***
     * This method testing the operation od addition od two numbers with more of one digit.
     */
    @Test
    public void additionWithNumberLongs() {
        calculator.operation("234+145");
        assertThat(calculator.getValue(), is("379"));

    }

    /**
     * This method testing the operation of division.
     */
    @Test
    public void division() {
        calculator.operation("21÷3");
        assertThat(calculator.getValue(), is("7"));
    }

    /**
     * This method testing the operation of multiplication.
     */
    @Test
    public void multiplication() {
        calculator.operation("4×9");
        assertThat(calculator.getValue(), is("36"));
    }

    /**
     * This method testing the operation of subtraction
     */
    @Test
    public void subtraction() {
        calculator.operation("7-2");
        assertThat(calculator.getValue(), is("5"));
    }

    /**
     * This method testing the operation the division between Zero.
     */
    @Test
    public void divisionBetweenZero() {
        calculator.operation("7÷0");
        assertThat(calculator.getValue(), is("Infinity"));
    }

    /**
     * This method testing the operation the division od zero between other number.
     */
    @Test
    public void zeroBetweenNumber() {
        calculator.operation("0÷7");
        assertThat(calculator.getValue(), is("0"));
    }

    /**
     * This method testing that not exit space in white in the operation.
     */
    @Test(expected = IllegalArgumentException.class)
    public void operationWithSpace() {
        calculator.operation("10 +7");
    }
}
