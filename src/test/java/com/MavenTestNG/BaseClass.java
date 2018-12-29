package com.MavenTestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseClass {
	
	@Test
	public void setup() {
	System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	
	System.out.println("hello world");
	System.out.println("It's me Sammy");
	
	}

}
