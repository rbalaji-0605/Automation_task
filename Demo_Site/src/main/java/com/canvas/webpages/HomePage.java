package com.canvas.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id='editor']/div/input[@class='button line']")
	public WebElement drawLine;

	
	@FindBy(xpath="//div[@id='editor']/div/input[@class='button rectangle']")
	public WebElement drawRectangle;
	
	@FindBy(xpath="//div[@id='editor']/div/input[@class='button eraser']")
	public WebElement eraserOption;
	
	
	
	
	
	
	public void click_draw_line_option() {
		drawLine.click();
		
	}
	
	public void click_draw_rectangle_option() {
		drawRectangle.click();
		

	}
	public void click_eraser() {
		eraserOption.click();
	}
	
	
		

	
	
}
