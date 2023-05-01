package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageBase{
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//a[@href='/customer/changepassword']")
    public WebElement ChangePassLink;

    @FindBy(id = "OldPassword")
    WebElement oldPassTxtBox;

    @FindBy(id = "NewPassword")
    WebElement newPassTxtBox;

    @FindBy(id = "ConfirmNewPassword")
    WebElement confirmNewPassTxtBox;

    @FindBy(linkText = "Change password")
    WebElement changePassBtn;

    @FindBy(xpath = "//div[@class='bar-notification success']")
    public WebElement ChanesuccessMessage;


    public void changepasswordMethod(String oldpassword, String newpassword){
        clickButton(ChangePassLink);
        setTextElementText(oldPassTxtBox, oldpassword);
        setTextElementText(newPassTxtBox, newpassword);
        setTextElementText(confirmNewPassTxtBox, newpassword);
        clickButton(changePassBtn);
    }


}
