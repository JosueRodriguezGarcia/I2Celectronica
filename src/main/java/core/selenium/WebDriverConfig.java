package core.selenium;

import org.omg.CORBA.portable.InputStream;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * This class reads the gradle.properties file.
 *
 * @author Josue Rodriguez Garcia.
 * @version 0.0.1
 */
public class WebDriverConfig {
    private static WebDriverConfig webDriverConfig;
    private Properties properties;
    private FileInputStream inputStream;

    /**
     * This is constructor for init variables.
     */
    private WebDriverConfig() {
        properties = readConfigurationFile();
    }

    /**
     * This method reads the file 'gradle.properties' ans return its values through the object 'properties'.
     * @return an object 'properties' with wich you can get data from 'gradle.properties'.
     */
    private Properties readConfigurationFile() {
        try {
            inputStream = new FileInputStream("gradle.properties");
            properties = new Properties();
            properties.load(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return properties;
    }

    /**
     * this method ensure that only one instance is created according to the build pattern.
     * @return an instance of 'WebDriverConfig' type.
     */
    public static WebDriverConfig getInstance() {
        if (webDriverConfig == null) {
            webDriverConfig = new WebDriverConfig();
        }
        return webDriverConfig;
    }

    /**
     * Gives the properties read from gradle.properties file.
     * @return properties.
     */
    public Properties getProperties() {
        return properties;
    }

    /**
     * Gives the browser properties read from 'gradle.properties'
     * @return browser.
     */
    public String getBrowser() {
        return properties.getProperty("browser");
    }
}
