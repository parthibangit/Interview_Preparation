package Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    public static void main(String[] args) throws IOException {
       reader("browserType");
    }

    public static void reader(String keyName) throws IOException {

        File file = new File("./configuration.properties");
        FileInputStream fileInputStream = new FileInputStream(file);
        Properties properties = new Properties();
        properties.load(fileInputStream);
        String value = properties.getProperty(keyName);
        System.out.println(value);

        // Set the  key and value
        FileOutputStream outputStream = new FileOutputStream("./configuration.properties");
        properties.setProperty("dynamicName", "Parthiban");
        String dynValue = properties.getProperty("dynamicName");
        System.out.println(dynValue);
        properties.store(outputStream, "");

    }

}
