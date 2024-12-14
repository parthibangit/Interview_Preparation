package TestNg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    /*
    * ITestContext - Contains information about tests.
    * ITestResult - Contains information about test run result.
    *
    * */

    @Override
    public void onStart(ITestContext contextStart) {
        System.out.println("onStart method started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // Invoked on the success of a test.
        System.out.println("Method passed "+ result.getName());

    }

    @Override
    public void onTestFailure(ITestResult result) {
        // Invoked on the failure of a test.
        System.out.println("Method failed "+ result.getName());

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // Invoked on the skipped of a test.
        System.out.println("Method skipped "+ result.getName());

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Method failed with certain success percentage "+ result.getName());

    }

    @Override
    public void onFinish(ITestContext contextFinish) {
        // Invoked after all of tests executed in a class
        System.out.println("onFinish method finished");

    }
}
