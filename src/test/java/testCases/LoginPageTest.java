package testCases;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import page.DatabasePage;
import page.LoginPage;

public class LoginPageTest extends TestBase {
	         LoginPage loginPageObj;

@BeforeMethod
public void setUp() {
            initializeDriver();
		    loginPageObj = PageFactory.initElements(driver, LoginPage.class);
	}

@Test(priority=1)
public void LoginTest() throws InterruptedException, ClassNotFoundException, SQLException, IOException {
            loginPageObj.insertUserName("demo@techfios.com");
             Thread.sleep(3000);
           loginPageObj.insertPassword("abc123");
		Thread.sleep(3000);
        loginPageObj.clickOnSignInButton();
		Thread.sleep(5000);
       takeScreenShotAtEndOfTest(driver);
	
       Thread.sleep(5000);

}
@Test(priority=2)
public void LoginPageTitleTest() throws InterruptedException, ClassNotFoundException, SQLException, IOException {
            loginPageObj.insertUserName("demo@techfios.com");
             Thread.sleep(3000);
           loginPageObj.insertPassword("abc123");
		 Thread.sleep(3000);
        loginPageObj.clickOnSignInButton();
		Thread.sleep(5000);
       String expecedTitle= "Dashboard- iBilling";
       String actualTitle= loginPageObj.getPageTitle();
		Thread.sleep(5000);

       
       Assert.assertEquals(expecedTitle, actualTitle);

}




	@AfterMethod
public void tearDown() {
		driver.close();
		driver.quit();
	}

}
