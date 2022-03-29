import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoModuleOne {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Auto\\chromedriver.exe");  
 		WebDriver driver=new ChromeDriver();
 		driver.get("https://rahulshettyacademy.com/#/index");
 		System.out.println(driver.getTitle());
 		System.out.println(driver.getCurrentUrl());
 		driver.close();
		
 		
 		
 		
	}

}
