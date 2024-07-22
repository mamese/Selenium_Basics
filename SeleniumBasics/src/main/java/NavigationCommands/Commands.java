package NavigationCommands;

import org.openqa.selenium.By;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Commands
{
	//To verify Swag labs logins
	
	public void verifySwagLabsLogin() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("problem_user");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");	
		WebElement login=driver.findElement(By.id("login-button"));
		login.click();
	
	}
	//To verify isSelected
	
	public void verifyIsSelected()
	{
	boolean isButtonSelected;
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/register");
	WebElement radioButtonMale=driver.findElement(By.xpath("//input[@id='gender-male']"));
	isButtonSelected=radioButtonMale.isSelected();
	System.out.println("Male element before Selection" +isButtonSelected);
	radioButtonMale.click();
	isButtonSelected=radioButtonMale.isSelected();
	System.out.println("Male element After Selection" +isButtonSelected);
	}
	
	//To Verify isEnabled
	 
	public void verifyIsEnabled()
	{
		boolean isButtonEnabled;
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement subscribeButton=driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']"));
		 isButtonEnabled=subscribeButton.isEnabled();
		System.out.println("Button is enabled:" +isButtonEnabled);
		driver.close();
	}
	//To Verify isDisplayed
	
	public void verifyIsDisplayed()
	{
		boolean isButtonDisplayed;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		WebElement voteButton=driver.findElement(By.xpath("vote-poll-1"));
		isButtonDisplayed=voteButton.isDisplayed();
		System.out.println("Button is displayed" +isButtonDisplayed);
		driver.close();
		
	}
	//To Verify Values from DropDown
	
	public void verifyvaluesFromDropdown()
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement countryDropDown=driver.findElement(By.xpath("//select[@name='country']"));
		Select select=new Select(countryDropDown);
		//select.selectByVisibleText("ANTARCTICA");
		//select.selectByValue("BAHAMAS");
		select.selectByIndex(9);
		WebElement getCountryName=select.getFirstSelectedOption();
		System.out.println(getCountryName.getText());
		}
	
	//To Verify Total Dropdown Values
	
	public void getTotalAllDropdownValues()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://demo.guru99.com/test/newtours/register.php");
		WebElement dropdownCountry=driver.findElement(By.xpath("//select[@name='country']"));
		Select select=new Select(dropdownCountry);
		List<WebElement>dropdownlist=select.getOptions();
		System.out.println("Total number of valuesin dropdown list "+dropdownlist.size());
	}
	//Verify Simple Alert
		public void verifySimpleAlert()
		{
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/alerts");
			WebElement Simplealert=driver.findElement(By.xpath("//button[@id='alertButton']"));
			Simplealert.click();
			Alert alert=driver.switchTo().alert();
			alert.accept();
			driver.close();
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Commands object=new Commands(); //(classname object=new classname();
		//object. verifySwagLabsLogin(); //object.methodname();
		//object.verifyIsSelected();
		//object.verifyIsEnabled();
        //object.verifyIsDisplayed();
        //object.verifyvaluesFromDropdown();
        object. verifySimpleAlert();
        }

	
	}
	
	
	
	

}
