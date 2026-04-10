package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProductsPage extends BasePage {

    public ProductsPage (WebDriver driver) {
        super(driver);
    }

    private By productsTitle = By.xpath("//span[text() = 'Products']");

    public void checkPageTitle () {
        Assert.assertTrue(wait.waitForTextPresent(productsTitle, "Products"));
    }

}
