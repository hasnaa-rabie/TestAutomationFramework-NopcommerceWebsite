package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailFriendPage extends PageBase{
    public EmailFriendPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "FriendEmail")
    WebElement friendemailTxtBox;

    @FindBy(id = "PersonalMessage")
    WebElement personalMessTxtBox;

    @FindBy(css = "button.button-1.send-email-a-friend-button")
    WebElement sendBtn;

    @FindBy(css = "div.result")
    public WebElement sentedmessage;


    public void EmailFriendMethod(String friendmail, String message)
    {
        setTextElementText(friendemailTxtBox, friendmail);
        setTextElementText(personalMessTxtBox, message);
        clickButton(sendBtn);
    }
}
