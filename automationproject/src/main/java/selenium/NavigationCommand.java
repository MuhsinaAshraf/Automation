package selenium;

public class NavigationCommand extends BaseClass {
	public void navigationCommands() {
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}
	public static void main(String[] args) {
		NavigationCommand b=new NavigationCommand();
		b.initialiseBrowser();
		b.navigationCommands();
		b.driverQuit();
		// TODO Auto-generated method stub

	}

}
