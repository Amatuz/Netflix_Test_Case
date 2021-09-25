import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAutomation {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\browserdrivers\\chromedriver.exe");
		
		
		ChromeDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// to go to the evaly homepage
		driver.get("https://www.netflix.com/bd/");
		
		// to wait and maximizing the window 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        
        
        
        TimeUnit.SECONDS.sleep(1);
        
    
        // to click on the sign-in option
        driver.findElement(By.xpath("//a[normalize-space()='Sign In']")).click();
        
        // entering ID & Password and then submit to log-in
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.name("userLoginId")).sendKeys("srubaiat1@gmail.com");
        driver.findElement(By.name("password")).sendKeys("123456789");
        driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
        
        // to click All shop from the navigation
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div/div[2]/ul/li[1]")).click();
        
        // to select a shop
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/div/div[2]/div[2]/a[2]/div/div[1]/div/img")).click();
        
        // to scroll down
        TimeUnit.SECONDS.sleep(1);
        js.executeScript("window.scrollBy(0,300)");
        
        // to click "Buy Now"
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/div/div[3]/div[3]/div[2]/div[2]/div[4]/button")).click();
        TimeUnit.SECONDS.sleep(5);
        
        // to close the window
        TimeUnit.SECONDS.sleep(3);
        driver.close();
         
	}

}
