package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDrop {
	
	WebDriver driver;

	public DragAndDrop(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Drag and Drop']")
	public WebElement chooseDragAndDrop;
	
	@FindBy(id = "image")
	public WebElement from;
	
	@FindBy(id = "box")
	public WebElement to;

}
