package demo;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdriver {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Downloads\\Browserdrivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
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