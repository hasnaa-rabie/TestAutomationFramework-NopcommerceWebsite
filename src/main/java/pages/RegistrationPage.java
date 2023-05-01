package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends PageBase{
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "gender-female")
    WebElement GenderBtn;

    @FindBy(id = "FirstName")
    WebElement FnTxtBox;

    @FindBy(id="LastName")
    WebElement LnTxtBox;

    @FindBy( id= "Email")
    WebElement EmailTxtBox;

    @FindBy(id = "Password")
    WebElement PassTxtBox;

    @FindBy(id = "ConfirmPassword")
    WebElement ConfirmPassTxtBox;

    @FindBy(xpath = "//button[@name='register-button']")
    WebElement RegBtn;

    public void UserRegister( String Fname, String Lname, String Email, String Password)
    {
        clickButton(GenderBtn);
        setTextElementText(FnTxtBox, Fname);
        setTextElementText(LnTxtBox, Lname);
        setTextElementText(EmailTxtBox, Email);
        setTextElementText(PassTxtBox, Password);
        setTextElementText(ConfirmPassTxtBox, Password);


    }

    public void SubmitReg()
    {
        clickButton(RegBtn);
    }


}
