package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");

    public void enterUsername(String username) {
        wait.waitForElementVisible(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        wait.waitForElementVisible(passwordField).sendKeys(password);
    }

    public void clickLogin(){
        wait.waitForElementClickable(loginButton).click();
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }
}
