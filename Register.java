package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Register {

	private static final String FIRST_NAME = "//input[@name='firstname']";
	private static final String LAST_NAME = "//input[@name='lastname']";
	private static final String USERNAME = "//form[@action='processregister.php']//input[@name='username']";
	private static final String EMAIL = "//input[@name='email']";
	private static final String PASSWORD = "//form[@action='processregister.php']//input[@name='password']";
	private static final String REGISTER = "//input[@id='blue_btn']";

	// Method that takes us to the First Name field
	public static WebElement getFirstName(WebDriver wd) {
		WebElement driver = wd.findElement(By.xpath(FIRST_NAME));
		return driver;
	}

	// Method that click on First Name field
	public static void clickFirstName(WebDriver wb) {
		getFirstName(wb).click();
	}

	// Method that sets First Name
	public static void sendKeysFirstName(WebDriver wd, String str) {
		getFirstName(wd).sendKeys(str);
	}

	// Method that takes us to the Last Name field
	public static WebElement getLastName(WebDriver wd) {
		WebElement driver = wd.findElement(By.xpath(LAST_NAME));
		return driver;
	}

	// Method that clicks on the Last Name field
	public static void clickLastName(WebDriver wd) {
		getLastName(wd).click();
	}

	// Method that sets Last Name
	public static void sendKeysLastName(WebDriver wd, String str) {
		getLastName(wd).sendKeys(str);
	}

	// Method that goes to username field
	public static WebElement getUsername(WebDriver wd) {
		WebElement driver = wd.findElement(By.xpath(USERNAME));
		return driver;
	}

	// Method that clicks on username field
	public static void clickUsername(WebDriver wd) {
		getUsername(wd).click();
	}

	// Method that sets username
	public static void sendKeysUsername(WebDriver wd, String str) {
		getUsername(wd).sendKeys(str);
	}

	// Method that goes to email field
	public static WebElement getEmail(WebDriver wd) {
		WebElement driver = wd.findElement(By.xpath(EMAIL));
		return driver;
	}

	// Method that click on email field
	public static void clickEmail(WebDriver wd) {
		getEmail(wd).click();
	}

	// Method that sets email
	public static void sendKeysEmail(WebDriver wd, String str) {
		getEmail(wd).sendKeys(str);
	}

	// Method that goes to password field
	public static WebElement getPassword(WebDriver wd) {
		WebElement driver = wd.findElement(By.xpath(PASSWORD));
		return driver;
	}

	// Method that clicks on password field
	public static void clickPassword(WebDriver wd) {
		getPassword(wd).click();
	}

	// Method that sets password
	public static void sendKeysPassword(WebDriver wd, String str) {
		getPassword(wd).sendKeys(str);
	}

	// Method that goes to register button
	public static WebElement getRegisterLink(WebDriver wd) {
		WebElement driver = wd.findElement(By.xpath(REGISTER));
		return driver;
	}

	// Method that click on the register button
	public static void clickRegisterLink(WebDriver wd) {
		getRegisterLink(wd).click();
	}

}
