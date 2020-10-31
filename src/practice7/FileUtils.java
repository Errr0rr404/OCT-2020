package practice7;

import java.io.*;
import java.util.Properties;

public class FileUtils {

    public static String getPropertyFromFile(String filePath, String key) throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = new FileInputStream(filePath);
        properties.load(inputStream);
        String data = properties.getProperty(key);
        return data;
    }

    public static String getDataFromTextFile(String filePath) throws IOException {
        String tmpContainer;
        String finalText = "";

        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while ((tmpContainer = bufferedReader.readLine()) != null) {
            finalText = finalText + "\n" + tmpContainer;
        }
        return finalText;
    }


    public static void main(String[] args) throws IOException {
        String data = getDataFromTextFile("src/practice7/lib/today.txt");

        System.out.println(data);

    }
}
