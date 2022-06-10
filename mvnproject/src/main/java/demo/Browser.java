package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Downloads\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");

		String title = driver.getTitle();
		
		System.out.println(title);
		
		if(title.contentEquals("Google")) {
			System.out.println ("correct title");
		}
		else {
			System.out.println("incorrect title");
		}
	}

}
