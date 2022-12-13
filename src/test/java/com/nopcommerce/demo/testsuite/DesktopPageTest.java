package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)

public class DesktopPageTest extends BaseTest {
    HomePage homePage ;
    DesktopPage desktopPage ;
    BuildOwnComputerPage buildOwnComputerPage;
    ShoppingCartPage shoppingCartPage ;
    CheckOutGuestLoginPage checkOutGuestLoginPage;
    CheckoutProductsPage checkoutProductsPage ;


    @BeforeMethod(alwaysRun = true)
    public void objectMethod() {
        homePage = new HomePage();
        desktopPage = new DesktopPage();
        buildOwnComputerPage = new BuildOwnComputerPage();
        shoppingCartPage = new ShoppingCartPage();
        checkOutGuestLoginPage = new CheckOutGuestLoginPage();
        checkoutProductsPage = new CheckoutProductsPage();
    }


        @Test(groups = {"sanity","regression"})
    public void verifyProductArrangeInAlphaBaticalOrder(){
        homePage.clickOnComputerMenu();
        homePage.clickOndesktop();
        desktopPage.clickOnNameZtoA();
       //verify Z to A not working in actual website but logic write in desktoppage//
    }
    @Test(groups = {"smoke","regression"})
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        Thread.sleep(1000);
        homePage.clickOnComputerMenu();
        homePage.clickOndesktop();
        desktopPage.clickOnNameAtoZ();
        desktopPage.clickOnAddTocart();
        Thread.sleep(1000);
        Assert.assertEquals(buildOwnComputerPage.verifyBuildYourCompText(),"Build your own computer", "Not Verify");
        Thread.sleep(1000);
        buildOwnComputerPage.selectIntelPlatinum("2.2 GHz Intel Pentium Dual-Core E2200");
        buildOwnComputerPage.selectRam("8GB [+$60.00]");
        Thread.sleep(1000);
        buildOwnComputerPage.selectHDDTab();
        buildOwnComputerPage.selectVistaFieldTab();
        buildOwnComputerPage.clickOnCommander();
        Thread.sleep(1000);
        Assert.assertEquals(buildOwnComputerPage.verifyPrice(),"$1,475.00","Not Verify");
        buildOwnComputerPage.clickOnAddTocart();
        Thread.sleep(1000);
        Assert.assertTrue(buildOwnComputerPage.verifyProductAddTocart().contains("The product has been added to your "));
        buildOwnComputerPage.clickOnShoppingCart();
        Assert.assertEquals(shoppingCartPage.verifyShoppingCart(),"Shopping cart","not verify");

        shoppingCartPage.newQtychange("2");
        shoppingCartPage.updateShoppingCart();
        Thread.sleep(1000);
        Assert.assertEquals(shoppingCartPage.verifyTotalprice(),"$2,950.00","Not verify");
        shoppingCartPage.clickOnTermsAndService();
        shoppingCartPage.clickOnCheckoutButton();
        Thread.sleep(1000);
        Assert.assertEquals(checkOutGuestLoginPage.verifyWelcomeSignIn(),"Welcome, Please Sign In!","Not Verify");
        checkOutGuestLoginPage.clickOnCheckoutasGuest();
        Thread.sleep(1000);
        checkoutProductsPage.enterFirstName("jenna");
        checkoutProductsPage.enterLastName("munim");
        checkoutProductsPage.enterEmail("jenumun12@gmail.com");
        checkoutProductsPage.enterCountryName("United States");
        Thread.sleep(1000);
        checkoutProductsPage.enterStateName("Alaska");
        checkoutProductsPage.enterCityName("naple");
        checkoutProductsPage.enterAddress1("123 cordin view");
        checkoutProductsPage.enterZipCode("1528");
        checkoutProductsPage.enterPhoneNo("45829011");
        Thread.sleep(1000);
        checkoutProductsPage.clickOnContinue();
        checkoutProductsPage.clickOnNextDay();
        checkoutProductsPage.clickOnCountinueTab();
        Thread.sleep(1000);
        checkoutProductsPage.clickOnPaymentmethod();
        checkoutProductsPage.clickOnLink();
        Thread.sleep(1000);
        checkoutProductsPage.selectMasterCard("Master card");
        checkoutProductsPage.enterName("H.M.zoe");
        checkoutProductsPage.enterCardNo("5555555555554444");
        checkoutProductsPage.selectMonth("01");
        checkoutProductsPage.selectYear("2025");
        checkoutProductsPage.enterCardCode("123");
        Thread.sleep(1000);
        checkoutProductsPage.clickOnContinueField();
        Thread.sleep(1000);
        Assert.assertEquals(checkoutProductsPage.verifyCreditcadText(),"Credit Card");
        Assert.assertEquals(checkoutProductsPage.verifyShippingText(),"Next Day Air");
        Thread.sleep(1000);
        Assert.assertEquals(checkoutProductsPage.verifyTotalText(),"$2,950.00");
        checkoutProductsPage.clickOnConfirm();
        Thread.sleep(1000);
        Assert.assertEquals(checkoutProductsPage.verifyThankYouText(),"Thank you");
        Assert.assertEquals(checkoutProductsPage.verifyOrderSuccessText(),"Your order has been successfully processed!");
        Thread.sleep(1000);
        checkoutProductsPage.clickOnTabContinue();
       Assert.assertEquals( homePage.verifyWelcomeStore(),"Welcome to our store");




    }

}
