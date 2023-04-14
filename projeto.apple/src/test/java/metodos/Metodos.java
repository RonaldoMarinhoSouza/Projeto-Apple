package metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import drivers.Drivers;

public class Metodos extends Drivers {

	public void clicar(By elemento) {
		
	driver.findElement(elemento).click();
	}
	public void scroll(int n1, int n2) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + n1 + "," + n2 + ")");
	}
}
