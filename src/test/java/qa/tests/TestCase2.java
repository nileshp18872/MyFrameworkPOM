package qa.tests;

import org.testng.annotations.Test;

import utils.NewExcelLibrary;

public class TestCase2 {
	
	@Test
	 public void readExcelTest() throws Exception {
	  NewExcelLibrary obj= new NewExcelLibrary();
	  //Call readData method from ExcelLibrary class to get the value of Particular cell
	  String datString=obj.readData("Sheet1", 0, 1);
	  System.out.println("The data is: "+datString);
	  
	   
	 }

}
