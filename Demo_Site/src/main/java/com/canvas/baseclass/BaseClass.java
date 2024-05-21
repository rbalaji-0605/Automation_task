package com.canvas.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;



	public void browser_initialization(String browserName) {

		/***** Chrome Browser Initialization *****/


		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			
			ChromeOptions options=new ChromeOptions();
			options.addArguments("ignore-certificate-errors");
			options.addArguments("allow-running-insecure-content");
			driver=new ChromeDriver(options);
			driver.manage().window().maximize();

		
		}

		/***** Firefox Browser Initialization *****/


		else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();

		}

		/***** MS Edge Browser Initialization *****/


		else if(browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();

		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
	

	}



}
