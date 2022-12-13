package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class HomePage extends Utility {

    By mainMenuList = By.xpath("//div[@class = 'header-menu']/ul/li");

    public void selectMenu(String menu) {
        List<WebElement> myProductList = driver.findElements(mainMenuList);
        try {
            for (WebElement option1 : myProductList) {
                System.out.println(option1.getText());
                if (option1.getText().equals(menu)) {
                    option1.click();
                    break;
                }
            }

        } catch (StaleElementReferenceException e) {
            myProductList = driver.findElements(mainMenuList);
        }

    }

    //  1.1 Click on Computer Menu.
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement computerMenu;
    @CacheLookup
    @FindBy(css = "div.page-title")
    WebElement pageTitle;

    // 1.2 Click on Desktop
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    WebElement desktop;

    // 2.37 verify welcome to our store
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement welcometext;


    //--------------------------electronic product------------------------------
    // 1.1 Mouse Hover on “Electronics” Tab
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/a[1]")
    WebElement elecTab;

    //1.2 Mouse Hover on “Cell phones” and click
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
    WebElement cellphoneField;


    //1.3 Verify the text “Cell phones
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Cell phones')]")
    WebElement verifyCellPhone;



    //-------logout field
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logout;


    public void clickOnComputerMenu() {
        Reporter.log("click on Computer Menu" + computerMenu.toString());
        mouseHoverToElement(computerMenu);
        CustomListeners.test.log(Status.PASS, "click on Computer Menu");

    }

    public String getTitleOfPage() {
        Reporter.log("verify title of the page" + pageTitle.toString());
        CustomListeners.test.log(Status.PASS, "verify title of the page");
        return getTextFromElement(pageTitle);

    }

    public void clickOndesktop() {
        Reporter.log("click on Desktop" + desktop.toString());
        mouseHoverToElementAndClick(desktop);
        CustomListeners.test.log(Status.PASS, "click on Desktop");
    }

    public String verifyWelcomeStore() {
        Reporter.log("welcome to our store" + welcometext.toString());
        CustomListeners.test.log(Status.PASS, "welcome to our store");
        return getTextFromElement(welcometext);
    }

    public void mousehoverToElectronics() {
        Reporter.log("on Electronics tab" + elecTab.toString());
        mouseHoverToElement(elecTab);
        CustomListeners.test.log(Status.PASS, "On Electronic Tab");
    }

    public void clickOnCellPhone() {
        Reporter.log("click on Cell Phone" + cellphoneField.toString());
        mouseHoverToElementAndClick(cellphoneField);
        CustomListeners.test.log(Status.PASS, "click on Cell Phone");
    }

    public String verifyTextCellPhone() {
        Reporter.log("verify text Cell Phone" + verifyCellPhone.toString());
        CustomListeners.test.log(Status.PASS, "verify text Cell Phone");
        return getTextFromElement(verifyCellPhone);
    }

    public void clickOnlogoutfield() {
        Reporter.log("click on log out " + logout.toString());
        clickOnElement(logout);
        CustomListeners.test.log(Status.PASS, "click on log Out");
    }


}
