package TestNg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ParallelTest {

    Logger logger =  LogManager.getLogger(ParallelTest.class);
    /*
    * thread-count = We can specify n number of maximum count to run the test cases in thread.
    * */

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://www.automationpractice.pl/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @Test
    public void testOne() {


        String title = driver.getTitle();
        System.out.println(title + "Thread id is: "+ Thread.currentThread().getId());
    }

    @Test
    public void testTwo() {

        String url = driver.getCurrentUrl();
        System.out.println(url + "Thread id is: "+ Thread.currentThread().getId());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();      // Close the all the opened browsers.
    }
}
