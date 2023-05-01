package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductDetailsPage;
import pages.SearchPage;

public class ChangeCurrencyTest extends TestBase{
    HomePage homeObject;
    ProductDetailsPage productDetailsObject;
    SearchPage searchObject;

    @Test
    public void UsercanchangeCurrency()
    {
        homeObject = new HomePage(driver);
        productDetailsObject = new ProductDetailsPage(driver);
        searchObject = new SearchPage(driver);

        homeObject.changecustomercurreny();
        searchObject.productSearch("Mac");
        searchObject.openProductDetailspage();
        Assert.assertTrue(productDetailsObject.productPricelabel.getText().contains("€"));
        System.out.println(productDetailsObject.productPricelabel.getText());
        System.out.println("Currency changed successfully check your product price!!!!");

    }
}
