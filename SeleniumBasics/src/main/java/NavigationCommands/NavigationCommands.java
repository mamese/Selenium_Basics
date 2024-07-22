package NavigationCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\MyPc\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.javatpoint.com/method-in-java");
		driver.manage().window().maximize();
		driver.navigate().back();//going back from active window
		driver.navigate().forward();//going forward from active widow
		driver.navigate().refresh();//refresh the window 
		driver.navigate().to("https://github.com/mamese/Selenium-Basics");//upward another Url in the window
		driver.close();
	}

}
