package core.selenium.util;

import core.utils.Log;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * This class is used for load the properties from a properties file.
 *
 * @version 0.0.1
 * @Autor Josue Rodriguez Garcia.
 */
public class LoadProperties {
    /**
     * This method is used for load a properties file.
     *
     * @param path The parameter path defines a input path.
     * @return a properties.
     */
    public static Properties readFile(final String path) {
        Properties properties = new Properties();
        try {
            Log.getInstance().getLog().info("Load file properties!!");
            InputStream inputStream = new FileInputStream(path);
            properties.load(inputStream);
        } catch (IOException e) {
            Log.getInstance().getLog().error(e);
            throw new RuntimeException(e);
        }
        return properties;
    }
}
