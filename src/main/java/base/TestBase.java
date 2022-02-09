package base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;
	public TestBase() {
		
	}
	
	public static void initializeDriver() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	driver.get("https://www.techfios.com/billing/?ng=login" );
	}
	
	public static void takeScreenShotAtEndOfTest(WebDriver driver ) throws IOException {
        // Convert web driver object to TakeScreenshot
		TakesScreenshot ts = ((TakesScreenshot) driver);
        
		SimpleDateFormat formatter =new SimpleDateFormat("MMddyy_HHmmss");
		Date date =new Date();
		String label=formatter.format(date);
		// Call getScreenshotAs method to create image file
         File SrcFile = ts.getScreenshotAs(OutputType.FILE);
         String currentDir =System.getProperty("user.dir");
         FileUtils.copyFile(SrcFile, new File (currentDir+"/screenshoots/"+label+".png"));
        
	
	
	
	
	
}
	
}
