package qa.tests;

import org.testng.annotations.Test;


import com.aventstack.extentreports.Status;


import base.BaseTest;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utils.ElementFetch;
import utils.NewExcelLibrary;

public class Testcase1 extends BaseTest {

ElementFetch ele = new ElementFetch();
HomePageEvents homepage = new HomePageEvents();
LoginPageEvents loginpage = new LoginPageEvents();

  @Test
  public void sampleMethodForEnteringCredentials() throws Exception {
	  logger.info("SIgnIn into Login Page");
	  homepage.signinButton();
	  logger.info("Verifing LoginPage is Loaded");
	  loginpage.verifyIfLoginPageisloaded();
	  logger.info("Enter the Credentials");
	  loginpage.EnterCredentials();
	  
	  NewExcelLibrary obj= new NewExcelLibrary();
	  if(Status.PASS!=null) {
	  logger.log(Status.PASS, "User Login Successfull with: "+ obj.readData("Sheet1", 0, 0)+" & "+obj.readData("Sheet1", 0, 1));
	  }
	  else
	  {
	  logger.log(Status.FAIL, "User Login Failed with: " + obj.readData("Sheet1", 0, 0)+" & "+obj.readData("Sheet1", 0, 1));
	  }
	  
	  
	  
	  
  }
}
