package locatorsex;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathExample 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//browser information which browser,driver location
	    System.setProperty("webdriver.chrome.driver","D://Selenium Training//chromedriver.exe");	
	    // Make the chrome driver object
	   //ChromeDriver driver=new ChromeDriver();
	   FirefoxDriver driver=new FirefoxDriver();
	    driver.manage().window().maximize();
	   driver.get("http://www.practiceselenium.com/check-out.html");
	   
	  // driver.get("https://the-internet.herokuapp.com/");
	   //driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
	   //int numofTx=driver.findElements(By.tagName("a")).size();
	   //System.out.println(numofTx);
	   Thread.sleep(3000);
	   //driver.findElement(By.linkText("Cancel")).click();
	   driver.findElement(By.xpath("//a[starts-with(text(),'Can')]")).click();;
	}
}
  