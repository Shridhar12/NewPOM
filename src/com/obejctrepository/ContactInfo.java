package com.obejctrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactInfo {
	WebDriver driver;
	public ContactInfo(WebDriver driver)
	{
		this.driver=driver;
	}
	//contactinformation
	By FirstName=By.xpath("//input[@name='firstName']");
	By LastName=By.xpath("//input[@name='lastName']");
	By Phone=By.xpath("//input[@name='phone']");
	By Email=By.xpath("//input[@id='userName']");
	
	//Mailing Address
	
	By Address=By.xpath("//input[@name='phone']");
	By City=By.xpath("//input[@name='city']");
	By state=By.xpath("//input[@name='state']");
	By postalcode=By.xpath("//input[@name='postalCode']");
	By USNA=By.id("email");
	By passw=By.xpath("//input[@name='password']");
	By conpassw=By.xpath("//input[@name='confirmPassword']");
	By sub=By.xpath("//input[@name='register']");
	
	
	public WebElement firstname(){
		return driver.findElement(FirstName);
		}
	
	public WebElement lastname(){
		return driver.findElement(LastName);
		}
	public WebElement phone(){
		return driver.findElement(Phone);
		}
	public WebElement email(){
		return driver.findElement(Email);
		}
	
	public WebElement address(){
		return driver.findElement(Address);
		}
	
	public WebElement city(){
		return driver.findElement(City);
		}
	
	public WebElement state(){
		return driver.findElement(state);
		}
	
	public WebElement postalcode(){
		return driver.findElement(postalcode);
		}
	public WebElement usna(){
		return driver.findElement(USNA);
		}
	public WebElement pasww(){
		return driver.findElement(passw);
		}
	public WebElement conpass(){
		return driver.findElement(conpassw);
		}
	public WebElement sub(){
		return driver.findElement(sub);
		}
	
	
}
