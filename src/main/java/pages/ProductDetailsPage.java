package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.PageBase;

public class ProductDetailsPage extends PageBase {
    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div.product-name")
    public WebElement prodNamebreadcrumb;

    @FindBy(css = "button.button-2.email-a-friend-button")
    WebElement emailFriendBtn;

    @FindBy(id = "price-value-4")
    public WebElement productPricelabel;

    public void openEmailfriendpage()
    {
        clickButton(emailFriendBtn);
    }

}
