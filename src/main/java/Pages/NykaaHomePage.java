package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseAction.PageAction;
import Binding.Hooks;




public class NykaaHomePage extends Hooks {
	
	public static WebElement SearchArea =driver.findElement(By.xpath("//input[@placeholder='Search on Nykaa']"));
	
	 public static void ClickAndEnterETextInSearchArea(String dataForSearch)
	 {
		 PageAction.ClickOnElement(SearchArea);
		 PageAction.EnterText(SearchArea,dataForSearch);
	 }

}
