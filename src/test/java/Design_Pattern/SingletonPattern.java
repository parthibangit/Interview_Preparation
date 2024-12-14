package Design_Pattern;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SingletonPattern {

    /*
    * Tips to remember:
    * i) constructor should be private - So that we cannot create object for this class from other class.
    * ii) Should be declared private static instance for current class.
    * iii) Should have static method and it should return the object of singleton class.
    * */

    private static SingletonPattern singletonPattern = null;
    private static final FileInputStream fileInputStream;
    private static final Properties properties;

    private SingletonPattern() {}

    static {

        File file = new File("./configuration.properties");
        try {
            fileInputStream = new FileInputStream(file);
            properties = new Properties();
            properties.load(fileInputStream);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static SingletonPattern getInstance() {

        if(singletonPattern == null) {
            synchronized (SingletonPattern.class) {
                if(singletonPattern == null) {
                    singletonPattern = new SingletonPattern();
                }
            }
        }

        return singletonPattern;
    }

    public String getValue(String key) {
        return properties.getProperty(key);
    }

}
