package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddContactPage extends PageBase {
    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-modal-content/div[1]/a/span")
    WebElement closeAddContact;

    public AddContactPage(WebDriver driver) {
        super(driver);
    }

    public ContactsPage closeAddNewContactDialog() {
        click(closeAddContact);
        return new ContactsPage(driver);
    }
}
