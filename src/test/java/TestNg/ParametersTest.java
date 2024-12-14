package TestNg;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {

    @Test()
    @Parameters({"browserName"})
    public void setBrowser(@Optional String browser) {

        if(browser.equalsIgnoreCase("Chrome")) {
            System.out.println("Given browser is chrome");
        }
        else {
            System.out.println("Given browser is not chrome");
        }

    }
}
