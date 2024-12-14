package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertsTest {

    @Test(priority = 1)
    public void hardAssert() {
        Assert.assertTrue(false, "Condition got failed");
        System.out.println("This step will not execute");
    }

    @Test
    public void softAssert() {
        SoftAssert softAssert = new SoftAssert();
        softAssert. assertTrue(false, "Condition not satisfied");
        System.out.println("This step will execute");
        softAssert.assertAll();
        System.out.println("This step will not execute");
    }

    @Test
    public void notEqual() {

        Assert.assertNotEquals("Not equal", "Not equal", "Values are equal. ");
        Assert.assertSame("parthi", "Parthi");
        Assert.assertEquals("parthi", "Parthi");
    }

}
