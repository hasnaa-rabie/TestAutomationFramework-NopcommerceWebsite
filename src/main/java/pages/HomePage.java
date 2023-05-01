package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
        jse = (JavascriptExecutor) driver;
    }

    @FindBy(linkText = "Register")
    public WebElement RegLink;

    @FindBy(linkText = "Log in")
    public WebElement LoginLink;

    @FindBy(linkText = "Contact us")
    public WebElement contactUsLink;

    @FindBy(id = "customerCurrency")
    public WebElement customercurrencyoption;

    public void OpenRegistrationPage()
    {
        clickButton(RegLink);
    }

    public void OpenLoginPage()
    {
        clickButton(LoginLink);
    }

    public void openContactUspage()
    {
        ScrolltoBottom();
        clickButton(contactUsLink);
    }

    public void changecustomercurreny()
    {
        select = new Select(customercurrencyoption);
        select.selectByVisibleText("Euro");
    }
}
