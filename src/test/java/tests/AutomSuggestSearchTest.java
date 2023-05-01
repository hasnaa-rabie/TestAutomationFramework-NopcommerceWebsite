package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductDetailsPage;
import pages.SearchPage;

public class AutomSuggestSearchTest extends TestBase{

    SearchPage searchObject;
    ProductDetailsPage productdetailsObject;
    String ProductName = "Apple MacBook Pro 13-inch";

    @Test
    public void UsercanSearchwithAutosuggest() throws InterruptedException {
        searchObject = new SearchPage(driver);
        productdetailsObject = new ProductDetailsPage(driver);
        searchObject.productSearchUsingAutosuggest("MacB");
        Assert.assertTrue(productdetailsObject.prodNamebreadcrumb.getText().equalsIgnoreCase(ProductName));
        System.out.println("Automatic search find the correct product!!");
    }
}
