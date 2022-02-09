package Testngvox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Amazone {

 WebDriver driver;
 String s="https://www.amazon.in/";
	
@BeforeTest
@Parameters("browser")
public void setup(String browser) throws Exception
{
	
if(browser.equalsIgnoreCase("chrome"))
		{
	//WebDriverManager.chromedriver().setup();
	System.setProperty("webdriver.chrome.driver","C:\\Users\\nishija\\Desktop\\selenium\\chromedriver97\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	  driver.get(s);
       }
	
else if(browser.equalsIgnoreCase("edge"))
{
	System.setProperty("webdriver.edge.driver","C:\\Users\\nishija\\Desktop\\selenium\\Edge 97\\edgedriver_win64\\msedgedriver.exe");
	driver=new EdgeDriver();
	driver.manage().window().maximize();
	  driver.get(s);
}
}


 @Test(priority = 0 )
 public void signin() 
 {
 
  WebElement we = driver.findElement(By.xpath("(//*[text()='Hello, Sign in'])[1]"));
  we.click();
 // actions.click(we).perform();
 }

 @Test(priority = 1 )
 @Parameters("email")
 public void email(String email) 
 {
 driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
 
  driver.findElement(By.xpath("//input[@id='continue']")).click();
 }

 @Test(priority = 2 )
 @Parameters("password")
 public void pswrd(String password) 
 {
  driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
  driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
 }
 @Test(priority = 3 )
 public void search()
 {
	WebElement s= driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
	s.sendKeys("mobiles");
	s.submit();
}
 

}