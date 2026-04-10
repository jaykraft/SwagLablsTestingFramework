package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    ExtentReports extent = ExtentManager.getInstance();
    ExtentTest test;

    @Override
    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.pass("Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.fail("Test Failed: " + result.getThrowable());

        WebDriver driver = DriverFactory.getDriver();

        String base64Screenshot = ScreenshotUtils.capturScreenshotBase64(driver);

        try {
            test.fail("Screenshot:", com.aventstack.extentreports.MediaEntityBuilder
                    .createScreenCaptureFromBase64String(base64Screenshot)
                    .build());

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void onFinish(org.testng.ITestContext context) {
        extent.flush();
    }
}
