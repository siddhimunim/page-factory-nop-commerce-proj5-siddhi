package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {
   //---------registration testcases for register form-----------
   // --------for cellphone product test -------------
   //filled all mendotary field
    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstName;
    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastName;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;
    @CacheLookup
    @FindBy(id = "Password")
    WebElement password;
    @CacheLookup
    @FindBy(xpath="//input[@id='ConfirmPassword']")
    WebElement confirmPassword;



    public void enterFirstName(String text){
        Reporter.log("first name " + text + firstName.toString());
        sendTextToElement(firstName, text);
        CustomListeners.test.log(Status.PASS, "first name is " + text);
    }


    public void enterLastName(String text){
        Reporter.log("Last name " + text + lastName.toString());
        sendTextToElement(lastName,text);
        CustomListeners.test.log(Status.PASS, "last name is " + text);
    }
    public void enterEmail(String text){
        Reporter.log("Email is " + text + emailField.toString());
        sendTextToElement(emailField,text + getRandomString(2)+ "@gmail.com");
        CustomListeners.test.log(Status.PASS, "Email is " + text);
    }

    public void enterPasswordField(String text){
        Reporter.log("Password is  " + text + password.toString());
        sendTextToElement(password,text);
        CustomListeners.test.log(Status.PASS, "Password is " + text);
    }
    public void enterConfirmpasswordField (String text){
        Reporter.log("Confirm password is  " + text + confirmPassword.toString());
        sendTextToElement(confirmPassword,text);
        CustomListeners.test.log(Status.PASS, " Confirm password is " + text);
    }
    //click on register
    @CacheLookup
    @FindBy(xpath="//button[@id='register-button']")
    WebElement register;

    public void clickOnRegeisterButton(){
        Reporter.log("click on Register " + register.toString());
        mouseHoverToElementAndClick(register);
        CustomListeners.test.log(Status.PASS, "click on Register");

    }
    //2.22 Verify the message “Your registration completed”
    @CacheLookup
    @FindBy(xpath="//div[contains(text(),'Your registration completed')]")
    WebElement verifyRegisterText;

    public String verifyYourRegCompleted(){
        Reporter.log("Your registration completed " + verifyRegisterText.toString());
        CustomListeners.test.log(Status.PASS, "Your registration completed");
        return getTextFromElement(verifyRegisterText);

    }
    //2.23 Click on “CONTINUE” tab
    @CacheLookup
    @FindBy(xpath="//a[contains(text(),'Continue')]")
    WebElement clickContinue;

    public void clickOnContinuetab(){
        Reporter.log("click on continue " + clickContinue.toString());
        mouseHoverToElementAndClick(clickContinue);
        CustomListeners.test.log(Status.PASS, "click on continue");
    }
}
