package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoComplete {

	WebDriver driver;

	public AutoComplete(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Autocomplete']")
	public WebElement chooseAutoComplete;
	
	@FindBy(xpath = "//input[@id='autocomplete']")
	public WebElement userAddress;
	
	@FindBy(xpath = "//input[@id='street_number']")
	public WebElement streetAddress;
	
	@FindBy(xpath = "//input[@id='route']")
	public WebElement streetAddress2;
	
	@FindBy(xpath = "//input[@id='locality']")
	public WebElement city;
	
	@FindBy(xpath = "//input[@id='administrative_area_level_1']")
	public WebElement state;
	
	@FindBy(xpath = "//input[@id='postal_code']")
	public WebElement zipCode;
	
	@FindBy(xpath = "//input[@id='country']")
	public WebElement country;
	
	@FindBy(xpath = "//a[@id='logo']")
	public WebElement returnBack;

}
