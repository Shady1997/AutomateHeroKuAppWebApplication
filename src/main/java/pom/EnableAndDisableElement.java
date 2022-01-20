package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnableAndDisableElement {
	
	WebDriver driver;

	public EnableAndDisableElement(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Enabled and disabled elements']")
	public WebElement chooseEnableAndDisable;
	
	@FindBy(xpath = "//input[@id='disabledInput']")
	public WebElement chooseDisable;
	
	@FindBy(xpath = "//input[@id='input']")
	public WebElement chooseEnable;

}
