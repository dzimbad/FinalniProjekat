package page.objects;


import org.openqa.selenium.*;

public class HomePage {

	
	

	public static final String PAGE_URL = "http://localhost/izlet/";
	
		// Method for opening HomePage 
		public static void openPage(WebDriver driver) {
			driver.get(PAGE_URL);
		}
		//Method that navigates to the homepage if we are on another page
		public static void navigateToPage(WebDriver driver) {
			driver.navigate().to(PAGE_URL);
		}
	
	

	
}
