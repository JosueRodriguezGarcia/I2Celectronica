package core.selenium;

import core.selenium.webdrivers.Browsers;
import core.utils.Log;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * This class reads the gradle.properties file.
 *
 * @author Josue Rodriguez Garcia.
 * @version 0.0.1
 */
public final class WebDriverConfig {
    private static WebDriverConfig webDriverConfig;
    private Properties properties;
//    private FileInputStream inputStream;
    private static final String BROWSER = "browser";
    private static final String IMPLICITLY_WAIT = "implicitly_wait";
    private static final String EXPLICITLY_WAIT = "explicitly_wait";
    private static final String URL_BASE = "url_base";

    /**
     * This is constructor for init variables.
     */
    private WebDriverConfig() {
        properties = readConfigurationFile();
    }

    /**
     * This method reads the file 'gradle.properties' ans return its values through the object 'properties'.
     *
     * @return an object 'properties' with wich you can get data from 'gradle.properties'.
     */
    private Properties readConfigurationFile() {
        try {
            FileInputStream inputStream = new FileInputStream("gradle.properties");
            properties = new Properties();
            properties.load(inputStream);
        } catch (IOException e) {
            Log.getInstance().getLog().error(e);
        }
        return properties;
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
     * Gives the browser properties read from 'gradle.properties'.
     *
     * @return a browser.
     */
    public Browsers getBrowser() {
        return Browsers.valueOf(properties.getProperty(BROWSER).toUpperCase());
    }

    /**
     * Gives the browser properties read from 'gradle.properties'.
     *
     * @return a implicitly wait.
     */
    public long getImplicitlyWait() {
        return Long.parseLong(properties.getProperty(IMPLICITLY_WAIT));
    }

    /**
     * Gives the browser properties read from 'gradle.properties'.
     *
     * @return a explicitly wait.
     */
    public long getExplicitlWait() {
        return Long.parseLong(properties.getProperty(EXPLICITLY_WAIT));
    }

    /**
     * Gives the browser properties read from 'gradle.properties'.
     *
     * @return the url base.
     */
    public String getUrl() {
        return properties.getProperty(URL_BASE);
    }
}
