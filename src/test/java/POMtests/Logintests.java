   package POMtests;
    import java.time.Duration;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
	import POM.Loginpage;
	public class Logintests {
	   WebDriver driver;
	   Loginpage OBJLoginPage;
	   @BeforeClass
	   void Setup()
	   {
	   	driver=new EdgeDriver();
	   	OBJLoginPage= new Loginpage();
	   	
	   	OBJLoginPage.URL();
	   	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  	
	   }
	   @Test(priority=1)
	   void Header()
	   {
	       OBJLoginPage.VerifyHeader();
	      
	   }  
	   @Test(priority=2)
	   void Login()
	   {
	   	OBJLoginPage.VerifyLogin();
	   }
	   @AfterClass
	   void CloseApp()
	   {
	        driver.close();
	   }
	}




