package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {
  //  1.3 Select Sort By position "Name: Z to A"
    @CacheLookup
     @FindBy(id ="products-orderby" )
    WebElement nameZtoA ;
    public void clickOnNameZtoA (){
        Reporter.log("click on name Z to A" + nameZtoA.toString());
        clickOnElement(nameZtoA);
        CustomListeners.test.log(Status.PASS, "click on name Z to A");
    }


   //2.3 Select Sort By position "Name: A to Z"
   @CacheLookup
   @FindBy(id ="products-orderby" )
   WebElement nameAtoZ ;

    public void clickOnNameAtoZ (){
        Reporter.log("click on name A to Z" + nameAtoZ.toString());
        clickOnElement(nameAtoZ);
        CustomListeners.test.log(Status.PASS, "click on name A to z");
    }

    //2.4 Click on "Add To Cart"
    @CacheLookup
    @FindBy(xpath ="//div[@data-productid='1']/div[2]/div[3]/div[2]/button[1]" )
    WebElement addTocart ;


    public void clickOnAddTocart(){
        Reporter.log("click on add to cart" + addTocart.toString());
        mouseHoverToElementAndClick(addTocart);
        CustomListeners.test.log(Status.PASS, "click on add to cart");
    }






}
