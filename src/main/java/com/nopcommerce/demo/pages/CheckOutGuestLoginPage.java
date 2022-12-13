package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CheckOutGuestLoginPage extends Utility {
    // 2.20 Verify the Text “Welcome, Please Sign In!”
    @CacheLookup
    @FindBy(xpath ="//h1[contains(text(),'Welcome, Please Sign In!')]" )
    WebElement verifyWelcometext;
    public String verifyWelcomeSignIn(){
        Reporter.log("verify welcome text on page" + verifyWelcometext.toString());
        CustomListeners.test.log(Status.PASS,"verify welcome text on page");
        return getTextFromElement(verifyWelcometext);
    }
    // 2.21Click on “CHECKOUT AS GUEST” Tab
    @CacheLookup
    @FindBy(xpath ="//button[contains(text(),'Checkout as Guest')]" )
    WebElement checkoutGuest;

    public void clickOnCheckoutasGuest() {
        Reporter.log("click on checkout guest button" + checkoutGuest.toString());
        clickOnElement(checkoutGuest);
        CustomListeners.test.log(Status.PASS,"click on checkout as guest");
    }
    //--------------for cellphone product checkout register on site---------
    @CacheLookup
    @FindBy(xpath ="//button[contains(text(),'Register')]" )
    WebElement register;

    public void clickOnRegister(){
        Reporter.log("click on register button" + register.toString());
        mouseHoverToElementAndClick(register);
        CustomListeners.test.log(Status.PASS,"click on register");
    }


}
