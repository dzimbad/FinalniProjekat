package main;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.objects.HomePage;
import page.tests.LogInTest;
import page.tests.PostTest;
import page.tests.RegisterTest;

public class GlavniTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MDPI\\Desktop\\QA\\cwd\\chromedriver.exe");

		WebDriver wd = new ChromeDriver();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		System.out.println("Welcome to the Izlet website testing.\n" + "Would you like to perform:\n"
				+ "1) Automatic, or\n" + "2) Manual testing?");

		switch (n) {
		case 1:
			while (true) {

			}

		}

		
		  public void registerAutomation() { try {HomePage.navigateToPage(wd);
		  
		  RegisterTest.testOne(wd);
		  
		   RegisterTest.testOne(wd, sc);
		    LogInTest.testAllData(wd,sc);
		  
		  LogInTest.(wd); //LogInTest.logIn(wd, 1);
		  
		   PostTest.createPost(wd);
		    Thread.sleep(3000); 
		     
		     
		  PostDelete.postDelete(wd, 2); 
		  PostTest.createPostManual(wd, sc);
		  PostEditTest.postEditManual(wd, sc); 
		  
		  } catch (Exception e) {
		  e.printStackTrace(); 
		  System.out.println(e); 
		  } finally { sc.close();
		  wd.quit(); }
		  
		  }
		 

	}

}
