package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Annotationandpriority {

	WebDriver driver; 
	@Test(priority=1)
	void openapp()
	{
		driver=new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		
	}
	@Test(priority=2)
	void Login()
	{
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
	}
	 @Test(priority=3)
	 void search()
	 {
		 System.out.println("This is search");
	 }
	 @Test(priority=4)
	    void closeApp()
	    {
	        driver.close();


	}
}


