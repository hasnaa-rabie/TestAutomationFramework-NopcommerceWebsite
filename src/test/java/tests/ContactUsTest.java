package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContactUsPage;
import pages.HomePage;

public class ContactUsTest extends TestBase{

    HomePage homeObject;
    ContactUsPage contactUsObject;
    String fulname= "Hasnaa";
    String email = "hasnaa@gmail.com";
    String enquiry = "need to check functionality of contactus ";

    @Test
    public void UserCanContactUs()
    {
        homeObject = new HomePage(driver);
        contactUsObject = new ContactUsPage(driver);
        homeObject.openContactUspage();
        contactUsObject.contactUsData(fulname,email, enquiry);
        Assert.assertTrue(contactUsObject.successMessage.getText().contains("Your enquiry has been successfully sent to the store owner."));
        System.out.println("Your enquiry has been successfully sent to the store owner.");
    }
}
