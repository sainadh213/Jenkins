package Sai;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleTestTest {
	@Test
	public void googleTest()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("The Title is :"+driver.getTitle());
		System.out.println("The url is :"+driver.getCurrentUrl());
	}

}
