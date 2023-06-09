package mis_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class dragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  
        WebDriver driver;  
        ChromeOptions nuevoargumento = new ChromeOptions();
        nuevoargumento.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(nuevoargumento);
        driver.get("https://institutoweb.com.ar/test/drop_archivo.html");
        
        WebElement lugar_para_soltar = driver.findElement(By.id("drop-zone"));
       	String rutadelarchivo="D:\\Test\\api_ejemplo.txt";
       	WebElement mi_archivo = driver.findElement(By.xpath("//input[@type='file']"));
       	mi_archivo.sendKeys(rutadelarchivo);
       	
       	Actions acciones = new Actions(driver);
       	acciones.dragAndDrop(mi_archivo,lugar_para_soltar).build().perform();
       	driver.close();
       	driver.quit();

	}

}
