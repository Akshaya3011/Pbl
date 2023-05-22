package BaseAction;

import org.openqa.selenium.WebElement;

import Binding.Hooks;

public class PageAction extends Hooks{
	
	//click
	
	public static void ClickOnElement(WebElement ele) {
		ele.click();
	}
	
	//sendkeys
	
	public static void EnterText(WebElement ele, String text) {
		ele.sendKeys(text);
	}
	
	

}
