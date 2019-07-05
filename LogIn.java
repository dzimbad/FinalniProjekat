package page.objects;



import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn {

	public static final String LOG_IN_URL = "http://localhost/izlet/dashboard.php";
	private static final String USERNAME = "//input[@placeholder='username']";
	private static final String PASSWORD = "//input[@placeholder='password']";
	private static final String LOG_IN = "//input[@value='Log in']";
	private static final String LOG_OUT = "//a[@id='logoutBtn']";


	//Method that takes us to username field in Log In section
	public static WebElement getUser(WebDriver wd) {
		WebElement driver = wd.findElement(By.xpath(USERNAME));
		return driver;
	}
	//Method that clicks on username field in Log In section
	public static void clickUser(WebDriver wd) {
		getUser(wd).click();
	}
	// Method that sets username in Log In section
	public static void sendKeysUser(WebDriver wd, String str) {
		getUser(wd).sendKeys(str);
	}
	//Method that goes to password field in Log In section
	public static WebElement getPass(WebDriver wd) {
		WebElement driver = wd.findElement(By.xpath(PASSWORD));
		return driver;
	}
	//Method that clicks on password field in Log In section
	public static void clickPass(WebDriver wd) {
		getPass(wd).click();
	}
	//Method that sets password field in Log In section
	public static void sendKeysPass(WebDriver wd, String str) {
		getPass(wd).sendKeys(str);
	}
	//Method that takes us to Log In button
	public static WebElement getLogInLink(WebDriver wd) {
		WebElement driver = wd.findElement(By.xpath(LOG_IN));
		return driver;
	}
	//Method that clicks on Log In button
	public static void clickLogInLink(WebDriver wd) {
		getLogInLink(wd).click();
	}
	//Method that takes us to the Log Out button
		public static WebElement getLogOutButton(WebDriver wd) {
			WebElement driver = wd.findElement(By.xpath(LOG_OUT));
			return driver;
		}
	//Method that clicks on Log Out button
		public static void clickLogOutButton(WebDriver wd) {
			getLogOutButton(wd).click();
		}
	
}
