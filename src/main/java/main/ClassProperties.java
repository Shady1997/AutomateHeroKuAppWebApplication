package main;

import java.io.FileInputStream;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

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

public class ClassProperties {

	WebDriver driver;
	FileInputStream readProperty;
	AutoComplete autoComplete;
	Buttons buttons;
	CheckBox checkBox;
	DatePicker datePicker;
	DragAndDrop dragAndDrop;
	EnableAndDisableElement enableAndDisableElement;
	FileUpload fileUpload;
	KeyAndMousPress keyAndMousPress;
	Modal modal;
	PageScroll pageScroll;
	RadioButtons radioButtons;
	SwitchWindow switchWindow;
	CompleteWebForn completeWebForn;
	JavascriptExecutor js;
	Actions builder;
	Action dragDrop;
	String currentHandle;

}
