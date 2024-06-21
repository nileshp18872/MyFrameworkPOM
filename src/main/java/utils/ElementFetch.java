package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseTest;

public class ElementFetch {

	 public WebElement getWebElement(String indetifierType, String indetifierValue) {
		 switch(indetifierType) {
		 case "XPATH" :
		   return BaseTest.driver.findElement(By.xpath(indetifierValue));
		   
		 case "CSS" :
			   return BaseTest.driver.findElement(By.cssSelector(indetifierValue)); 
		
		 case "CLASSNAME" :
			   return BaseTest.driver.findElement(By.className(indetifierValue)); 
		
		 case "ID" :
			   return BaseTest.driver.findElement(By.id(indetifierValue)); 
			   
		 case "LINKTEXT" :
			   return BaseTest.driver.findElement(By.linkText(indetifierValue)); 
		
		 case "NAME" :
			   return BaseTest.driver.findElement(By.name(indetifierValue)); 
		
		 case "PARTIALLINKTEXT" :
			   return BaseTest.driver.findElement(By.partialLinkText(indetifierValue)); 
		
		 case "TAGNAME" :
			   return BaseTest.driver.findElement(By.tagName(indetifierValue)); 
			   
		 default :
			   return null;	
		 }
	 }
		 
		 public List<WebElement> getWebElements(String indetifierType, String indetifierValue) {
			 switch(indetifierType) {
			 case "XPATH" :
			   return BaseTest.driver.findElements(By.xpath(indetifierValue));
			   
			 case "CSS" :
				   return BaseTest.driver.findElements(By.cssSelector(indetifierValue)); 
			
			 case "CLASSNAME" :
				   return BaseTest.driver.findElements(By.className(indetifierValue)); 
			
			 case "ID" :
				   return BaseTest.driver.findElements(By.id(indetifierValue)); 
				   
			 case "LINKTEXT" :
				   return BaseTest.driver.findElements(By.linkText(indetifierValue)); 
			
			 case "NAME" :
				   return BaseTest.driver.findElements(By.name(indetifierValue)); 
			
			 case "PARTIALLINKTEXT" :
				   return BaseTest.driver.findElements(By.partialLinkText(indetifierValue)); 
			
			 case "TAGNAME" :
				   return BaseTest.driver.findElements(By.tagName(indetifierValue)); 
				   
			 default :
				   return null;	
			 }
	 }
}
