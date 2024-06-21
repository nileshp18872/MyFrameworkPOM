package pageEvents;

import base.BaseTest;
import pageObjects.HomePageElements;
import utils.ElementFetch;

public class HomePageEvents extends BaseTest{
	
	ElementFetch ele = new ElementFetch();
	public void signinButton() {
		
		ele.getWebElement("XPATH", HomePageElements.SigninButton).click();
		
	}

}
