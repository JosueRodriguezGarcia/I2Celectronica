package core.selenium;

import core.selenium.webdrivers.Chrome;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {
    private static WebDriverManager webDriverManager;
    private WebDriver webDriver;

    private WebDriverManager(){
        initializes();

    }

    public static WebDriverManager getInstance() {
        if (webDriverManager == null) {
            webDriverManager = new WebDriverManager();
        }
        return webDriverManager;
    }

    private void initializes(){
        switch (WebDriverConfig.getInstance().getBrowser().toUpperCase()) {
            case "CHROME":
                webDriver = new Chrome().initDriver();
                break;

            default:
                throw new RuntimeException("no existe ese navagador");
        }
        this.webDriver.get("https://www.calculadora.org/");
        this.webDriver.manage().window().maximize();
    }

    public WebDriver getWebDriver(){
        return webDriver;
    }
}