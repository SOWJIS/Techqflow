package TestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BeforeAfterMethod {
	  WebDriver driver;
	  @BeforeMethod
	    void openApp()
	    {
	   	 driver=new EdgeDriver();
	   	 driver.get("https://demo.guru99.com/v4");
	    }
	  @Test(priority=1)
	    void Login() {
	   	 driver.findElement(By.name("uid")).sendKeys("mngr564832");
	     driver.findElement(By.name("password")).sendKeys("panUrEj");
	     driver.findElement(By.name("btnLogin")).click();
	    }

	  @Test(priority=2)
	    void search()
	    {
	   	 System.out.println("This is search");
	    }
	    @Test(priority=3)
	    void close()
	    {
	        driver.close();
	    }
	}




