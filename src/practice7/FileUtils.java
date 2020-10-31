package practice7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FileUtils {

    public static String getPropertyFromFile(String filePath, String key) throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = new FileInputStream(filePath);
        properties.load(inputStream);
        String data = properties.getProperty(key);
        return data;
    }
}
