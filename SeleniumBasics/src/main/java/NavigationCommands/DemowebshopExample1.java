package NavigationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemowebshopExample1 {
	//To verify Demo web shop
	public void demowebshop()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//your personal details in Registration page
		
	    WebElement Register=driver.findElement(By.className("ico-register"));
	    Register.click();
	    WebElement Fristname=driver.findElement(By.id("FristName"));
	    Fristname.sendKeys("Mary");
	    WebElement Lastname=driver.findElement(By.id("LastName"));
	    Lastname.sendKeys("Sebastian");
	    WebElement Email=driver.findElement(By.id("Email"));
	    Email.sendKeys("marymegha1698@gmail.com");
	    
	    //your password in Registration page
	    WebElement Password=driver.findElement(By.id("Password"));
	    Password.sendKeys("Mary123");
	    WebElement Confirmpassword=driver.findElement(By.id("ConfirmPassword"));
	    Confirmpassword.sendKeys("Mary123");
	    WebElement register=driver.findElement(By.id("register-button"));
	    register.click();
	    
	    //Login page
	    WebElement Login=driver.findElement(By.className("ico-login"));
	    Login.click();
	    WebElement Email1=driver.findElement(By.id("Email"));
	    Email1.sendKeys("marymegha1698@gmail.com");
	    WebElement Password1=driver.findElement(By.id("Password"));
	    Password1.sendKeys("Mary123");
	    WebElement Login1=driver.findElement(By.className("button-1 login-button"));
	    Login1.click();
	    
	     }

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 DemowebshopExample1 object=new  DemowebshopExample1();
		 object.demowebshop();
		 }

}
