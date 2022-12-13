package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import com.nopcommerce.demo.utility.Utility;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)

public class CellPhonePageTest extends BaseTest {
    HomePage homePage;
    CellPhonePage cellPhonePage;
    ShoppingCartPage shoppingCartPage;
    CheckOutGuestLoginPage checkOutGuestLoginPage;
    RegisterPage registerPage;
    CheckoutProductsPage checkoutProductsPage;
    Utility utility;

    @BeforeMethod(alwaysRun = true)

    public void objectMethod() {
        homePage = new HomePage();
        cellPhonePage = new CellPhonePage();
        shoppingCartPage = new ShoppingCartPage();
        checkOutGuestLoginPage = new CheckOutGuestLoginPage();
        registerPage = new RegisterPage();
        checkoutProductsPage = new CheckoutProductsPage();
        utility = new Utility();
    }

    @Test(groups = {"sanity", "regression"})
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        // testscenario from homepage and description that page
        Thread.sleep(500);
        homePage.mousehoverToElectronics();
        homePage.clickOnCellPhone();
        Assert.assertEquals(homePage.verifyTextCellPhone(), "Cell phones", "Not verify");
        // testscenarios from cellphonepage
        cellPhonePage.mouseHoverandClickOnListView();
        Thread.sleep(500);
        cellPhonePage.clickOnNokiaLumiaProduct();
        Thread.sleep(500);
        Assert.assertEquals(cellPhonePage.verifyProductPriceOfNokia(), "$349.00", "not verify");
        cellPhonePage.clearQtyAndChangeQtyOfProuduct("2");
        cellPhonePage.clickOnAddTocartButton();

        Assert.assertTrue(cellPhonePage.verifymassageProductAddTocart().contains("The product has been added to your "));
        //  Thread.sleep(1000);
        cellPhonePage.clickOnCrossButton();
        cellPhonePage.mouseHoverToShoppingcart();
        Thread.sleep(500);
        cellPhonePage.goTocart();
        Thread.sleep(500);
        Assert.assertEquals(shoppingCartPage.verifyShoppingCart(), "Shopping cart", "not verify");

       //-- Assert.assertEquals(shoppingCartPage.verifyTotalprice(), "$698.00");
        Thread.sleep(500);
        shoppingCartPage.clickOnTermsAndService();
        Thread.sleep(500);
        shoppingCartPage.clickOnCheckoutButton();
        Assert.assertEquals(checkOutGuestLoginPage.verifyWelcomeSignIn(), "Welcome, Please Sign In!", "Not Verify");
        checkOutGuestLoginPage.clickOnRegister();
        registerPage.enterFirstName("Siddh");
        registerPage.enterLastName("thak");
        registerPage.enterEmail("siddh.thakker");
        registerPage.enterPasswordField("siddhthak12");
        registerPage.enterConfirmpasswordField("siddhthak12");
        registerPage.clickOnRegeisterButton();
        Assert.assertEquals(registerPage.verifyYourRegCompleted(), "Your registration completed");
        ;registerPage.clickOnContinuetab();
        //

        // Assert.assertEquals(shoppingCartPage.verifyShoppingCart(),"Shopping cart","not verify");
        Thread.sleep(500);
        shoppingCartPage.clickTermsAndService();
        shoppingCartPage.clickCheckoutButton();
        checkoutProductsPage.enterFirstName("Siddh");
        checkoutProductsPage.enterLastName("thak");
        Thread.sleep(500);
        checkoutProductsPage.enterCountryName("United States");
        Thread.sleep(500);
        checkoutProductsPage.enterStateName("Alaska");
        checkoutProductsPage.enterCityName("naple");
        checkoutProductsPage.enterAddress1("123 cordin view");
        checkoutProductsPage.enterZipCode("1528");
        checkoutProductsPage.enterPhoneNo("45829011");
        Thread.sleep(500);
        checkoutProductsPage.clickOnContinue();
     //   Thread.sleep(1000);
        checkoutProductsPage.clickOn2ndOption();
        Thread.sleep(500);
        checkoutProductsPage.clickOnCountinueTab();
        Thread.sleep(500);
        checkoutProductsPage.clickOnPaymentmethod();
        checkoutProductsPage.clickOnLink();

        checkoutProductsPage.selectMasterCard("Visa");
        checkoutProductsPage.enterName("H.M.zoe");
        checkoutProductsPage.enterCardNo("4111111111111111");
        checkoutProductsPage.selectMonth("01");
        checkoutProductsPage.selectYear("2025");
        checkoutProductsPage.enterCardCode("123");

        checkoutProductsPage.clickOnContinueField();
        Thread.sleep(500);
        Assert.assertEquals(checkoutProductsPage.verifyCreditcadText(), "Credit Card");
        Thread.sleep(500);
        Assert.assertEquals(checkoutProductsPage.verifyShippingmethodText(), "2nd Day Air");
        Thread.sleep(500);
        Assert.assertEquals(shoppingCartPage.verifyTotalPrice(), "$698.00");
        checkoutProductsPage.clickOnConfirm();
        Assert.assertEquals(checkoutProductsPage.verifyThankYouText(), "Thank you");
        Thread.sleep(500);
        Assert.assertEquals(checkoutProductsPage.verifyOrderSuccessText(), "Your order has been successfully processed!");

        checkoutProductsPage.clickOnTabContinue();
        Thread.sleep(500);
        Assert.assertEquals(homePage.verifyWelcomeStore(), "Welcome to our store");
        homePage.clickOnlogoutfield();
        Assert.assertEquals(utility.getcurrentUrl(), "https://demo.nopcommerce.com/", "not verify ");


    }

}
