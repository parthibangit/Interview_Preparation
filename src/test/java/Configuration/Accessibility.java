package Configuration;

import com.deque.html.axecore.results.Results;
import com.deque.html.axecore.selenium.AxeBuilder;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Accessibility {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://www.automationpractice.pl/index.php");
        driver.manage().window().maximize();
    }

    @Test
    public void checkAccessibility() {

        AxeBuilder axeBuilder = new AxeBuilder();
        Results axeResults = axeBuilder.analyze(driver);

        if(axeResults.violationFree()) {

            System.out.println("There is no violations in this application");
        }
        else {
            System.out.println("The errors are: "+ axeResults.getErrorMessage());
            System.out.println("The violations are: "+ axeResults.getViolations());
        }
    }

    @AfterMethod
    public void tearDown() {

       driver.quit();
    }
}
