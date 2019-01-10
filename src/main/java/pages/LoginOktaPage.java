package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginOktaPage extends ParentPage {
    @FindBy (id = "okta-signin-username")
    WebElement enterOktaLogin;

    @FindBy (id = "okta-signin-password")
    WebElement enterOktaPassword;

    @FindBy (id = "okta-signin-submit")
    WebElement enterButton;


    public LoginOktaPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isOktaPageOpened() {
        try {
            return webDriver.findElement(By.partialLinkText("https://partnershealthcare.oktapreview.com/loging")).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

//    public void openLoginOktaPage() {
//        try {
//            webDriver.get("https://partnershealthcare.oktapreview.com/login/default?fromURI=%2fapp%2fpartnershealthcarepreview_insightdev2_1%2fexkhu4xk33hMPSMtk0h7%2fsso%2fsaml%3fSAMLRequest%3dfJJRb4IwFIX%252FCuk7UEBGaMTEzSwz0cyo28NeTK1XaYSW9Rbnzx8gZjMxPt706z2n53SIvCwqNq5trpbwXQNa51wWCll3kJHaKKY5SmSKl4DMCrYaz2cs9CirjLZa6II4Y0QwVmr1ohXWJZgVmJMU8LGcZSS3tkLm%252Bzs4ha5UKA%252B5HXgVN1aBQU%252Bbgy8O0m8FeeODOJPGhVS83fd3%252B8rnwAubC27A00fLKwMnCT%252Be0KXPq%252BoO1hObXrl1sQl8OB%252FzenA%252BRlE%252BX6zm9kjzxEfUnQ3ivGojoEslI3teIBBnOsnIhicJFTFNYpFuoziKtsGT2EXpPqZRsAu3%252BwZDrGGq0HJlMxLSIHVp4NJ0HQZsEDOafBFn0Qf3LNVOqsPjlLcXCNnber1wF%252B%252BrNXE%252Bmxd26TQAGQ1bz6wTNv%252Fae7yWXysjo3sF3fRzMwy7iHq50WW6%252FUGj3wEA%26RelayState%3dbnNfcG9saWN5PWRldjItaW5zaWdodC5wYXJ0bmVycy5vcmcucGFydG5lcnMub3JnX3NhbWwtc2VydmVyAGFIUjBjSE02THk5a1pYWXlMV2x1YzJsbmFIUTBMbkJoY25SdVpYSnpMbTl5Wnk4bVkzTnlaajB6TXpNM01ESmtabU5pTmpVMllqY3c%253D%26SigAlg%3dhttp%253A%252F%252Fwww.w3.org%252F2001%252F04%252Fxmldsig-more%2523rsa-sha256%26Signature%3dAyqAlk8bE%252BhoDejX8yMj4sR0KnvcHw%252FSPDj9z4lXFeSArO4OUKZ0fbQ2zAgCQtf9%252F1JqzR6U0UE5bEBrkQMGMSy52m2MYB9hfI%252BrsTGm%252Fply4s5rnvlNqPJ4onU1G%252BXUyJZNRhJuGHME3sJKKemKrxDcjJL28dFoNcxaZHwLhuV5n7G4Koa1jEtwO5Npk7fm7qc50xQg2V7l9Tez3tT%252FLnhw6Vq0NRBstTdjKwlw92adJvKJAmKsRAGMiWBQ43USNxylqKG8eAW7XCXKqhSfbkvEoVDXMPyjA7BUnQ0ijHZKuLgNnwJj3F53SMIG1himNVy6amRAGQVrSSNW0R7IUw%253D%253D");
//            logger.info("Okta Login Page was opened");
//
//        } catch (Exception e) {
//            logger.error("Can not open Okta Login Page");
//            Assert.fail("Can not open Okta Login Page");
//
//        }
//    }


    public void enterLogin(String login) {
//        try {
//            enterOktaLogin.clear();
//            enterOktaLogin.sendKeys("AU682");
//            logger.info(login + " Okta login was entered");
//        } catch (Exception e) {
//            logger.error("Cannot work with element");
//            Assert.fail("Cannot work with element");
//        }

        actionsWithElements.enterTextIntoElement(enterOktaLogin, login);
    }


    public void enterPassword(String password) {

//        try {
//            enterOktaPassword.clear();
//            enterOktaPassword.sendKeys("TTTest1234!");
//            logger.info(password + " Okta password was entered");
//        } catch (Exception e) {
//            logger.error("Cannot work with element");
//            Assert.fail("Cannot work with element");
//        }

        actionsWithElements.enterTextIntoElement(enterOktaPassword, password);
    }

    public void clickEnterPage() {

        //    enterButton.click();

        actionsWithElements.clickOnElement(enterButton);

    }
}
