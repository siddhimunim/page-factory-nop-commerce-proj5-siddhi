package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CheckoutProductsPage extends Utility {
    //-------checkout as guest reg form-----------------
    //fill all mendotary field for billing address for all product purchase///
    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstName;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lastName;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement email;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement country;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_StateProvinceId")
    WebElement stateField;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement city;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement address1;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement zip;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNo;
    //click on continue
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]")
    WebElement countinue;

    public void enterFirstName(String text) {
        Reporter.log("first name " + text + firstName.toString());
        sendTextToElement(firstName, text);
        CustomListeners.test.log(Status.PASS, "first name is " + text);
    }

    public void enterLastName(String text) {
        Reporter.log("last name " + text + lastName.toString());
        sendTextToElement(lastName, text);
        CustomListeners.test.log(Status.PASS, "Last name is " + text);
    }

    public void enterEmail(String text) {
        Reporter.log("Email ID is " + text + email.toString());
        sendTextToElement(email, text);
        CustomListeners.test.log(Status.PASS, "Email Id is " + text);
    }

    public void enterCountryName(String text) {
        Reporter.log("Country name is  " + text + country.toString());
        sendTextToElement(country, text);
        CustomListeners.test.log(Status.PASS, "Country name is " + text);
    }

    public void enterStateName(String text) {
        Reporter.log("State name is  " + text + stateField.toString());
        sendTextToElement(stateField, text);
        CustomListeners.test.log(Status.PASS, "State name is " + text);
    }

    public void enterCityName(String text) {
        Reporter.log(" City name is  " + text + city.toString());
        sendTextToElement(city, text);
        CustomListeners.test.log(Status.PASS, "City name is " + text);
    }

    public void enterAddress1(String text) {
        Reporter.log("Address 1 is  " + text + address1.toString());
        sendTextToElement(address1, text);
        CustomListeners.test.log(Status.PASS, "Address is " + text);
    }

    public void enterZipCode(String text) {
        Reporter.log("Zip code is " + text + zip.toString());
        sendTextToElement(zip, text);
        CustomListeners.test.log(Status.PASS, "Zip code is " + text);
    }

    public void enterPhoneNo(String text) {
        Reporter.log("Phone No is  " + text + phoneNo.toString());
        sendTextToElement(phoneNo, text);
        CustomListeners.test.log(Status.PASS, "Phone No  is " + text);
    }

    public void clickOnContinue() {
        Reporter.log("Click on continue" + countinue.toString());
        mouseHoverToElementAndClick(countinue);
        CustomListeners.test.log(Status.PASS, "click on continue ");
    }
    //-----------------------form finish go to finish shopping for desktop  -----------------------------------------------

    //-----------for desktop product all checkout procedure steps--------------

    //  2.24 Click on Radio Button “Next Day Air($0.00)”
    @CacheLookup
    @FindBy(id = "shippingoption_1")
    WebElement nextDayAir;


    // 2.25 Click on “CONTINUE”
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]")
    WebElement countClick;

    //2.26 Select Radio Button “Credit Card and countinue”
    @CacheLookup
    @FindBy(id = "paymentmethod_1")
    WebElement paymethod;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]")
    WebElement nextTab;
    // 2.27 Select “Master card” From Select credit card dropdown
    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']")
    WebElement masterCard;

    public void clickOnNextDay() {
        Reporter.log("click on next day delivary" + nextDayAir.toString());
        clickOnElement(nextDayAir);
        CustomListeners.test.log(Status.PASS, "click on next day delivary");
    }

    public void clickOnCountinueTab() {
        Reporter.log("click on countinue tab " + countClick.toString());
        clickOnElement(countClick);
        CustomListeners.test.log(Status.PASS, "click on continue tab ");
    }

    public void clickOnPaymentmethod() {
        Reporter.log("click on paymentmethod" + paymethod.toString());
        clickOnElement(paymethod);
        CustomListeners.test.log(Status.PASS, "click on Payment method ");
    }

    public void clickOnLink() {
        Reporter.log("click on continue " + nextTab.toString());
        clickOnElement(nextTab);
        CustomListeners.test.log(Status.PASS, "click on continue");
    }

    public void selectMasterCard(String text) {
        Reporter.log("mastercard " + text + "is selected" + masterCard.toString());
        selectByVisibleTextFromDropDown(masterCard, text);
        CustomListeners.test.log(Status.PASS, "Mastercard" + text + "is selected");
    }

    //2.28----------------- Fill all the details for payments----------------------------------//
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardholderName']")
    WebElement cardHoldername;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement cardNo;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement month;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement year;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement cardcode;


    public void enterName(String text) {
        Reporter.log("Enter name   " + text + cardHoldername.toString());
        sendTextToElement(cardHoldername, text);
        CustomListeners.test.log(Status.PASS, "Enter Name is " + text);
    }

    public void enterCardNo(String text) {
        Reporter.log("Card No is  " + text + cardNo.toString());
        sendTextToElement(cardNo, text);
        CustomListeners.test.log(Status.PASS, "card No  is " + text);
    }

    public void selectMonth(String text) {
        Reporter.log("Enter Month is  " + text + month.toString());
        selectByVisibleTextFromDropDown(month, text);
        CustomListeners.test.log(Status.PASS, "Enter month  is " + text);
    }

    public void selectYear(String text) {
        Reporter.log("Enter year is  " + text + year.toString());
        selectByVisibleTextFromDropDown(year, text);
        CustomListeners.test.log(Status.PASS, "Enter Year  is " + text);
    }

    public void enterCardCode(String text) {
        Reporter.log("Enter card code is  " + text + cardcode.toString());
        sendTextToElement(cardcode, text);
        CustomListeners.test.log(Status.PASS, "CardCode  is " + text);
    }

    //2.29 Click on “CONTINUE
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]")
    WebElement clickcontinue;

    //  2.30 Verify “Payment Method” is “Credit Card”
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Credit Card')]")
    WebElement verifyCreditCard;
    //  2.32 Verify “Shipping Method” is “Next Day Air”
    @CacheLookup
    @FindBy(xpath = "//div[@class='order-summary-content']/div/div[2]/div[2]/ul/li/span[2]")
    WebElement verifyShipping;


    //  2.33 Verify Total is “$2,950.00”
    @CacheLookup
    @FindBy(xpath = "//tr[@class='order-total']/td[2]/span")
    WebElement verifyTotal;

    //  2.34 Click on “CONFIRM”
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    WebElement confirm;

    //  2.35 Verify the Text “Thank You”
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement verifythankYou;

    //  2.36 Verify the message “Your order has been successfully processed!”
    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement verifyOrderSuccess;

    //  2.37 Click on “CONTINUE”
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement tabContinue;



    public void clickOnContinueField() {
        Reporter.log("click on continue " + clickcontinue.toString());
        mouseHoverToElementAndClick(clickcontinue);
        CustomListeners.test.log(Status.PASS, "click on continue");
    }
    public String verifyCreditcadText() {
        Reporter.log("verify payment method is credit card " + verifyCreditCard.toString());
        CustomListeners.test.log(Status.PASS, "verify payment method is credit card");
        return getTextFromElement(verifyCreditCard);
    }
    public String verifyShippingText() {
        Reporter.log("verify Shipping method is next day delivary" + verifyShipping.toString());
        CustomListeners.test.log(Status.PASS, "verifying shipping method is nex day");
        return getTextFromElement(verifyShipping);
    }
    public String verifyTotalText() {
        Reporter.log("verify Total is $2950" + verifyTotal.toString());
        CustomListeners.test.log(Status.PASS, "verifying total is $2950");
        return getTextFromElement(verifyTotal);
    }
    public void clickOnConfirm() {
        Reporter.log("click on continue " + confirm.toString());
        mouseHoverToElementAndClick(confirm);
        CustomListeners.test.log(Status.PASS, "click on continue");
    }
    public String verifyThankYouText() {
        Reporter.log("verify text Thank You " + verifythankYou.toString());
        CustomListeners.test.log(Status.PASS, "verifying text Thank You");
        return getTextFromElement(verifythankYou);
    }
    public String verifyOrderSuccessText() {
        Reporter.log("Your order has been successfully processed!" + verifyOrderSuccess.toString());
        CustomListeners.test.log(Status.PASS, "Your order has been successfully processed!");
        return getTextFromElement(verifyOrderSuccess);
    }
    public void clickOnTabContinue() {
        Reporter.log("click on continue " + tabContinue.toString());
        mouseHoverToElementAndClick(tabContinue);
        CustomListeners.test.log(Status.PASS, "click on continue");
    }

    //-------------------for cellphone product checkout scenario test---------------------------

    // for click on 2nd day air option
    @CacheLookup
    @FindBy(css = "#shippingoption_2")
    WebElement check2dayOption;
    @CacheLookup
    //@FindBy(xpath = "//div[@class='order-summary-content']/div/div[2]/div[2]/ul/li/span[2]")
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/span[2]")
    WebElement verifyShippingmethod;

    public void clickOn2ndOption() {
        Reporter.log("click on 2nd day option" + check2dayOption.toString());
        clickOnElement(check2dayOption);
        CustomListeners.test.log(Status.PASS, "click on 2nd day option");
    }
    //verify next day air
    public String verifyShippingmethodText() {
        Reporter.log("verify shipping method is 2nd day " + verifyShippingmethod.toString());
        CustomListeners.test.log(Status.PASS, "verify shipping method is 2nd day");
        return getTextFromElement(verifyShippingmethod);
    }


}
