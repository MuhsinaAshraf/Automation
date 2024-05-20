package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends BaseClass {
	public void locatorMethod() {
		//WebElement elementname=driver.findElement(By.Locator("locator value"));
		WebElement elementname1=driver.findElement(By.id( "single-input-field" ));
		WebElement elementname2=driver.findElement(By.id( "button-one" ));
		WebElement elementname3=driver.findElement(By.id( "subject" ));
		WebElement elementname4=driver.findElement(By.id( "value-a" ));
		WebElement elementname5=driver.findElement(By.id( "select2-data-10-n0ky" ));
	}
	public void className() {
		
		WebElement elementname6=driver.findElement(By.className("card-body"));
		WebElement elementname7=driver.findElement(By.className("input-group-text"));
		WebElement elementname8=driver.findElement(By.className("form-check-label"));
		WebElement elementname9=driver.findElement(By.className("clearfix"));
		
	}
	public void name() {
	

		
		WebElement elementname10=driver.findElement(By.name("viewport"));
	}
	
	public void linkText() {
		
		
	}
	public void partialLinkText() {
	
		
		
	}
		
	public static void main(String[] args) {
		Locators l=new Locators();
		l.initialiseBrowser();
		l.locatorMethod();
		l.className();
		l.name();
		l.linkText();
		l.partialLinkText();
		l.driverQuit();
		
		
		// TODO Auto-generated method stub

	}

}
