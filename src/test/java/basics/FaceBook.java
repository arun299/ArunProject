package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FaceBook {
	WebDriver driver;
    @BeforeTest
	public void openUrl() throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver","D:\\Selenium\\selenium software\\chromedriver_win32\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	   driver.get("https://www.facebook.com/");
    }
    @Test
    public void login() throws InterruptedException {
	   Thread.sleep(5000);
	   driver.findElement(By.name("email")).sendKeys("Arun123");
	   driver.findElement(By.name("pass")).sendKeys("aaron");
	   driver.findElement(By.name("login")).click();
	   
	   Thread.sleep(5000);
	   
	   
    }
    @AfterTest
    public void quit() {
    	driver.quit();  
	   
	   	

	}

}
