package login;

import org.junit.Assert;
import org.junit.Test;
import parentTest.ParentTest;


public class LoginNew extends ParentTest {
    @Test
    public void validLogin() {
        loginPage.openLoginPage();
        loginPage.enterLogin("KL029");
        loginPage.clickLoginButton();

//      Assert.assertTrue("Login Okta Page is opened", loginOktaPage.isOktaPageOpened());

//      loginOktaPage.openLoginOktaPage();
        loginOktaPage.enterLogin("AU682");
        loginOktaPage.enterPassword("TTTest1234!");
        loginOktaPage.clickEnterPage();

//        disclosuresPage.openDisclosuresPage();

//        Assert.assertTrue("Disclosures Page is opened", disclosuresPage.isPageOpened());
    }
}
