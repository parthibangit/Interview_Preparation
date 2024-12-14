package TestNg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ThreadPoolSize {

    /*
    * threadPoolSize used to run the test cases in multiple threads.
    * If we don't mention the invocationCount then threadPoolSize will be ignored.
    * There is no limit to specify the count in threadPoolSize
    * */

    WebDriver driver;

    @Test(invocationCount = 15, threadPoolSize = 15)
    public void threadPool() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://www.automationpractice.pl/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("Thread id is: "+ Thread.currentThread().getId());
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
