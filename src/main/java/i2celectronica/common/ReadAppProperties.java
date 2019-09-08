package i2celectronica.common;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadAppProperties {
    private final String URL_LOGIN = "url_login";
    private final String PROPERTIES_FILE = "i2celectronica.properties";
    private static ReadAppProperties readAppProperties;
    private Properties properties;
    private FileInputStream inputStream;

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
            inputStream = new FileInputStream(PROPERTIES_FILE);
            properties = new Properties();
            properties.load(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
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
     * @return a string with the email.
     */
    public String getUrlLogin() {
        return properties.getProperty(URL_LOGIN);
    }

    /**
     * This method is used for get the email of the user.
     * @return a string with the email.
     */
    public String getProperty(String property) {
        return properties.getProperty(property);
    }
}
