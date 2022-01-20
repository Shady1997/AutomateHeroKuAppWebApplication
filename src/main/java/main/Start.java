package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriverException;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import pom.AutoComplete;
import pom.Buttons;
import pom.CheckBox;
import pom.CompleteWebForn;
import pom.DatePicker;
import pom.DragAndDrop;
import pom.EnableAndDisableElement;
import pom.FileUpload;
import pom.KeyAndMousPress;
import pom.Modal;
import pom.PageScroll;
import pom.RadioButtons;
import pom.SwitchWindow;
import utility.Utility;

public class Start extends ClassProperties {

	@Parameters("browser")
	@BeforeTest
	private void prepareClassProperties(String browser) throws IOException {
		readProperty = new FileInputStream(
				"C:\\Users\\G525585\\eclipse-workspace\\AutomateHeroKuAppWebApplication\\src\\main\\java\\properties\\generalProperties.properties");
		Properties prop = new Properties();
		prop.load(readProperty);

		if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", prop.getProperty("firefoxdriver"));
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chromedriver"));
			driver = new ChromeDriver();
		} else {
			throw new IllegalArgumentException("Invalid browser value!!");
//			Change thread count 1 for sequential , 2 for parallel 3 ..browser..
		}

		autoComplete = new AutoComplete(driver);
		buttons = new Buttons(driver);
		checkBox = new CheckBox(driver);
		datePicker = new DatePicker(driver);
		dragAndDrop = new DragAndDrop(driver);
		enableAndDisableElement = new EnableAndDisableElement(driver);
		fileUpload = new FileUpload(driver);
		keyAndMousPress = new KeyAndMousPress(driver);
		modal = new Modal(driver);
		pageScroll = new PageScroll(driver);
		radioButtons = new RadioButtons(driver);
		switchWindow = new SwitchWindow(driver);
		completeWebForn = new CompleteWebForn(driver);
		builder = new Actions(driver);
		currentHandle = driver.getWindowHandle();
	}

	@Test(priority = 1)
	private void startApplication() throws InterruptedException, WebDriverException, IOException {

		// Mazimize current window
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// navigate to website
		driver.navigate().to("https://formy-project.herokuapp.com/");

		// take screenshot
		Utility.captureScreenshot(driver, "start");

		// wait for 5 sec
		Thread.sleep(5000);
	}

	@Test(priority = 2)
	private void chooseAutoCompleteLink() throws InterruptedException {

		autoComplete.chooseAutoComplete.click();

		// wait for 3 sec
		Thread.sleep(3000);

		Assert.assertEquals(driver.getPageSource().contains("Autocomplete"), true);
	}

	@Test(priority = 3)
	private void fillAutoCompleteData() throws InterruptedException {

		autoComplete.userAddress.sendKeys("13 mostafa kamel street");

		autoComplete.streetAddress.sendKeys("mostafa kamel street");

		autoComplete.streetAddress2.sendKeys("mostafa kamel street");

		autoComplete.city.sendKeys("Abu Kabeer");

		autoComplete.state.sendKeys("ard el fadan");

		// declare javascript executer object
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)", "");

		autoComplete.zipCode.sendKeys("44671");

		autoComplete.country.sendKeys("Egypt");

		js.executeScript("window.scrollBy(0,-100)", "");

		autoComplete.returnBack.click();

		Thread.sleep(3000);
	}

	@Test(priority = 4)
	private void chooseButtonsLink() throws InterruptedException {

		buttons.chooseButtons.click();

		Thread.sleep(5000);

		buttons.choosePrimaryButton.click();

		buttons.chooseSuccessButton.click();

		buttons.chooseInfoButton.click();

		buttons.chooseWarnningButton.click();

		buttons.chooseDangerButton.click();

		buttons.chooseLinkButton.click();

		buttons.chooseLeftButton.click();

		buttons.chooseMiddleButton.click();

		buttons.chooseRightButton.click();

		buttons.choose1Button.click();

		buttons.choose2Button.click();

		buttons.chooseDropdownButton.click();

		buttons.chooseDropdown2Button.click();

		autoComplete.returnBack.click();
	}

	@Test(priority = 5)
	private void chooseCheckBoxs() throws InterruptedException {

		checkBox.chooseCheckBoxs.click();

		Thread.sleep(5000);

		checkBox.chooseCheckBox1.click();

		checkBox.chooseCheckBox2.click();

		checkBox.chooseCheckBox3.click();

		Assert.assertEquals(driver.getPageSource().contains("Checkboxes"), true);

		autoComplete.returnBack.click();
	}

	@Test(priority = 6)
	private void chooseDatePicker() throws InterruptedException {

		datePicker.chooseDatePicker.click();

		Thread.sleep(5000);

		datePicker.startDatePicker.click();

		datePicker.clickNext.click();

		datePicker.chooseDateFromDatePicker.click();

		Assert.assertEquals(driver.getPageSource().contains("Datepicker"), true);

		autoComplete.returnBack.click();
	}

	@Test(priority = 7)
	private void chooseDragAndDrop() throws InterruptedException {

		dragAndDrop.chooseDragAndDrop.click();

		// Building a drag and drop action
		builder.clickAndHold(dragAndDrop.from).pause(Duration.ofSeconds(2)).moveToElement(dragAndDrop.to)
				.release(dragAndDrop.to).build().perform();

//		//Perform drag and drop
//		builder.dragAndDrop(dragAndDrop.from, dragAndDrop.to).perform();

		Assert.assertEquals(driver.getPageSource().contains("Drag the image into the box"), true);

		autoComplete.returnBack.click();
	}

	@Test(priority = 8)
	private void chooseEnableAndDisable() throws InterruptedException {

		js.executeScript("window.scrollBy(0,100)", "");

		enableAndDisableElement.chooseEnableAndDisable.click();

		Assert.assertEquals(enableAndDisableElement.chooseDisable.isDisplayed(), true);

		enableAndDisableElement.chooseEnable.sendKeys("shady ahmed");

		Assert.assertEquals(driver.getPageSource().contains("Enabled and Disabled elements"), true);

		autoComplete.returnBack.click();
	}

	@Test(priority = 9)
	private void chooseUploadFile() throws InterruptedException {

		fileUpload.chooseFileUpload.click();

		fileUpload.uploadFile.sendKeys("C:\\image.PNG");

		fileUpload.reset.click();

		fileUpload.uploadFile.sendKeys("C:\\image.PNG");

		Assert.assertEquals(driver.getPageSource().contains("File upload"), true);

		autoComplete.returnBack.click();
	}

	@Test(priority = 10)
	private void chooseKeyAndMousPress() throws InterruptedException {

		keyAndMousPress.chooseKeyAndMous.click();

		keyAndMousPress.name.sendKeys("shady ahmed");

		keyAndMousPress.button.click();

		Assert.assertEquals(driver.getPageSource().contains("Keyboard and Mouse Input"), true);

		autoComplete.returnBack.click();
	}

	@Test(priority = 11)
	private void chooseModal() throws InterruptedException {

		modal.chooseModal.click();

		modal.openModal.click();

		Thread.sleep(3000);

		modal.okButton.click();

		modal.closeButton.click();

		Assert.assertEquals(driver.getPageSource().contains("Modal"), true);

		autoComplete.returnBack.click();
	}

	@Test(priority = 12)
	private void choosePageScroll() throws InterruptedException {

		pageScroll.choosePageScroll.click();

		js.executeScript("window.scrollBy(0,300)", "");

		pageScroll.fullName.sendKeys("shady ahmed");

		pageScroll.date.sendKeys("11112022");

		js.executeScript("window.scrollBy(0,-300)", "");

		Assert.assertEquals(driver.getPageSource().contains("Large page content"), true);

		autoComplete.returnBack.click();
	}

	@Test(priority = 13)
	private void chooseRadioButtons() throws InterruptedException {

		radioButtons.chooseRadioButtons.click();

		radioButtons.firstRadioButton.click();

		radioButtons.secondRadioButton.click();

		radioButtons.thirdRadioButton.click();

		Assert.assertEquals(driver.getPageSource().contains("Radio buttons"), true);

		autoComplete.returnBack.click();
	}

	@Test(priority = 14)
	private void chooseSwitchWindows() throws InterruptedException {

		switchWindow.chooseSwitchWindows.click();

		// Get all the handles currently available
		Set<String> handles = driver.getWindowHandles();
		for (String actual : handles) {
			if (!actual.equalsIgnoreCase(currentHandle)) {
				// Switch to the opened tab
				driver.switchTo().window(actual);
			}
		}
		// opening the URL saved.
		driver.get(switchWindow.openNewTap.getAttribute("onclick").toString().substring(13, 48));

		switchWindow.chooseSwitchWindows.click();

		switchWindow.openAlret.click();

		driver.switchTo().alert().accept();

		Assert.assertEquals(driver.getPageSource().contains("Switch Window"), true);

		autoComplete.returnBack.click();
	}

	@Test(priority = 15)
	private void chooseCompleteWebForm() throws InterruptedException {

		completeWebForn.chooseCompleteWebForm.click();
		
		Utility.captureScreenshot(driver, "startApplication");

		Thread.sleep(3000);

		Assert.assertEquals(driver.getPageSource().contains("Complete Web Form"), true);

		completeWebForn.firstName.sendKeys("shady");

		completeWebForn.lastName.sendKeys("ahmed");

		completeWebForn.jobTitle.sendKeys("qc");

		completeWebForn.education.click();

		completeWebForn.gender.click();

		Select experience = new Select(completeWebForn.experience);
		experience.selectByIndex(2);

		completeWebForn.clickDatePicker.click();

		completeWebForn.chooseDay.click();
		
		Utility.captureScreenshot(driver, "filldata");

		completeWebForn.submitForm.click();

		Thread.sleep(3000);
		
		Utility.captureScreenshot(driver, "confirmationpage");

		Assert.assertEquals(driver.getPageSource().contains("Thanks for submitting your form"), true);

		autoComplete.returnBack.click();
	}

	@AfterTest
	private void closeApplication() {
		driver.quit();
	}

}
