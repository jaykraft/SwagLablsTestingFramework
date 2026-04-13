package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import org.testng.annotations.Listeners;
import pages.ProductsPage;
import utils.TestListener;

@Listeners(TestListener.class)

public class LoginTests extends BaseTest {

    @Test
    public void testLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
    }
}
