package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import base.PageBaseClass;

/*
 * Add Issue Class is used to add Issues in CFO_Onsite
 */
public class AddIssue extends PageBaseClass{
	
	public WebDriver driver;
	
	public AddIssue(WebDriver driver,ExtentTest logger ){
		this.driver = driver;
		this.logger=logger;
		PageFactory.initElements(driver, this);
	}
	
	/****************** WebElements***********************/
	
	@FindBy(xpath="//*[@id=\"KEY_BUTTON_Add-btnIconEl\"]")
	public WebElement addIssue1;
	
	@FindBy(xpath="//*[@id=\"KEY_BUTTON_Add\"]")
	public WebElement addIssue2;
	
	/******Click on Add Issue******/
	public void addIssue1() {
		implicitTimewait(50);
		elementClick(addIssue1);
		driver.switchTo().frame(driver.findElement(By.id("contentframe")));
	}
	
	public void addIssue2() {
		implicitTimewait(50);
		elementClick(addIssue2);
	}
	
}
