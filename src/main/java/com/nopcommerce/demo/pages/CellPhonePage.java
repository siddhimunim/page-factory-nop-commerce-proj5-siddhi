package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CellPhonePage extends Utility {
    //test scenario for  verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully method
    //  2.4 Click on List View Tab
    @CacheLookup
    @FindBy(xpath="//a[contains(text(),'List')]")
    WebElement listView;

 //2.5 Click on product name “Nokia Lumia 1020” link
 @CacheLookup
 @FindBy(xpath="//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/h2[1]/a[1]")
 WebElement nokiaLumiaText;

   //2.6 Verify the text “Nokia Lumia 1020
   @CacheLookup
   @FindBy(xpath="//h1[contains(text(),'Nokia Lumia 1020')]")
   WebElement verifyNokiaLumia ;

    //2.7 Verify the price “$349.00”
    @CacheLookup
    @FindBy(xpath="//span[@id='price-value-20']")
    WebElement verifyPrice ;

    // 2.8 Change quantity to 2
    @CacheLookup
    @FindBy(xpath="//input[@id='product_enteredQuantity_20']")
    WebElement QtyField ;

    // 2.9 Click on “ADD TO CART” tab
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-20']")
    WebElement addTocart ;

//    2.10 Verify the Message "The product has been added to your shopping cart" on Top green bar,
//    After that close the bar clicking on the cross button.//
     @CacheLookup
     @FindBy (xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
     WebElement verifymassageSucess ;
    @CacheLookup
    @FindBy (xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement clickOncrossButtton;

    //  2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    @CacheLookup
    @FindBy (xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement shopCart;
    @CacheLookup
    @FindBy (xpath = "//button[contains(text(),'Go to cart')]")
    WebElement clickOnGocart;





    //----------------------------------------methods-------------------------------//

    public void mouseHoverandClickOnListView(){
        Reporter.log("clikc on listview of cellphone" + listView.toString());
        mouseHoverToElementAndClick(listView);
        CustomListeners.test.log(Status.PASS,"click on listview of cellphone");
    }
    public void clickOnNokiaLumiaProduct(){
        Reporter.log("click on nokia lumia product" + nokiaLumiaText.toString());
        mouseHoverToElementAndClick(nokiaLumiaText);
        CustomListeners.test.log(Status.PASS,"click on nokia lumia product");
    }
    public String verifyProductNokiaLumia(){
        Reporter.log("verifying nokia lumia product" + verifyNokiaLumia.toString());
        CustomListeners.test.log(Status.PASS,"verifying  nokia lumia product");
        return  getTextFromElement(verifyNokiaLumia);
    }
    public String verifyProductPriceOfNokia(){
        Reporter.log("verifying product price of  nokia lumia product" + verifyPrice.toString());
        CustomListeners.test.log(Status.PASS,"verifying product price of nokia lumia product");
        return  getTextFromElement(verifyPrice);
    }
    public void clearQtyAndChangeQtyOfProuduct(String text){
        Reporter.log("changing Quantity of product" + text + "for" + nokiaLumiaText.toString());
        WebElement changeqty =   driver.findElement(By.xpath("//input[@id='product_enteredQuantity_20']"));
        changeqty.clear();
        sendTextToElement(QtyField,text);
        CustomListeners.test.log(Status.PASS,"changing Quantity of product to " + text);
    }
    public void clickOnAddTocartButton(){
        Reporter.log("click on add to cart" + addTocart.toString());
        mouseHoverToElementAndClick(addTocart);
        CustomListeners.test.log(Status.PASS,"click on add to cart");
    }
    public String verifymassageProductAddTocart(){
        Reporter.log("verify massage product add to cart" + verifymassageSucess.toString());
        CustomListeners.test.log(Status.PASS,"verify massage product add to cart");
        return getTextFromElement(verifymassageSucess);

    }
    public void clickOnCrossButton(){
        Reporter.log("click on cross button" + clickOncrossButtton.toString());
        mouseHoverToElementAndClick(clickOncrossButtton);
        CustomListeners.test.log(Status.PASS,"click on cross button");
    }
    public void mouseHoverToShoppingcart(){
        Reporter.log("mousehoover to shopping cart" + shopCart.toString());
        mouseHoverToElement(shopCart);
        CustomListeners.test.log(Status.PASS,"Mousehoover to cart");
    }
    public void goTocart(){
        Reporter.log("click on go to cart" + clickOnGocart.toString());
        clickOnElement(clickOnGocart);
        CustomListeners.test.log(Status.PASS,"click on add to cart");
    }





}