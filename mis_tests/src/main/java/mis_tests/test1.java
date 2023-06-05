package mis_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test1 {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Hello World!");
	        // perro sultan ;
	        // sultan = new caniche();     
	        WebDriver driver;  
	        ChromeOptions nuevoargumento = new ChromeOptions();
	        nuevoargumento.addArguments("--remote-allow-origins=*");
	        driver = new ChromeDriver(nuevoargumento);     
	        driver.get("https://institutoweb.com.ar/test/login.html");
	        // tamaño de pantalla
	        //    driver.manage().window().setSize(new Dimension(1382, 744));
	              driver.manage().window().maximize();
	        //    driver.manage().window().fullscreen();
	        driver.findElement(By.id("tuusuario")).sendKeys("daniel");
	        driver.findElement(By.id("tuclave")).sendKeys("miclave");
	        driver.findElement(By.id("tumail")).sendKeys("balbi@hotmail.com");
	        //Thread.sleep(3000);  
	        // Click en el boton ingresar
	        driver.findElement(By.cssSelector("body > form > button:nth-child(8)")).click();	        
	        // Aserción 
	        String respuesta;
	        respuesta = driver.findElement(By.cssSelector("body > h3")).getText();
	        // System.out.println(driver.findElement(By.cssSelector("body > h3")).getText());
	        if("Acceso correcto!".equals(respuesta)){
	           System.out.println("El usuario ingresó correctamente");
	        }else{
	            System.out.println("El test finalizó con errores");
	            System.exit(1);
	        }	       
	        driver.findElement(By.id("volver")).click();
	        Thread.sleep(3000);
	        driver.close();
	        driver.quit();	       
	    }
	}
