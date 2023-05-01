package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductDetailsPage;
import pages.SearchPage;

public class SearchTest extends TestBase{

    SearchPage searchObject;
    ProductDetailsPage productdetailsObject;
    String ProductName = "Apple MacBook Pro 13-inch";

    @Test
    public void UsercanSearchforProduct()
    {
        searchObject = new SearchPage(driver);
        productdetailsObject = new ProductDetailsPage(driver);
        searchObject.productSearch(ProductName);
        searchObject.openProductDetailspage();
        Assert.assertTrue(productdetailsObject.prodNamebreadcrumb.getText().equalsIgnoreCase(ProductName));
    }

}
