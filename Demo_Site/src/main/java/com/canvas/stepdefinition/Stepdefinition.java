package com.canvas.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.canvas.baseclass.BaseClass;
import com.canvas.webpages.HomePage;
import com.gargoylesoftware.htmlunit.javascript.host.dom.ShadowRoot;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Stepdefinition extends BaseClass {

	
	public static HomePage home;
	public Actions action;

	@Given("User navigates to canvas webpage")
	public void user_navigates_to_canvas_webpage() throws InterruptedException {
		browser_initialization("chrome");
		driver.get("https://www.htmlcanvasstudio.com");
		
		 WebElement element = driver.findElement(By.id("exampleId"));

	    
		
	  
	}
	@When("User clicks draw a line option")
	public void user_clicks_draw_a_line_option() throws AWTException, InterruptedException {
		
	    home=new HomePage(driver);
	 
	    home.click_draw_line_option();
	    
	    
	    
	}
	@When("User draws a vertical line")
	public void user_draws_a_vertical_line() {
		action=new Actions(driver);
		
		action.moveByOffset(100,100).clickAndHold().moveByOffset(0,180).click().build().perform();
		
	  
	}
	@When("User draws a horizontal line")
	public void user_draws_a_horizontal_line() {
		action.moveByOffset(-90,-90).clickAndHold().moveByOffset(180,0).click().build().perform();
	
	}
	@When("User clicks draw a rectangle option")
	public void user_clicks_draw_a_rectangle_option() {
		
		home.click_draw_rectangle_option();
	
	}
	@When("User draws a rectangle")
	public void user_draws_a_rectangle() {
		
	
		action.moveByOffset(-48,295).clickAndHold().moveByOffset(182,103).click().build().perform();
		
	    
	}
	@When("User clicks eraser option")
	public void user_clicks_eraser_option() {
		
		home.click_eraser();
	 
	}
	@When("User erases the horizontal line")
	public void user_erases_the_horizontal_line() {
		action.moveByOffset(-139,190).clickAndHold().moveByOffset(180,0).click().build().perform();
	}



	
}
