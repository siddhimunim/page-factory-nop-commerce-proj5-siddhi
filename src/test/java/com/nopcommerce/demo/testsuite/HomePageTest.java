package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)


public class HomePageTest extends BaseTest {


    HomePage homePage ;
    @BeforeMethod(alwaysRun = true)
    public void objectMethod(){
      homePage   = new HomePage();

    }

  @Test(groups = {"sanity","regression"})
    public void verifyPageNavigation(){
     homePage.selectMenu("Books");
      Assert.assertEquals(homePage.getTitleOfPage(),"Books","Page Navigated Successfully");

  }
  @Test(groups = {"smoke","regression"})
    public void  verifyUserShouldNavigateToCellPhonesPageSuccessfully(){
      homePage.mousehoverToElectronics();
      homePage.clickOnCellPhone();
      Assert.assertEquals(homePage.verifyTextCellPhone(),"Cell phones","Not verify");

  }
}
