package phptravels.common;

import core.selenium.util.LoadProperties;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * This class is used for implement the read og the properties file.
 *
 * @author Josue Rodriguez Garcia.
 * @version 0.0.1
 */
public class ReadAppProperties {
    private static final String PROPERTIES_FILE = "phptravels.properties";
    private static Map<String, String> mapPropertiesFile;
    private static ReadAppProperties readAppProperties;
    private static Properties properties;

    /**
     * this method is used for initializes the variables.
     */
    private ReadAppProperties() {
        initializes();
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
     * this method is used for initializes the variables.
     */
    private void initializes(){
        mapPropertiesFile = new HashMap<>();
        addPhpTravelProperties();
    }

    /**
     * This method is used to place the data from the property file on a map.
     */
    private void addPhpTravelProperties() {
        properties = LoadProperties.readFile(PROPERTIES_FILE);
        properties.forEach((key, value) -> mapPropertiesFile.put(key.toString(), value.toString()));
    }

    /**
     * This method is used for get a map with properties.
     * @return a Map.
     */
    public Map<String, String> getAppProperties() {
        return mapPropertiesFile;
    }
}
