package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompleteWebForn {
	
	WebDriver driver;

	public CompleteWebForn(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Complete Web Form']")
	public WebElement chooseCompleteWebForm;

	@FindBy(xpath = "//input[@id='first-name']")
	public WebElement firstName;
	
	@FindBy(xpath = "//input[@id='last-name']")
	public WebElement lastName;
	
	@FindBy(xpath = "//input[@id='job-title']")
	public WebElement jobTitle;
	
	@FindBy(xpath = "//input[@id='radio-button-2']")
	public WebElement education;
	
	@FindBy(xpath = "//input[@id='checkbox-1']")
	public WebElement gender;
	
	@FindBy(xpath = "//select[@id='select-menu']")
	public WebElement experience;
	
	@FindBy(xpath = "//input[@id='datepicker']")
	public WebElement clickDatePicker;
	
	@FindBy(xpath = "//td[@class='day'][normalize-space()='3']")
	public WebElement chooseDay;
	
	@FindBy(xpath = "//a[@role='button']")
	public WebElement submitForm;

}
