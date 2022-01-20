package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtons {
	
	WebDriver driver;

	public RadioButtons(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Radio Button']")
	public WebElement chooseRadioButtons;
	
	@FindBy(xpath = "//input[@id='radio-button-1']")
	public WebElement firstRadioButton;
	
	@FindBy(xpath = "//input[@value='option2']")
	public WebElement secondRadioButton;
	
	@FindBy(xpath = "//input[@value='option3']")
	public WebElement thirdRadioButton;

}
