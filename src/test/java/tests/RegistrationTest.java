package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.RegistrationPage;

public class RegistrationTest extends TestBase{

    RegistrationPage RegObject;
    HomePage HomeObject;

    LoginPage loginObject;

    @Test
    public void UserCanRegisterSuccessfully()
    {
        RegObject = new RegistrationPage(driver);
        HomeObject = new HomePage(driver);
        loginObject = new LoginPage(driver);

        HomeObject.OpenRegistrationPage();
        RegObject.UserRegister("Hasnaa", "Rabie", "HRS130@gmail.com", "H@1234");
        RegObject.SubmitReg();
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='result']")).getText().contains("Your registration"));
        System.out.println("User Registered successfully!!!");
    }



}
