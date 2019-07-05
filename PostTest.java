package page.tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import page.objects.Post;
import utility.Constant;
import utility.ExcelUtils;
public class PostTest {
	public static void createPost(WebDriver wd) throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData+Constant.File_TestData, Constant.SHEET_NAME_1);
		
		String[] data = new String[3];
		for(int i=0;i<3;i++) {			
			data[i] = ExcelUtils.getCellData(1, i);
		}
		
		Post.addPost(wd);
		Post.clickAddName(wd);
		Post.sendKeysAddName(wd, data[1]);
		
		Post.clickLocation(wd);
		Post.sendKeysLocation(wd, data[2]);
		
		Post.addPicture(wd);
		Post.sendKeysPicture(wd, "C:\\Users\\User\\Desktop\\5acadc92f3c7d.image.jpg");
		
		Post.selectTransport(wd);
		
		Post.clickText(wd);
		Post.sendKeysText(wd, data[0]);
		
		Post.setPost(wd);
		
	}
	
	public static void createPostManual(WebDriver wd,Scanner sc) {
		
		Post.addPost(wd);
		System.out.println("CREATE POST");
		System.out.println("Enter Name");
		Post.clickAddName(wd);
		Post.sendKeysAddName(wd, sc.next());
		
		System.out.println("Enter Location");
		Post.clickLocation(wd);
		Post.sendKeysLocation(wd, sc.next());
		
		Post.addPicture(wd);
		Post.sendKeysPicture(wd, "C:\\Users\\User\\Desktop\\5acadc92f3c7d.image.jpg");
		
		Post.selectTransport(wd);
		
		System.out.println("Enter Text");
		Post.clickText(wd);
		Post.sendKeysText(wd, sc.next());
		
		Post.setPost(wd);
	}

}

