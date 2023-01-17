package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

    @FindBy(id="defaultRegisterFormEmail")
    WebElement userName;

    @FindBy(xpath = "//*[@id=\"login-form\"]/div[2]/div[1]/div/input")
    WebElement password;

    @FindBy(xpath = "/html/body/app-root/app-login/div/div[2]/div/form/div[3]/div[1]/button")
    WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }



    public ContactsPage login(String uName, String pass) {
        type(userName, uName);
        type(password, pass);
        click(loginButton);
        return new ContactsPage(driver);
    }

    public LoginPage loginNegative(String uName, String pass) {
        type(userName, uName);
        type(password, pass);
        click(loginButton);
        return this;
    }

}
