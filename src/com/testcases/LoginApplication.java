package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.obejctrepository.ContactInfo;
import com.obejctrepository.RegistrationForm;
import com.obejctrepository.ToursTravelsLogin;

public class LoginApplication {

	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SSM\\AUTOMATION\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com");
		
		ToursTravelsLogin tr=new ToursTravelsLogin(driver);
		tr.signin().click();
		
		RegistrationForm Rf=new RegistrationForm(driver);
		Rf.register().click();
		
		ContactInfo ci=new ContactInfo(driver);
		ci.firstname().sendKeys("jason");
		ci.lastname().sendKeys("roy");
		ci.phone().sendKeys("123456789");
		ci.email().sendKeys("Test@gmail.com");
		
		ci.address().sendKeys("ABC State");
		ci.city().sendKeys("Bangalore");
		ci.state().sendKeys("Karnataka");
		ci.postalcode().sendKeys("12121");
		
		ci.usna().sendKeys("jason");
		ci.pasww().sendKeys("jason@123");
		ci.conpass().sendKeys("jason@123");
		ci.sub().click();
	
}
}