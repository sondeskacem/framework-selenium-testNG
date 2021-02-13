package com.todos.e2e.pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.todos.e2e.utils.BasePage;

public class TodoPage extends BasePage{
	
	public TodoPage() throws IOException{
		
		PageFactory.initElements(driver, this);
	}
	
	/*Locators*/
	final static String INPUT_TEXT = "//input[@ng-model='newTodo']";
	final static String ELEMENT_TODO = "//label[@class='ng-binding']";
	final static String CHECKBOX = "//input[@type= 'checkbox']";

	
	/*@FinBy*/
	//@FindBy(id = INPUT_TEXT)
	//private WebElement inputText;
	@FindBy(how = How.XPATH, using = INPUT_TEXT)
	public static WebElement inputText;
	@FindBy(how = How.XPATH, using = ELEMENT_TODO)
	public static WebElement elementTodo;
	@FindBy(how = How.XPATH, using = CHECKBOX)
	public static WebElement checkbox;
	
	/*Methods*/
	public void submitTodo(String todo) {
		writeText(inputText, todo);
		inputText.sendKeys(Keys.ENTER);	
		}
	
	public Boolean isElementDisplayed(WebElement element) {
		
		Boolean isElementDisplayed = element.isDisplayed();
		return isElementDisplayed;
	}
	
	public String checkElementContains(WebElement element) {
		
		String elementToget = element.getText();
		return elementToget;
	}
	
	public Boolean IsCheckBoxSelected(WebElement element) {
		
		Boolean IsCheckBoxSelected = element.isSelected();
		return IsCheckBoxSelected;
	}
	
	public String checkTextIsRemoved(WebElement element) {

		String pageSource = driver.getPageSource();
		return pageSource;
		}

}
