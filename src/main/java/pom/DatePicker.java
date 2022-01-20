package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DatePicker {

	WebDriver driver;

	public DatePicker(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Datepicker']")
	public WebElement chooseDatePicker;
	
	@FindBy(xpath = "//input[@id='datepicker']")
	public WebElement startDatePicker;
	
	@FindBy(xpath = "//div[@class='datepicker-days']//th[@class='next'][normalize-space()='»']")
	public WebElement clickNext;
	
	@FindBy(xpath = "//td[normalize-space()='15']")
	public WebElement chooseDateFromDatePicker;

}
