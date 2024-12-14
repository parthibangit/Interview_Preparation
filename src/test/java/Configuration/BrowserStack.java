package Configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BrowserStack {

    private static final String USER_NAME = "parthibansubbura_5XJRPv";
    private static final String ACCESS_KEY = "vA2WFd914zyuP1Ujq3as";
    private static final String BROWSER_STACK_URL = "https://" + USER_NAME + ":" + ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
    private static WebDriver driver;

    public static void main(String[] args) throws MalformedURLException {
        config();
    }

    public static void config() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setPlatform(Platform.WIN10);
        capabilities.setBrowserName("chrome");
        capabilities.setVersion("127");

        driver = new RemoteWebDriver(new URL(BROWSER_STACK_URL), capabilities );
        driver.get("http://www.automationpractice.pl/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        System.out.println(driver.getTitle());
        driver.close();

    }

}
