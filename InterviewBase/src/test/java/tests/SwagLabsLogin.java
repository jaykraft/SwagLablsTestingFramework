package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.HashMap;

public class SwagLabsLogin extends BaseTest {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    @Test
    public void sort_products(){
        //Navigate to homepage

        //Enter Username and Password
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        //Login
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        //Sort Data
        wait.equals(driver.findElement(By.xpath("//select[@class='product_sort_container']")).isEnabled());
        driver.findElement(By.xpath("//select[@class='product_sort_container']")).click();
        driver.findElement(By.xpath("//option[@value='za']")).click();
        //Display data
        //Collect name and associate price with it
        HashMap<String, Integer> products;
        int i;
        for (i = 1, i <= driver.findElements(By.xpath("//div[@class='inventory_item_name ']")).size(), i++){
            products.putIfAbsent(driver.findElement(By.xpath("(//div[@class='inventory_item_name '])[")))
        }
    }
}
