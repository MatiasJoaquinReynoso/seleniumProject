package mis_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class test2 {

	public static void main(String[] args) throws InterruptedException {
	       
        WebDriver minavegador;  
        ChromeOptions nuevoargumento = new ChromeOptions();
        nuevoargumento.addArguments("--remote-allow-origins=*");
        minavegador = new ChromeDriver(nuevoargumento);     
        minavegador.get("https://www.institutoweb.com.ar/test/test2/select.html");
        minavegador.manage().window().maximize();
        
        Select paises;
        paises = new Select(
        		minavegador.findElement(By.cssSelector("body > select"))
        		);
        paises.selectByVisibleText("España"); 
        Thread.sleep(3000);
        paises.selectByValue("value3");     // Canadá      
        Thread.sleep(3000);      
        paises.selectByIndex(1); // Colombia         
       
        System.out.println("Cantidad de paises: " + paises.getOptions().size());
              
        Thread.sleep(3000);
        minavegador.close();
        minavegador.quit();
       
    }
}


