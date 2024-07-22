package org.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
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
