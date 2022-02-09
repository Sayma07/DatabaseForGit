package page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.TestBase;

public class LoginPage extends TestBase {

	WebDriver driver;

	public LoginPage  (WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='username']")
	WebElement UserName_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Password_Field;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement SignIn_Button;

	public void insertUserName(String username) {
		UserName_Field.sendKeys(username);
	}

	public void insertPassword(String password) {
		Password_Field.sendKeys(password);

	}

	public void clickOnSignInButton() {
		SignIn_Button.click();

	}

	public String getPageTitle() {

		return driver.getTitle();
	}

}
