package core.selenium;

import org.junit.Test;

import static org.junit.Assert.*;

public class WebDriverConfigTest {

    @Test
    public void getBrowser() {
        System.out.println(WebDriverConfig.getInstance().getBrowser());
        System.out.println(WebDriverConfig.getInstance().getProperties());
    }
}