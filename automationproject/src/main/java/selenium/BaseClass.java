package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public WebDriver driver;
	public void initialiseBrowser() {
		driver=new ChromeDriver();//loading the driver
		driver.get("https://selenium.qabible.in/");//launch the URL
		driver.manage().window().maximize();
		
	}
	public void driverQuit() {
		driver.close();
	}
	public static void main(String args[]) {
		BaseClass b=new BaseClass();
		b.initialiseBrowser();
		b.driverQuit();
		
				
	}
}
