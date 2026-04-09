package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    //Initialise Variables
    public WebDriver driver;
    String baseUrl = "https://www.saucedemo.com/";

    @BeforeTest
    public void Setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @AfterTest
    public void TearDown(){
        //driver.quit();
    }

}
