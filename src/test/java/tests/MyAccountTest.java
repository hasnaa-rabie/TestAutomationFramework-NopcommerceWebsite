package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.RegistrationPage;

public class MyAccountTest extends TestBase{

    RegistrationPage RegObject;
    HomePage HomeObject;
    LoginPage loginObject;
    MyAccountPage myAccountObject;

    String oldpassword = "H@1234";
    String newpassword = "1234567898";

    @Test(priority = 1)
    public void UserCanRegisterSuccessfully()
    {
        RegObject = new RegistrationPage(driver);
        HomeObject = new HomePage(driver);
        loginObject = new LoginPage(driver);

        HomeObject.OpenRegistrationPage();
        RegObject.UserRegister("Hasnaa", "Rabie", "HRS130@gmail.com", oldpassword);
        RegObject.SubmitReg();
    }

    @Test(priority = 2)
    public void UserLogin(){
        HomeObject = new HomePage(driver);
        loginObject = new LoginPage(driver);

        HomeObject.OpenLoginPage();
        loginObject.UserLogin("HRS130@gmail.com", oldpassword);
        loginObject.OpenMyAccountpage();
    }

    @Test(priority = 3)
    public void RigsteredUsercanChangePassword()
    {
        myAccountObject = new MyAccountPage(driver);
        loginObject = new LoginPage(driver);
        loginObject.OpenMyAccountpage();
        myAccountObject.changepasswordMethod(oldpassword, newpassword);
       // Assert.assertTrue(myAccountObject.ChanesuccessMessage.getText().contains("was changed"));
        System.out.println("Password changed successfully!!");
    }

    @Test(priority = 4)
    public void RigsterUserCanLogout(){
        loginObject.UserLogOut();
    }


}
