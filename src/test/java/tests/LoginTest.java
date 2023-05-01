package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends TestBase{

    HomePage HomeObject;
    LoginPage LoginObject;

    @Test(priority = 1)
    public void UserLogin(){
        HomeObject = new HomePage(driver);
        LoginObject = new LoginPage(driver);

        HomeObject.OpenLoginPage();
        LoginObject.UserLogin("HRS130@gmail.com", "H@1234");
        Assert.assertTrue(LoginObject.LogoutBtn.isDisplayed());
        System.out.println(LoginObject.LogoutBtn.getText());
        System.out.println("User Logged in Successfully!!");
    }

    @Test(priority = 2)
    public void UserLoggedincanLogout(){
        LoginObject.UserLogOut();
    }
}
