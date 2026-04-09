package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
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
    public void tearDown(){
        DriverFactory.quitDriver();
    }

}
