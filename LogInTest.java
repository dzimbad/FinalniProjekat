package page.tests;

import org.openqa.selenium.WebDriver;
import utility.*;

import page.objects.HomePage;
import page.objects.LogIn;

public class LogInTest {
	
	
	// Method for opening HomePage
	public static void openHomePage(WebDriver wd) {
		if (!wd.getCurrentUrl().equals(HomePage.PAGE_URL)) {
			wd.navigate().to(HomePage.PAGE_URL);
		}
	}

	public static void fillLogInForm(WebDriver wd, int i) throws Exception {

		String data;
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET_NAME_1);
		// user
		LogIn.clickUser(wd);
		data = ExcelUtils.getCellData(i, 2);
		LogIn.sendKeysUser(wd, data);
		Thread.sleep(3000);

		// pass
		LogIn.clickPass(wd);
		data = ExcelUtils.getCellData(i, 4);
		LogIn.sendKeysPass(wd, data);
		Thread.sleep(3000);

		// Submit
		LogIn.clickLogInLink(wd);
		Thread.sleep(3000);

		if (wd.getCurrentUrl().contains(LogIn.LOG_IN_URL)) {
			System.out.println("User is logged in");
		}
	}

	public static void inOut(WebDriver wd, int i) throws Exception {

		fillLogInForm(wd, i);
		LogIn.clickLogOutButton(wd);
		if (wd.getCurrentUrl().contains(HomePage.PAGE_URL)) {
			System.out.println("User is logged out");
		}
	}

	public static void testAllData(WebDriver wd) throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET_NAME_1);
		for (int i = 1; i < ExcelUtils.getWorkSheet().getLastRowNum() + 1; i++) {
			fillLogInForm(wd, i);
			LogIn.clickLogOutButton(wd);

		}

	}

}
