package selenium;

public class BrowserCommands extends BaseClass{
	public void Commands()
	{
		String title=driver.getTitle();//to get the title of current web page
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String pagesourse=driver.getPageSource();//html code kittan vnditt
		System.out.println(pagesourse);
	}

	public static void main(String[] args) {
		BrowserCommands b=new BrowserCommands();
		b.initialiseBrowser();
		b.Commands();
		b.driverQuit();
				
		// TODO Auto-generated method stub

	}

}