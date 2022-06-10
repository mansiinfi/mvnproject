   package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdriver {

	private static final TimeUnit TimeUnit = null;

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Downloads\\BrowserDriver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
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