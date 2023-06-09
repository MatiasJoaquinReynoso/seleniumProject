package mis_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;


public class test3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;  
	    ChromeOptions nuevoargumento = new ChromeOptions();
	    nuevoargumento.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver(nuevoargumento);
	    driver.get("https://www.institutoweb.com.ar/test/test2/checkout/");
	        
	    //////////////////Llamada a JavaScript
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    Actions misteclas = new Actions(driver);
	        
		//driver.manage().window().setSize(new Dimension(600, 744));
	    driver.manage().window().maximize();
	    // scroll hasta las coordenadas columna= 0 renglon = 500
	    js.executeScript("window.scrollBy(0,500)");
	    Thread.sleep(3000);
	    //misteclas.keyDown(Keys.CONTROL).keyDown(Keys.END).perform();
	     
	        
	    WebElement miboton = driver.findElement(By.id("continue"));
	  
	    js.executeScript("arguments[0].scrollIntoView();", miboton );
	        
	    Thread.sleep(1000);	
	   
	    misteclas.keyDown(Keys.CONTROL).keyDown(Keys.HOME).perform();
	    Thread.sleep(1000);
	    WebElement mi_nombre = driver.findElement(By.id("firstName"));
	    js.executeScript("arguments[0].scrollIntoView();", mi_nombre );
  

	   	driver.findElement(By.id("firstName")).sendKeys(Keys.HOME);
	   	driver.findElement(By.id("firstName")).sendKeys("Daniel");
	    driver.findElement(By.id("lastName")).sendKeys("Balbi"+Keys.TAB);
	    
	    driver.findElement(By.id("username")).sendKeys("danielbalbi");
	    
	    driver.findElement(By.id("email")).sendKeys("daniel.eduardo.balbi@gmail.com");
	    driver.findElement(By.id("address")).sendKeys("Rivadavia 3808 1º B");
	    driver.findElement(By.id("address2")).sendKeys("Santiago del Estero 3030");

	    Select pais;
	    pais = new Select(driver.findElement(By.id("country")));
	    pais.selectByIndex(1);
	        
	    Thread.sleep(500);
	   
	    Select estado;
	    estado = new Select(driver.findElement(By.id("state")));
	    estado.selectByIndex(1);
	        
	    driver.findElement(By.id("zip")).sendKeys("1204"+Keys.TAB);
	    Thread.sleep(1000);
	    driver.findElement(By.id("same-address")).click();
	    driver.findElement(By.id("same-address")).sendKeys(Keys.TAB);
	    Thread.sleep(1000);
	    driver.findElement(By.id("save-info")).click();
	    driver.findElement(By.id("save-info")).sendKeys(Keys.TAB);
	    Thread.sleep(500);
	    driver.findElement(By.id("debit")).click();
	    driver.findElement(By.id("cc-name")).sendKeys("Visa");
	  
	    driver.findElement(By.id("cc-number")).sendKeys("5050505050505050");
	    
	    driver.findElement(By.id("cc-expiration")).sendKeys("12/28");
	    driver.findElement(By.id("cc-cvv")).sendKeys("123");
	    driver.findElement(By.id("cc-cvv")).sendKeys(Keys.TAB);
	    Thread.sleep(2000);
	    driver.findElement(By.id("continue")).sendKeys(Keys.SPACE);
	    Thread.sleep(2000);
	    driver.findElement(By.id("volver")).click();	
	    driver.quit();

	}

}
