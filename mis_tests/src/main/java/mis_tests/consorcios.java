package mis_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class consorcios {

	public static void main(String[] args) throws InterruptedException {
//////////////////////Inicializo el WebDriver y abro la web//////
WebDriver driver;     
ChromeOptions nuevoargumento = new ChromeOptions(); 
nuevoargumento.addArguments("--remote-allow-origins=*"); //,"--headless"
driver = new ChromeDriver(nuevoargumento);
driver.get("https://www.emaras.com.ar/");

// Maximizo la pantalla        
driver.manage().window().maximize();
// Hago click sobre el cuadro de texto "usuario"
driver.findElement(By.name("usuario")).click();
// escribo el usuario
driver.findElement(By.name("usuario")).sendKeys("prueba");


// Hago click sobre el cuadro de texto "clave"
driver.findElement(By.name("clave")).click();
// escribo la clave
driver.findElement(By.name("clave")).sendKeys("12345");

// Hago click en el boton "Ingresar"
driver.findElement(By.id("btnIngresar")).click();

/////////////////////////  ingresando en la pantalla de la selección del edificio
//// seleccion del edificio. Renglón nro 3
driver.findElement(By.cssSelector("#tableData > tbody > tr:nth-child(3) > td.evenselected > p > a")).click();

///// despliega el menú "Usuarios" 
driver.findElement(By.cssSelector("#tp_menu > ul > li:nth-child(8) > a > font")).click();
Thread.sleep(1000);

// hacé click en la opción "Datos Administración" dentro del menu usuarios
driver.findElement(By.cssSelector("#tp_menu > ul > li:nth-child(8) > ul > li:nth-child(6) > font > a")).click();
Thread.sleep(1000);  

/// cambio datos en el cuadro de texto "domicilio"
driver.findElement(By.name("domicilio")).click();
driver.findElement(By.name("domicilio")).clear();  // elimino el texto existente
driver.findElement(By.name("domicilio")).sendKeys("Bolivia 1114");
Thread.sleep(3000);

/// hago click en el boton "Guardar"
driver.findElement(By.cssSelector("td > input")).click();
/// hago click en el link "Cerrar Sesión"
driver.findElement(By.cssSelector("td > font > a > font")).click();

////////////////////////////////////////////////////////////////////////////////////
///////////////   Revisión del valor en el domicilio de la Administración
////////////////////////////////////////////////////////////////////////////////////

// Hago click sobre el cuadro de texto "usuario"
driver.findElement(By.name("usuario")).click();
// escribo el usuario
driver.findElement(By.name("usuario")).sendKeys("prueba");


// Hago click sobre el cuadro de texto "clave"
driver.findElement(By.name("clave")).click();
// escribo la clave
driver.findElement(By.name("clave")).sendKeys("12345");

// Hago click en el boton "Ingresar"
driver.findElement(By.id("btnIngresar")).click();

/////////////////////////  ingresando en la pantalla de la selección del edificio
//// seleccion del edificio. Renglón nro 3
driver.findElement(By.cssSelector("#tableData > tbody > tr:nth-child(3) > td.evenselected > p > a")).click();

///// despliega el menú "Usuarios" 
driver.findElement(By.cssSelector("#tp_menu > ul > li:nth-child(8) > a > font")).click();
Thread.sleep(1000);
// hacé click en la opción "Datos Administración" dentro del menu usuarios
driver.findElement(By.cssSelector("#tp_menu > ul > li:nth-child(8) > ul > li:nth-child(6) > font > a")).click();
Thread.sleep(1000);  
/// cambio datos del domicilio

WebElement test_domicilio = driver.findElement(By.name("domicilio"));
test_domicilio.click();  
////////////////////////// Lectura del valor que tiene el cuadro de texto
String calle = test_domicilio.getAttribute("value");

System.out.println("Dato Obtenido: " + calle);

Thread.sleep(3000);
//// click sobre el botón guardar
driver.findElement(By.cssSelector("td > input")).click();
/// click sobre el link "cerrar sesion"
driver.findElement(By.cssSelector("td > font > a > font")).click();
driver.close();
driver.quit();

}

/////////////////////////////////Fin del código /////////////////////////      

}


