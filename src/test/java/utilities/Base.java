package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.AfterTest;

public class Base {

	public WebDriver driver;

	@AfterMethod
	public void afterMethod(ITestResult iTestResult) throws IOException {


		if(iTestResult.getStatus()==iTestResult.FAILURE||iTestResult.getStatus()==iTestResult.SUCCESS)
		{
			takesScreenShotOn(iTestResult.getName());
		}
	}

	public void takesScreenShotOn(String name) throws IOException {

		String dateName=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

		//Take full page screenshot
		//Refer https://www.youtube.com/watch?v=BDvBx_x8VQ0
		//Add the dependency of shutterbug in pom.xml file
		Shutterbug.shootPage(driver,Capture.FULL,true).save(System.getProperty("user.dir")+"\\target\\screenshots\\"+name+dateName+".png");


	}

	@BeforeTest
	public void beforeTest() throws IOException {


		getBrowser();
	}

	public void getBrowser() throws IOException {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		//To take screenshot of the first page---Url launched/Up page
		takesScreenShotOn("homepage");
		driver.manage().window().maximize();

	}

	@AfterTest
	public void afterTest() {

		driver.quit();
	}

}
