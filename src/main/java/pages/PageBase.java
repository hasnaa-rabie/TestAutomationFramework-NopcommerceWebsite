package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {

    public WebDriver driver;

    public JavascriptExecutor jse;

    public Select select;
    // Create parametrized constructor from PageBase
    public PageBase(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    protected static void clickButton(WebElement button)
    {
        button.click();
    }

    protected static void setTextElementText(WebElement TxtElement, String value )
    {
        TxtElement.sendKeys(value);
    }

    public void ScrolltoBottom()
    {
        jse.executeScript("scrollBy(0,2500)");
    }

}
