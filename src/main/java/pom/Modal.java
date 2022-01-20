package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Modal {
	
	WebDriver driver;

	public Modal(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Modal']")
	public WebElement chooseModal;
	
	@FindBy(xpath = "//button[@id='modal-button']")
	public WebElement openModal;
	
	@FindBy(xpath = "//button[@id='ok-button']")
	public WebElement okButton;
	
	@FindBy(xpath = "//button[@id='close-button']")
	public WebElement closeButton;

}
