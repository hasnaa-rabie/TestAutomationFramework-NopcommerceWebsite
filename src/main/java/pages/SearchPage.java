package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends PageBase{
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "small-searchterms")
    WebElement searchTxtBox;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement searchBtn;

    @FindBy(id = "ui-id-1")
    List<WebElement> productList;

    @FindBy(linkText = "Apple MacBook Pro 13-inch")
    WebElement productTitle;

    public void productSearch(String productname)
    {
        setTextElementText(searchTxtBox,productname);
        clickButton(searchBtn);

    }

    public void openProductDetailspage()
    {
        clickButton(productTitle);
    }

    public void productSearchUsingAutosuggest(String searchTxt) throws InterruptedException {
        setTextElementText(searchTxtBox, searchTxt);
        Thread.sleep(2000);
        productList.get(0).click();
    }
}
