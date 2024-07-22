package org.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MyPc\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.javatpoint.com/method-in-java");
		String Title=driver.getTitle();
		System.out.println(Title);
		String Url=driver.getCurrentUrl();
		System.out.println(Url);
		String Sourcecode=driver.getPageSource();
		System.out.println(Sourcecode);
		driver.close();
	}

}
