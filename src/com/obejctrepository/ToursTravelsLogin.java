package com.obejctrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToursTravelsLogin {
	
	WebDriver driver;
	public ToursTravelsLogin(WebDriver driver){
		this.driver=driver;
	}
	By signin=By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a");
	
	public WebElement signin()
	{
		return driver.findElement(signin);
	}
	
	
}
