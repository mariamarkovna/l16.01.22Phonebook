package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddContactPage;
import pages.ContactsPage;
import pages.LoginPage;

public class LoginPageTests extends TestBase {

    @Test
    public void loginPositiveTest() {
        logger.info("Starting login test");
        //String language = System.getProperty("language");
        String language = "English";

        LoginPage myLoginPage = new LoginPage(driver);
        ContactsPage contactsPage = myLoginPage.login("test@gmail.com", "test@gmail.com");
        AddContactPage addContact = new AddContactPage(driver);
        sleep();
        contactsPage.selectLanguage(language);
        sleep();
        Assert.assertEquals(contactsPage.getContacts(language).getText(), ContactsPage.getContactWord(language));
        contactsPage.openAddNewContactDialog();
        sleep();
        addContact.closeAddNewContactDialog();
        sleep();
        logger.info("Finished login test");
    }
}
