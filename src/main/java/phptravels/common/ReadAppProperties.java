package phptravels.common;

import core.utils.Log;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * This class is used for implement the read og the properties file.
 *
 * @author Josue Rodriguez Garcia.
 * @version 0.0.1
 */
public final class ReadAppProperties {
    private static final String URL_LOGIN = "url_login";
    private static final String PROPERTIES_FILE = "phptravels.properties";
    private static ReadAppProperties readAppProperties;
    private Properties properties;

    /**
     * this method is used for initializes the variables.
     */
    private ReadAppProperties() {
        properties = readConfigurationFile();
    }

    /**
     * This method reads the file 'gradle.properties' ans return its values through the object 'properties'.
     *
     * @return an object 'properties' with wich you can get data from 'gradle.properties'.
     */
    private Properties readConfigurationFile() {
        try {
            FileInputStream inputStream = new FileInputStream(PROPERTIES_FILE);
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
     * @return an instance of 'ReadAppProperties' type.
     */
    public static ReadAppProperties getInstance() {
        if (readAppProperties == null) {
            readAppProperties = new ReadAppProperties();
        }
        return readAppProperties;
    }

    /**
     * This method is used for get the url of login in page.
     *
     * @param url The parameter url defines a input url for chose on properties file.
     * @return a string with the email.
     */
    public String getUrl(final String url) {
        return properties.getProperty(url);
    }

    /**
     * This method is used for get the email of the user.
     *
     * @param property The parameter properties defines a input string for chose on properties file.
     * @return a string with the email.
     */
    public String getProperty(final String property) {
        return properties.getProperty(property);
    }
}
