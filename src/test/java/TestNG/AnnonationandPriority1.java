package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class AnnonationandPriority1 {
	WebDriver driver;
	@Test(priority=1)
	void Openapp() {
		driver=new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
	}
	@Test (priority=2,dependsOnMethods= {"OpenApp"})
 void Login() {
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
	}
	@Test (priority=3,dependsOnMethods= {"Login"})
	void search() {
		System.out.println("this is search");
	}

	@Test (priority=4,dependsOnMethods= {"OpenApp"})
	void close() {
		driver.close();
	}
}
	

	 


	


