package page.tests;

import org.openqa.selenium.WebDriver;

import page.objects.HomePage;
import utility.Constant;
import utility.ExcelUtils;
import page.objects.HomePage;
import page.objects.Register;

public class RegisterTest {
	    // Method for opening home page
		public static void openHomePage(WebDriver wd) {
			if (!wd.getCurrentUrl().equals(HomePage.PAGE_URL)) {
				wd.navigate().to(HomePage.PAGE_URL);
			}
		}
		// Method that fills registration form
		public static void fillRegForm(WebDriver wd, int i) throws Exception {

			String data;
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET_NAME_1);

			// First name
			Register.clickFirstName(wd);
			data = ExcelUtils.getCellData(i, 0);
			Register.sendKeysFirstName(wd, data);
		//	Thread.sleep(3000);
			
			// LastName
			Register.clickLastName(wd);
			data = ExcelUtils.getCellData(i, 1);
			Register.sendKeysLastName(wd, data);
		//	Thread.sleep(3000);
			
			// Username
			Register.clickUsername(wd);
			data = ExcelUtils.getCellData(i, 2);
			Register.sendKeysUsername(wd, data);
		//	Thread.sleep(3000);
			
			// Email
			Register.clickEmail(wd);
			data = ExcelUtils.getCellData(i, 3);
			Register.sendKeysEmail(wd, data);
		//	Thread.sleep(3000);
			
			// Password
			Register.clickPassword(wd);
			data = ExcelUtils.getCellData(i, 4);
			Register.sendKeysPassword(wd, data);
		//	Thread.sleep(3000);
			
			// Submit
			Register.clickRegisterLink(wd);

		}
		
		public static void testOne(WebDriver wd)throws Exception {
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET_NAME_1);
			fillRegForm(wd, 3);
		}
		
		public static void testAllData(WebDriver wd) throws Exception {
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET_NAME_1);
			for (int i = 1; i < ExcelUtils.getWorkSheet().getLastRowNum()+1; i++) {
				fillRegForm(wd, i);
			
			}
			
		}

}

