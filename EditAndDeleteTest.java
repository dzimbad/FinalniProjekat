package page.tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import page.objects.EditAndDelete;

public class EditAndDeleteTest {
	public static void postEditManual(WebDriver wd, Scanner sc) {

		EditAndDelete.postEdit(wd);

		System.out.println("Enter Title");
		EditAndDelete.clickTitle(wd);
		EditAndDelete.setTitle(wd, sc.next());

		System.out.println("Enter Location");
		EditAndDelete.clickLocation(wd);
		EditAndDelete.setLocation(wd, sc.next());

		EditAndDelete.setTransport(wd, 1);

		System.out.println("Enter Text");
		EditAndDelete.clickText(wd);
		EditAndDelete.setText(wd, sc.next());

		EditAndDelete.clickPostButton(wd);
	}

}
