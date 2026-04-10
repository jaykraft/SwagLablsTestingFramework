package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.ITestResult;
import utils.ScreenshotUtils;
import utils.DriverFactory;
import utils.ConfigReader;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp(){
       driver = DriverFactory.initDriver();
       driver.manage().window().maximize();
       driver.get(ConfigReader.getProperty("url"));
    }

    @AfterMethod
    public void tearDown(ITestResult result){
        DriverFactory.quitDriver();
    }

}
