package mis_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class test3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 	WebDriver driver;  
	        ChromeOptions nuevoargumento = new ChromeOptions();
	        nuevoargumento.addArguments("--remote-allow-origins=*");
	        driver = new ChromeDriver(nuevoargumento);
	        driver.get("https://www.institutoweb.com.ar/test/test2/checkout/");
	        driver.manage().window().maximize();
	        driver.findElement(By.id("firstName")).click();
	        driver.findElement(By.id("firstName")).sendKeys("Daniel");
	        driver.findElement(By.id("lastName")).sendKeys("Balbi");

	        driver.findElement(By.cssSelector(".g-3")).click();
	        driver.findElement(By.id("username")).click();
	        driver.findElement(By.id("username")).sendKeys("danielbalbi");
	        driver.findElement(By.id("email")).click();
	        driver.findElement(By.id("email")).sendKeys("daniel.eduardo.balbi@gmail.com");
	        driver.findElement(By.id("address")).sendKeys("Rivadavia 3808 1º B");
	        driver.findElement(By.id("address2")).sendKeys("Santiago del Estero 3030");
	        {
	          WebElement dropdown = driver.findElement(By.id("country"));
	          dropdown.findElement(By.xpath("//option[. = 'United States']")).click();
	        }
	        Thread.sleep(200);
	        driver.findElement(By.id("state")).click();
	        {
	          WebElement dropdown = driver.findElement(By.id("state"));
	          dropdown.findElement(By.xpath("//option[. = 'California']")).click();
	        }
	        driver.findElement(By.id("zip")).sendKeys("1204");
	        Thread.sleep(200);
	        driver.findElement(By.id("same-address")).click();
	        driver.findElement(By.id("save-info")).click();
	        driver.findElement(By.id("debit")).click();
	        driver.findElement(By.id("cc-name")).sendKeys("Visa");
	        driver.findElement(By.id("cc-number")).click();
	        driver.findElement(By.id("cc-number")).sendKeys("5050505050505050");
	        driver.findElement(By.id("cc-expiration")).click();
	        driver.findElement(By.id("cc-expiration")).sendKeys("12/28");
	        driver.findElement(By.id("cc-cvv")).sendKeys("123");
	        driver.findElement(By.id("cc-cvv")).sendKeys(Keys.TAB);
	        Thread.sleep(2000);
	        driver.findElement(By.id("continue")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.id("volver")).click();	        
	        driver.close();
	        driver.quit();
	}

}
