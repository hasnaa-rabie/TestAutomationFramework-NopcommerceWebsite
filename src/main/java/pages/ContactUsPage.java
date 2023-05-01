package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends PageBase{
    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "FullName")
    WebElement fullNameTxtBox;

    @FindBy(id = "Email")
    WebElement emailTxtBox;

    @FindBy(id = "Enquiry")
    WebElement enquiryTxtBox;

    @FindBy(css = "button.button-1.contact-us-button")
    WebElement submitBtn;

    @FindBy(css = "div.result")
    public WebElement successMessage;

    public void contactUsData(String Fname, String Email, String enquiry)
    {
        setTextElementText(fullNameTxtBox, Fname);
        setTextElementText(emailTxtBox, Email);
        setTextElementText(enquiryTxtBox, enquiry);
        clickButton(submitBtn);
    }
}
