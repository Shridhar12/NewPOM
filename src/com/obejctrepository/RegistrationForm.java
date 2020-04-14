package com.obejctrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationForm {
	WebDriver driver;
	public RegistrationForm(WebDriver driver){
		this.driver=driver;
		}
	By register=By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p/font/a");
	
	public WebElement register(){
	return driver.findElement(register);
	}

}
