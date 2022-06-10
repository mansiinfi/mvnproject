package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverMethod {
	
	public static String browser = "chrome" ;
	public static WebDriver driver ;

	public static void main(String[] args) {
		 
		if (browser .equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();;
			driver = new FirefoxDriver();
			} else if (browser .equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				} else if (browser.equals("edge")) {
					WebDriverManager.edgedriver().setup();
					driver = new EdgeDriver();
					}
		driver .get("http://www.saucedemo.com");
		driver.manage().window().maximize();
		
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input")).click();
		
		
		driver.quit(); 

	}
	
	
}
