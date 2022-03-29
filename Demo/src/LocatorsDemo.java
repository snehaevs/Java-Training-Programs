import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args)  throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Auto\\chromedriver.exe");  
 		WebDriver driver=new ChromeDriver();
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 		driver.get("https://rahulshettyacademy.com/locatorspractice/");
 		driver.findElement(By.id("inputUsername")).sendKeys("Sneha.e.v.s.77@gmail.com");
 		driver.findElement(By.name("inputPassword")).sendKeys("Password");
 		driver.findElement(By.className("submit")).click();
 		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
 		driver.findElement(By.linkText("Forgot your password?")).click();
 		Thread.sleep(1000);
 		driver.findElement(By.xpath("//input[@placeholder = 'Name']")).sendKeys("Sneha");
 		driver.findElement(By.xpath("//input[@placeholder = 'Email']")).sendKeys("Sneha.e.v.s.77@gmail.com");
// 		driver.findElement(By.xpath("//input[@type[2]='text']")).clear();
// 		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("Sneha77@gmail.com");
     	driver.findElement(By.xpath("//form/input[3]")).sendKeys("9539202001");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
    	System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("Sneha");
		driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys("rahulshettyacademy");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#chkboxTwo")).click();
		driver.findElement(By.className("submit")).click();
		driver.findElement(By.className("logout-btn")).click();
		driver.close();
		
		

	}

}
