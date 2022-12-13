package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BuildOwnComputerPage extends Utility {

   // 2.5 Verify the Text "Build your own computer"
    @CacheLookup
     @FindBy ( xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement buildcomputerVerify ;
   // 2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
   @CacheLookup
   @FindBy(xpath="//select[@id='product_attribute_1']")
    WebElement intelPlatinumField ;
   //2.7.Select "8GB [+$60.00]" using Select class.
    @CacheLookup
    @FindBy(xpath="//select[@id='product_attribute_2']")
    WebElement ramField;
    // 2.8 Select HDD radio "400 GB [+$100.00]"
    @CacheLookup
    @FindBy(xpath="//input[@id='product_attribute_3_7']")
    WebElement hDDField;
    // 2.9 Select OS radio "Vista Premium [+$60.00]"
    @CacheLookup
    @FindBy(id="product_attribute_4_9")
    WebElement VistaField;

    //  2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
    @CacheLookup
    @FindBy(id="product_attribute_5_12")
    WebElement commander;


  //  2.11 Verify the price "$1,475.00"
  @CacheLookup
  @FindBy(xpath="//span[@id='price-value-1']")
  WebElement priceverify;


  //2.12 Click on "ADD TO CARD" Button.
  @CacheLookup
  @FindBy(xpath="//button[@id='add-to-cart-button-1']")
  WebElement addToCart;


    //verify massage
    @CacheLookup
    @FindBy(xpath="//body/div[@id='bar-notification']/div[1]")
    WebElement verifyProductAdd;

    //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button
    @CacheLookup
    @FindBy(xpath="//a[contains(text(),'shopping cart')]")
    WebElement shoppingCart;



//-------------------------------methods-----------------//
public String verifyBuildYourCompText (){
    Reporter.log("BuildYourComputer" + buildcomputerVerify.toString());
    CustomListeners.test.log(Status.PASS,"verify build your computer text");
    return getTextFromElement(buildcomputerVerify);
}
    public void selectIntelPlatinum(String text ){
        Reporter.log(" intel platinum" + text+ "is selected" + intelPlatinumField.toString());
        selectByVisibleTextFromDropDown(intelPlatinumField,text);
        CustomListeners.test.log(Status.PASS,"intel platinum is" + text);
    }
    public void selectRam(String text ){
        Reporter.log("selection of RAM" + text + "is " + ramField.toString());
        selectByVisibleTextFromDropDown(ramField,text);
        CustomListeners.test.log(Status.PASS,"selection of RAM" + text);
    }
    public void selectHDDTab(){
        Reporter.log("selection of HDD" +  hDDField.toString());
        clickOnElement(hDDField);
        CustomListeners.test.log(Status.PASS,"selection of HDD");
    }
    public void selectVistaFieldTab( ){
        Reporter.log("Select vista field tab " + VistaField.toString());
        clickOnElement(VistaField);
        CustomListeners.test.log(Status.PASS,"Selection of vista field");
    }
    public void clickOnCommander(){
        Reporter.log("click on commander" +commander.toString());
    clickOnElement(commander);
        CustomListeners.test.log(Status.PASS,"click on commander");
    }
    public String verifyPrice(){
        Reporter.log("verify price  " + priceverify.toString());
        CustomListeners.test.log(Status.PASS,"verify price of computer");
    return getTextFromElement(priceverify);
    }
    public void clickOnAddTocart(){
        Reporter.log("click on add to cart" + addToCart.toString());
    mouseHoverToElementAndClick(addToCart);
        CustomListeners.test.log(Status.PASS,"click on add to cart");
    }
    public String verifyProductAddTocart(){
        Reporter.log("poduct add to cart" + verifyProductAdd.toString());
        CustomListeners.test.log(Status.PASS,"verify product add to cart massage");
        return getTextFromElement(verifyProductAdd);
    }
    public void clickOnShoppingCart(){
        Reporter.log("click on shopping cart" + shoppingCart.toString());
        mouseHoverToElementAndClick(shoppingCart);
        CustomListeners.test.log(Status.PASS,"click on shopping cart");
    }




}
