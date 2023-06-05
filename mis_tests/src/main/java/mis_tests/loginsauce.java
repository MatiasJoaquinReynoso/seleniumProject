package mis_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class loginsauce {

	public static void main(String[] args) throws InterruptedException {
		  WebDriver driver;  
	      ChromeOptions nuevoargumento = new ChromeOptions();
	      nuevoargumento.addArguments("--remote-allow-origins=*");
	      driver = new ChromeDriver(nuevoargumento);     
	      driver.get("https://www.saucedemo.com/");
	      driver.manage().window().maximize();
	      
	      driver.findElement(By.id("user-name")).sendKeys("standard_user");
	      driver.findElement(By.id("password")).sendKeys("secret_sauce");
	      driver.findElement(By.id("login-button")).click();	      
	      String respuesta;
	      respuesta = driver.findElement(By.cssSelector("#header_container > div.primary_header > div.header_label > div")).getText();  
	      if("Swag Labs".equals(respuesta)){
	           System.out.println("El usuario ingresó correctamente");
	       }else{
	            System.out.println("El test finalizó con errores");
	            System.exit(1);
	       }
	      Select filtro;
	      filtro = new Select(
	        		driver.findElement(By.className("product_sort_container"))
	        		);
	      filtro.selectByVisibleText("Price (low to high)");     
	      Thread.sleep(3000);
	      driver.close();
	      driver.quit();	   
	}

}
