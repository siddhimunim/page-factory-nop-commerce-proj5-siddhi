package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {
    //--------------for desktop product shopping cart secanrios------------------
    // 2.15 Verify the message "Shopping cart"
    @CacheLookup
     @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
     WebElement verifyCart;

    //  2.16 Change the Qty to "2" and Click on "Update shopping cart"
    @CacheLookup
    @FindBy(xpath = "//td[@class='quantity']/input")
    WebElement changeQty;
    @CacheLookup
    @FindBy(id= "updatecart")
    WebElement updatecart;
    // 2.17 Verify the Total"$2,950.00"
    @CacheLookup
    @FindBy(xpath = "//tr[@class='order-total']/td[2]/span/strong")
    WebElement verifyPrice;


    // 2.18 click on checkbox “I agree with the terms of service”
    @CacheLookup
    @FindBy(id= "termsofservice")
    WebElement termscondition1;


    // 2.19 Click on “CHECKOUT
    @CacheLookup
    @FindBy(id= "checkout")
    WebElement checkout;
    @CacheLookup
    @FindBy(id= "termsofservice")
    WebElement termscondition;



    //-----------------all methods----------------------------------//
    public String verifyShoppingCart() {
        Reporter.log("verify text ShoppingCart" + verifyCart.toString());
        CustomListeners.test.log(Status.PASS, "verify text ShoppingCart");
        return getTextFromElement(verifyCart);

    }
  /*  public void clearQty() {
        Reporter.log("click on continue " + checkout.toString());
        WebElement changeqty = driver.findElement(By.xpath("//td[@class='quantity']/input"));
        changeqty.clear();
        CustomListeners.test.log(Status.PASS, "click on continue");
    }*/
    public void newQtychange(String text) {
        Reporter.log("change quantity to " + text + changeQty.toString());
        WebElement changeqty = driver.findElement(By.xpath("//td[@class='quantity']/input"));
        changeqty.clear();
        sendTextToElement(changeQty, text);
        CustomListeners.test.log(Status.PASS, "change quantity to " + text);
    }
    public void updateShoppingCart() {
        Reporter.log(" update shopping cart " + updatecart.toString());
        mouseHoverToElementAndClick(updatecart);
        CustomListeners.test.log(Status.PASS, "update shopping cart");
    }
    public String verifyTotalprice() {
        Reporter.log("Total price $2,950.00 " + verifyPrice.toString());
        CustomListeners.test.log(Status.PASS, "Total price $2,950.00");
        return getTextFromElement(verifyPrice);
    }
    public void clickTermsAndService() {
        Reporter.log("click on terms and condition " + termscondition1.toString());
        clickOnElement(termscondition1);
        CustomListeners.test.log(Status.PASS, "click on terms and condition");
    }
    public void clickOnCheckoutButton() {
        Reporter.log("click on checkout  " + checkout.toString());
        mouseHoverToElementAndClick(checkout);
        CustomListeners.test.log(Status.PASS, "click on checkout");

    }
    public void clickOnTermsAndService() {
        Reporter.log("click on terms and condition " + termscondition.toString());
        clickOnElement(termscondition);
        CustomListeners.test.log(Status.PASS, "click on terms and condition");
    }



    //-----------------for cellphone product test secanario ------------------------
    // 2.13 Verify the quantity is 2
    // WebElement text = driver.findElement(By.xpath("//input[@class='qty-input']"));
    // String expText5 = "2";
    // String actText5 = text.getAttribute("value");
    @CacheLookup
    @FindBy(xpath="//input[@class='qty-input']")
    WebElement verifyQty;


    public String verifyQtyOfLumiaMobile(String value1) {
        Reporter.log("Total Qty " + verifyQty.toString());
        CustomListeners.test.log(Status.PASS, "Total quatity is 2");
        WebElement text1 = driver.findElement(By.xpath("//input[@class='qty-input']"));
        text1.getAttribute("value");
        return getTextFromElement(verifyQty);

    }

    //2.14 Verify the Total $698.00
    @CacheLookup
    @FindBy(xpath="//tr[@class='order-total']/td[2]/span")
    WebElement verifytotalPrice;


    public String verifyTotalPrice() {
        Reporter.log("Total price $698 " + verifytotalPrice.toString());
        CustomListeners.test.log(Status.PASS, "Total price $698");
        return getTextFromElement(verifytotalPrice);

    }
    //click on checkout
    @CacheLookup
    @FindBy(id= "checkout")
    WebElement checkout1;
    public void clickCheckoutButton() {
        Reporter.log("click on checkout  " + checkout1.toString());
        mouseHoverToElementAndClick(checkout1);
        CustomListeners.test.log(Status.PASS, "click on checkout");

    }
}
