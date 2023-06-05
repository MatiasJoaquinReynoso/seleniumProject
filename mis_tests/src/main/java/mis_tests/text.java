package mis_tests;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class text {
	public static void main(String[] args) throws InterruptedException {  
	    try {
	        ///////////////////////////////////////////////
	        WebDriver driver;     
	        ChromeOptions nuevoargumento = new ChromeOptions(); 
	        nuevoargumento.addArguments("--remote-allow-origins=*"); //,"--headless"
	        driver = new ChromeDriver(nuevoargumento);
		    driver.get("https://institutoweb.com.ar/test/login.html");
		    driver.manage().window().maximize();
	    
		    //////////////////////////// configuración del archivo txt //////////////////////////////////
	        
		     String texto;  // variable donde guardo los datos del texto.txt
		     FileReader lector = new FileReader("texto.txt"); // conexión al archivo
		     BufferedReader contenido = new BufferedReader(lector);
	     
	     ///////////////////////while de la lectura del archivo ////////////////////////////////
	    
	     while((texto = contenido.readLine())!=null) {
	        driver.findElement(By.id("tuusuario")).click();
	        driver.findElement(By.id("tuusuario")).sendKeys(texto);
	        texto = contenido.readLine();
	        driver.findElement(By.id("tuclave")).sendKeys(texto);
	        texto = contenido.readLine();
	        driver.findElement(By.id("tumail")).sendKeys(texto);
	        Thread.sleep(1000);
	   
	    // Boton Ingresar 
	        driver.findElement(By.cssSelector("body > form > button:nth-child(8)")).click();
	        Thread.sleep(1000);
	        String mensaje = driver.findElement(By.cssSelector("body > h3"))
	        .getText();  //aserción == respuesta
	        if("Acceso correcto!".equalsIgnoreCase(mensaje)){
	            System.out.println("Página Correcta!");
	        }else{
	            driver.quit();         // Page Object Model
	            System.exit(1); // Comando java
	        }
	        driver.findElement(By.id("volver")).click();
	     }  ////////////////////////////////////   termina el while de lectura del archivo
	      driver.quit();
	    }
	         catch(Exception ex){
	             System.out.println("Existe un error");
	    }
	    }
	}




