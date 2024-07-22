package NavigationCommands;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	// To Verify Right Click
	public void verifyRightClick()
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightClick=driver.findElement(By.xpath(""));
		Actions action=new Actions(driver);
		action.contextClick(rightClick).build().perform();
		driver.close();
		}
		
		// To Verify Double Click
		public void verifyDoubleClick()
		{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement doubleClick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions action=new Actions(driver);
		action.contextClick(doubleClick).build().perform();
		Alert alertObject=driver.switchTo().alert();
		alertObject.accept();
		driver.close();
		}
		//To Verify Mouse Hover
				public void verifyMouseHover()
						{
					WebDriver driver=new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("https://demoqa.com/menu/");
								}
						
						}

		
		
		public static void main(String[] args) 
		{
		ActionClass object = new ActionClass();
		object.verifyRightClick();
		object.verifyDoubleClick();
		}
}
		

