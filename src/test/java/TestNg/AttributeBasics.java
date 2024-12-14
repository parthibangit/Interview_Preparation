package TestNg;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class AttributeBasics {

    @Test(priority = 2, enabled = false)
    public void test1() {
        Assert.assertEquals(10, 10);
    }

    @Test(priority = 1)
    public void test2() {
        Assert.assertEquals(10, 20, "Values not matched");
    }

    @Test(dependsOnMethods = {"test2"}, alwaysRun = true)
    public void test3() {
        Assert.assertEquals("Parthiban", "Parthiban");
        System.out.println("Values matched");
    }

    @Test(groups = {"smokeTest"})
    public void test4() {
        System.out.println("This is smoke test");
    }

    @Test(groups = {"regressionTest"})
    public void test5() {
        System.out.println("This is regression test");
    }

    @Test(description = "This is for common used assert methods")
    public void test6() {
        Assert.assertEquals("Parthiban", "Parthiban");
        Assert.assertEquals(10, 10);

        Assert.assertEquals("Parthiban", "Parthiban", "Name is not matched");
        Assert.assertTrue(true, "Condition not matched");
        Assert.assertTrue(true);

        Assert.assertFalse(false, "Condition not matched");
        Assert.assertFalse(false);
    }

    @Test(invocationCount = 2)
    public void test7() {
        System.out.println("This is invocation test");
    }

    @Test(timeOut = 1000)
    public void test8() throws InterruptedException {
        System.out.println("This is timeout test");
        Thread.sleep(3000);        // Throw exception because script takes to finish more than 1 sec.
    }

    @Test(description = "Skip the test cases")
    public void test9() {

        throw new SkipException("Test case not yet developed...");    // It will print "Test ignored"
    }

}
