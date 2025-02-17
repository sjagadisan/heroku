package seleniumstudy;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 


public class Seleniumstudy {
	public static void main(String[] args) throws InterruptedException, IOException  {
		// TODO Auto-generated method stu
 WebDriver driver = new ChromeDriver();

/*driver.get("https://mail.google.com/");*/
driver.get("https://paytm.com/");
Thread.sleep(2000);

driver.findElement(By.xpath("//label[@id='rt']")).click();

driver.get("https://demo.guru99.com/test/newtours/register.php");
driver.findElement(By.xpath("//input[@name='firstName']")).click();
WebElement txt = driver.findElement(By.xpath("//input[@name='firstName']"));
txt.click();
txt.sendKeys("Satish");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='lastName']")).click();
WebElement txt2 = driver.findElement(By.xpath("//input[@name='lastName']"));
txt2.click();
txt2.sendKeys("Jaga");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='phone']")).click();
WebElement txt3 = driver.findElement(By.xpath("//input[@name='phone']"));
txt3.click();
txt3.sendKeys("9819989012");
Thread.sleep(2000);

driver.findElement(By.xpath("//input[@id='userName']")).click();
WebElement txt4 = driver.findElement(By.xpath("//input[@id='userName']"));
txt4.click();
txt4.sendKeys("satishj@yahoo.com");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='address1']")).click();
WebElement txt5 = driver.findElement(By.xpath("//input[@name='address1']"));
txt5.click();
txt5.sendKeys("1104 Mahagirl Street");
Thread.sleep(2000);


	driver.findElement(By.xpath("//input[@name='city']")).click();
	WebElement txt6 = driver.findElement(By.xpath("//input[@name='city']"));
	txt5.click();
	txt6.sendKeys("Thane");
	Thread.sleep(2000);

	driver.findElement(By.xpath("//input[@name='state']")).click();
	WebElement txt7 = driver.findElement(By.xpath("//input[@name='state']"));
	txt7.click();
	txt7.sendKeys("Maharashtra");
	Thread.sleep(2000);


	driver.findElement(By.xpath("//input[@name='postalCode']")).click();
	WebElement txt9 = driver.findElement(By.xpath("//input[@name='postalCode']"));
	txt9.click();
	txt9.sendKeys("400604");
	Thread.sleep(2000);

	driver.findElement(By.xpath("//input[@name='email']")).click();
	WebElement txt10 = driver.findElement(By.xpath("//input[@name='email']"));
	txt10.click();
	txt10.sendKeys("sjagadisan@gmail.com");
	Thread.sleep(2000);

	driver.findElement(By.xpath("//input[@name='password']")).click();
	WebElement txt11 = driver.findElement(By.xpath("//input[@name='password']"));
	txt11.click();
	txt11.sendKeys("Alliswell@321");
	Thread.sleep(2000);

	driver.findElement(By.xpath("//input[@name='confirmPassword']")).click();
	WebElement txt12 = driver.findElement(By.xpath("//input[@name='confirmPassword']"));
	txt12.click();
	txt12.sendKeys("Alliswell@321");
	Thread.sleep(2000);

	driver.findElement(By.xpath("//input[@name='submit']")).click();

	driver.quit();
	
	//input[@name="submit"]
}
}



//input[@name='phone']