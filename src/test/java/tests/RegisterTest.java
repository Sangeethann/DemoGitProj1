package tests;

import org.testng.annotations.Test;

import pageobjects.RegisterPage;
import utilities.Base;

public class RegisterTest extends Base {

	@Test(priority=0)
	public void register() {

		RegisterPage obj=new RegisterPage(driver);
		obj.registerDetails();
	}

	@Test(priority=1)
	public void registerFillFormFirstNameTest() {

		RegisterPage obj=new RegisterPage(driver);
		obj.registerFillFormFirstNameDetails();
	}

	@Test(priority=2)
	public void registerFillFormLastNameTest() {

		RegisterPage obj=new RegisterPage(driver);
		obj.registerFillFormLastNameDetails();
	}

	@Test(priority=3)
	public void registerFillFormPhoneTest() {

		RegisterPage obj=new RegisterPage(driver);
		obj.registerFillFormPhoneDetails();
	}

	@Test(priority=4)
	public void registerFillFormEmailTest() {

		RegisterPage obj=new RegisterPage(driver);
		obj.registerFillFormEmailDetails();
	}

	@Test(priority=5)
	public void registerFillFormAddressTest() {

		RegisterPage obj=new RegisterPage(driver);
		obj.registerFillFormAddressDetails();
	}

	@Test(priority=6)
	public void registerFillFormCityTest() {

		RegisterPage obj=new RegisterPage(driver);
		obj.registerFillFormCityDetails();
	}

	@Test(priority=7)
	public void registerFillFormStateTest() {

		RegisterPage obj=new RegisterPage(driver);
		obj.registerFillFormStateDetails();
	}

	@Test(priority=8)
	public void registerFillFormPostalCodeTest() {

		RegisterPage obj=new RegisterPage(driver);
		obj.registerFillFormPostalCodeDetails();
	}

	@Test(priority=9)
	public void registerFillFormCountryTest() {

		RegisterPage obj=new RegisterPage(driver);
		obj.registerFillFormCountryDetails();
	}

	@Test(priority=10)
	public void registerFillFormUserNameTest() {

		RegisterPage obj=new RegisterPage(driver);
		obj.registerFillFormUserNameDetails();
	}
	
	@Test(priority=11)
	public void registerFillFormPasswordTest() {

		RegisterPage obj=new RegisterPage(driver);
		obj.registerFillFormPasswordDetails();
	}

	@Test(priority=12)
	public void registerFillFormCPasswordTest() {

		RegisterPage obj=new RegisterPage(driver);
		obj.registerFillFormCPasswordDetails();
	}
	
	@Test(priority=13)
	public void registerFormSubmitBtnTest() {

		RegisterPage obj=new RegisterPage(driver);
		obj.registerFormSubmitBtnDetails();
	}


}
