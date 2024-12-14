package Configuration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.rmi.Remote;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class Screenshot {

    RemoteWebDriver driver;


    @BeforeTest
    public void setUp() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.setAcceptInsecureCerts(true);

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.get("http://www.automationpractice.pl/index.php");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public static String getCurrentDateAndTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        String dateAndTime = localDateTime.format(formatter);
        return dateAndTime.replaceAll("[/:]", "-");
    }


    @Test
    public void takeScreenshot() throws IOException, InterruptedException {
        Thread.sleep(3000);
        String date = getCurrentDateAndTime();
        TakesScreenshot tc = (TakesScreenshot) driver;
        File srcImg = tc.getScreenshotAs(OutputType.FILE);
        File destFile = new File("./Screenshots/screenshot_" +date+".png");
        FileUtils.copyFile(srcImg, destFile);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
