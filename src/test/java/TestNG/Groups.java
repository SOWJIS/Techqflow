package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Groups {
	WebDriver driver; 
	@Test(priority=1)
	void openapp()
	{
		driver=new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		
	}
	@Test(priority=2,groups= {"sanity"})
	void Login() throws InterruptedException
	{
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		driver.findElement(By.name("login-button")).click();
	}
	 @Test(priority=3,groups= {"sanity","regression"})
	 void search()
	 {
		 System.out.println("This is search");
	 }
	 @Test(priority=4,groups= {"sanity"})
	    void closeApp()
	    {
	        driver.close();


}
}
