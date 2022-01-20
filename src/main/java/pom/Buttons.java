package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Buttons {
	
	WebDriver driver;

	public Buttons(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Buttons']")
	public WebElement chooseButtons;
	
	@FindBy(xpath = "//button[normalize-space()='Primary']")
	public WebElement choosePrimaryButton;
	
	@FindBy(xpath = "//button[normalize-space()='Success']")
	public WebElement chooseSuccessButton;
	
	@FindBy(xpath = "//button[normalize-space()='Info']")
	public WebElement chooseInfoButton;
	
	@FindBy(xpath = "//button[normalize-space()='Warning']")
	public WebElement chooseWarnningButton;
	
	@FindBy(xpath = "//button[normalize-space()='Danger']")
	public WebElement chooseDangerButton;
	
	@FindBy(xpath = "//button[normalize-space()='Link']")
	public WebElement chooseLinkButton;
	
	@FindBy(xpath = "//button[normalize-space()='Left']")
	public WebElement chooseLeftButton;
	
	@FindBy(xpath = "//button[normalize-space()='Middle']")
	public WebElement chooseMiddleButton;
	
	@FindBy(xpath = "//button[normalize-space()='Right']")
	public WebElement chooseRightButton;
	
	@FindBy(xpath = "//button[normalize-space()='1']")
	public WebElement choose1Button;
	
	@FindBy(xpath = "//button[normalize-space()='2']")
	public WebElement choose2Button;
	
	@FindBy(xpath = "//button[@id='btnGroupDrop1']")
	public WebElement chooseDropdownButton;
	
	@FindBy(xpath = "//a[normalize-space()='Dropdown link 2']")
	public WebElement chooseDropdown2Button;

}
