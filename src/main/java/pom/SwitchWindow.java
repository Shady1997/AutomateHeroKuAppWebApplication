package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwitchWindow {

	WebDriver driver;

	public SwitchWindow(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Switch Window']")
	public WebElement chooseSwitchWindows;

	@FindBy(xpath = "//button[@id='new-tab-button']")
	public WebElement openNewTap;
	
	@FindBy(xpath = "//button[@id='alert-button']")
	public WebElement openAlret;

}
