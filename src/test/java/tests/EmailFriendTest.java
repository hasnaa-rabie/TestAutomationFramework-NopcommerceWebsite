package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class EmailFriendTest extends TestBase{
    SearchPage searchobject;
    HomePage homeObject;
    LoginPage loginObject;
    EmailFriendPage emailfriendObject;
    ProductDetailsPage productdetailsObject;

    @Test
    public void UserCanSentAfriendmail()
    {
        homeObject = new HomePage(driver);
        homeObject.OpenLoginPage();
        loginObject = new LoginPage(driver);
        emailfriendObject = new EmailFriendPage(driver);
        searchobject = new SearchPage(driver);
        productdetailsObject = new ProductDetailsPage(driver);
        loginObject.UserLogin("HRS130@gmail.com", "H@1234");
        searchobject.productSearch("MacB");
        searchobject.openProductDetailspage();
        productdetailsObject.openEmailfriendpage();
        emailfriendObject.EmailFriendMethod("has@gmail.com","Hello friend this is for test");
        Assert.assertTrue(emailfriendObject.sentedmessage.getText().contains("Your message has been sent."));
        System.out.println("Your product shared successfully with your friend!!!");

    }
}
