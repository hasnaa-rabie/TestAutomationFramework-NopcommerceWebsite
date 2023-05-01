package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "Email")
    WebElement EmailTxtBox;

    @FindBy(id = "Password")
    WebElement PasswordTxtBox;

    @FindBy(css = "button.button-1.login-button")
    WebElement LoginBtn;

    @FindBy(linkText = "Log out")
    public WebElement LogoutBtn;

    @FindBy(linkText = "My account")
    public WebElement myAccountLink;

    public void UserLogin(String email, String password)
    {
        setTextElementText(EmailTxtBox,email);
        setTextElementText(PasswordTxtBox, password);
        clickButton(LoginBtn);
    }

    public void UserLogOut()
    {
        clickButton(LogoutBtn);
    }

    public void OpenMyAccountpage(){
        clickButton(myAccountLink);
    }
}
