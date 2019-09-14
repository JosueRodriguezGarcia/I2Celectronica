package core.selenium;

import core.selenium.util.LoadProperties;
import core.selenium.webdrivers.Browsers;
import java.util.Properties;

/**
 * This class reads the gradle.properties file.
 *
 * @author Josue Rodriguez Garcia.
 * @version 0.0.1
 */
public final class WebDriverConfig {
    private static final String PROPERTIES_FILE = "gradle.properties";
    private static WebDriverConfig webDriverConfig;
    private Properties properties;
    private static final String BROWSER = "browser";
    private static final String IMPLICITLY_WAIT_TIME = "implicitly-wait";
    private static final String EXPLICITLY_WAIT_TIME = "explicitly-wait";
    private static final String SLEEP_TIME = "sleep-time";

    /**
     * This is constructor for init variables.
     */
    private WebDriverConfig() {
        initializes();

    }

    /**
     * This method ensure that only one instance is created according to the build pattern.
     *
     * @return an instance of 'WebDriverConfig' type.
     */
    public static WebDriverConfig getInstance() {
        if (webDriverConfig == null) {
            webDriverConfig = new WebDriverConfig();
        }
        return webDriverConfig;
    }

    /**
     * This method reads the file 'gradle.properties' ans return its values through the object 'properties'.
     *
     * @return an object 'properties' with wich you can get data from 'gradle.properties'.
     */
    private void initializes(){
        properties = LoadProperties.readFile(PROPERTIES_FILE);
    }

    /**
     * Gives the browser properties read from 'gradle.properties'.
     *
     * @return a browser.
     */
    public Browsers getBrowser() {
        return Browsers.valueOf(properties.getProperty(BROWSER).toUpperCase());
    }

    /**
     * Gives the implicitly wait properties read from 'gradle.properties'.
     *
     * @return a implicitly wait.
     */
    public long getImplicitlyWaitTime() {
        return Long.parseLong(properties.getProperty(IMPLICITLY_WAIT_TIME));
    }

    /**
     * Gives the explicitly wait properties read from 'gradle.properties'.
     *
     * @return a explicitly wait.
     */
    public long getExplicitlWaitTime() {
        return Long.parseLong(properties.getProperty(EXPLICITLY_WAIT_TIME));
    }

    /**
     * Gives the wait sleep properties read from 'gradle.properties'.
     *
     * @return a explicitly wait.
     */
    public long getSleepWait() {
        return Long.parseLong(properties.getProperty(SLEEP_TIME));
    }
}
