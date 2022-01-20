package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUpload {
	
	WebDriver driver;

	public FileUpload(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='File Upload']")
	public WebElement chooseFileUpload;
	
	@FindBy(xpath = "//button[normalize-space()='Choose']")
	public WebElement uploadFile;
	
	@FindBy(xpath = "//button[normalize-space()='Reset']")
	public WebElement reset;

}
