package pageEvents;

import org.testng.Assert;

import pageObjects.LoginPageElements;
import utils.ElementFetch;
import utils.NewExcelLibrary;

public class LoginPageEvents {

	ElementFetch ele  = new ElementFetch();
	public void verifyIfLoginPageisloaded() {
	
		Assert.assertTrue(ele.getWebElements("XPATH", LoginPageElements.LoginText).size()>=0, "Element not found");
	}
	
	public void EnterCredentials() throws Exception {
		
		NewExcelLibrary obj= new NewExcelLibrary();
		//String memail = obj.readData("Sheet1", 0, 0);
		//String mpass = obj.readData("Sheet1", 0, 1);
		ele.getWebElement("XPATH", LoginPageElements.EMail).sendKeys(obj.readData("Sheet1", 0, 0));
		ele.getWebElement("XPATH", LoginPageElements.Pass).sendKeys(obj.readData("Sheet1", 0, 1));
	}
	



}
