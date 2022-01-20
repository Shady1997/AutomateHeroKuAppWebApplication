package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageScroll {
	
	WebDriver driver;

	public PageScroll(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Page Scroll']")
	public WebElement choosePageScroll;
	
	@FindBy(xpath = "//input[@id='name']")
	public WebElement fullName;
	
	@FindBy(xpath = "//input[@id='date']")
	public WebElement date;

}
