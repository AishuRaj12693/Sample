package org.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GOKUL\\eclipse-workspace\\Facebook\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com ");
		WebElement txtUserName=driver.findElement(By.name("username"));
		
		txtUserName.sendKeys("Saradha");
		WebElement txtPassword=driver.findElement(By.name("password"));
		txtPassword.sendKeys("Saratha@12345");
	}

	
	

}


//Completed