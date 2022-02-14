package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Page.Cart;
import Page.Home;
import Page.Login;
import Page.Search;

public class Hometest
{
	 WebDriver driver;
	 String s="https://www.amazon.in/";
		
	@BeforeTest
	@Parameters("browser")
	
	public void setup(String browser) throws Exception
	{
		
	if(browser.equalsIgnoreCase("chrome"))
			{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nishija\\Desktop\\selenium\\cgromedriver 98\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		  driver.get(s);
	       }
		
	else if(browser.equalsIgnoreCase("edge"))
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\nishija\\Desktop\\selenium\\edge 98\\edgedriver_win64\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		  driver.get(s);
	}
	
}
	@Test(priority = 1 )
	public void signtest()
	{
		Home ob=new Home(driver);
		ob.LoginAmazon();
	}
	
	@Test(priority = 2 )
	 @Parameters("email")
	public void emailtest(String email)
	{
		Login ob=new Login(driver);
		ob.email(email);
	}
	@Test(priority = 3 )
	@Parameters("password")
	public void passtest(String password)
	{
		Login ob=new Login(driver);
		ob.pswrd(password);
	}
	@Test(priority = 4 )
	public void searchest() throws InterruptedException
	{
		Search ob=new Search(driver);
		ob.searchprdct();
	}
	@Test(priority = 5 )
	public void cartest() throws InterruptedException
	{
		Cart ob=new Cart(driver);
			ob.cartprdct();	
	}
	
	}
	

