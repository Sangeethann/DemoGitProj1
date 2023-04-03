package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

	public WebDriver driver;

	public RegisterPage(WebDriver driver) {

		this.driver=driver;

	}

	public void registerDetails() {

		WebElement regElem=driver.findElement(By.xpath("//a[text()='REGISTER']"));
		regElem.click();

	}

	public void registerFillFormFirstNameDetails() {

		WebElement fname=driver.findElement(By.xpath("//input[@name='firstName']"));
		fname.sendKeys("Sangeetha");

	}

	public void registerFillFormLastNameDetails() {

		WebElement lname=driver.findElement(By.xpath("//input[@name='lastName']"));
		lname.sendKeys("Varghese");

	}

	public void registerFillFormPhoneDetails() {

		WebElement elemPhone=driver.findElement(By.xpath("//input[@name='phone']"));
		elemPhone.sendKeys("5778899");

	}

	public void registerFillFormEmailDetails() {

		WebElement elemEmail=driver.findElement(By.xpath("//input[@id='userName']"));
		elemEmail.sendKeys("test@gmail.com");


	}

	public void registerFillFormAddressDetails() {

		WebElement elemAddress=driver.findElement(By.xpath("//input[@name='address1']"));
		elemAddress.sendKeys("Ushus");

	}

	public void registerFillFormCityDetails() {

		WebElement elemCity=driver.findElement(By.xpath("//input[@name='city']"));
		elemCity.sendKeys("Chengannur");

	}

	public void registerFillFormStateDetails() {

		WebElement elemState=driver.findElement(By.xpath("//input[@name='state']"));
		elemState.sendKeys("Kerala");



	}

	public void registerFillFormPostalCodeDetails() {

		WebElement elemPC=driver.findElement(By.xpath("//input[@name='postalCode']"));
		elemPC.sendKeys("689521");



	}

	public void registerFillFormCountryDetails() {

		WebElement elemCountry=driver.findElement(By.xpath("//select[@name='country']"));
		Select elemCountryDropDown=new Select(elemCountry);
		elemCountryDropDown.selectByValue("ANTIGUA AND BARBUDA");



	}

	public void registerFillFormUserNameDetails() {

		WebElement elemUname=driver.findElement(By.xpath("//input[@id='email']"));
		elemUname.sendKeys("User23");

	}

	public void registerFillFormPasswordDetails() {

		WebElement elemPass=driver.findElement(By.xpath("//input[@name='password']"));
		elemPass.sendKeys("User345");

	}

	public void registerFillFormCPasswordDetails() {

		WebElement elemCPass=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		elemCPass.sendKeys("User345");


	}

	public void registerFormSubmitBtnDetails() {
		
		WebElement submitBtn=driver.findElement(By.xpath("//input[@name='submit']"));
		submitBtn.click();
		
	}

}
