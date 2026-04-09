package utils;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Helpers {
    WebDriver driver;
    WebDriverWait wait;

    public Helpers(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void WaitForElementToBeDisplayed(By locator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
