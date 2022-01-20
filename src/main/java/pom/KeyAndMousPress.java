package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KeyAndMousPress {
	
	WebDriver driver;

	public KeyAndMousPress(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Key and Mouse Press']")
	public WebElement chooseKeyAndMous;
	
	@FindBy(xpath = "//input[@id='name']")
	public WebElement name;
	
	@FindBy(xpath = "//button[@id='button']")
	public WebElement button;


}
