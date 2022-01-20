package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBox {
	
	WebDriver driver;

	public CheckBox(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Checkbox']")
	public WebElement chooseCheckBoxs;
	
	@FindBy(xpath = "//input[@id='checkbox-1']")
	public WebElement chooseCheckBox1;
	
	@FindBy(xpath = "//input[@id='checkbox-2']")
	public WebElement chooseCheckBox2;
	
	@FindBy(xpath = "//input[@id='checkbox-3']")
	public WebElement chooseCheckBox3;

}
