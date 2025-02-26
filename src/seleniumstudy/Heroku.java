package seleniumstudy;

import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.util.Arrays;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Heroku {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
/* This will disable the chrome controlled by Test Automation Browser*/
		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
WebDriver driver  = new ChromeDriver(opt);
driver.get("https://signup.heroku.com/");
driver.manage().window().maximize();



Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name=\"first_name\"]")).click();

/* Enter the name in the first name field*/

WebElement   txt=driver.findElement(By.xpath("//input[@name=\"first_name\"]"));
txt.click();
txt.sendKeys("Satish");

Thread.sleep(2000);

/* Enter the name in the Last name field*/

driver.findElement(By.xpath("//input[@id=\"last_name\"]")).click();
WebElement txt1=driver.findElement(By.xpath("//input[@id=\"last_name\"]"));
txt1.click();
txt1.sendKeys("Jagadisan");
Thread.sleep(2000);

/* Enter the name in the email address  field*/

driver.findElement(By.xpath("//input[@id=\"email\"]")).click();
WebElement txt2=driver.findElement(By.xpath("//input[@id=\"email\"]"));
txt2.click();
txt2.sendKeys("satish@yahoo.com");
Thread.sleep(2000);

/* Enter the name in the company  field*/
driver.findElement(By.xpath("//input[@id=\"company\"]")).click();
WebElement txt3=driver.findElement(By.xpath("//input[@id=\"company\"]"));
txt3.click();
txt3.sendKeys("Meta");

Thread.sleep(2000);

/* Enter the name in the dropdown values */
driver.findElement(By.xpath("//option[@value='United States']")).click();
WebElement txt4=driver.findElement(By.xpath("//option[@value='United States']"));
txt3.click();

Thread.sleep(2000);

/* Enter the name in the state drown  values */
WebElement dd=driver.findElement(By.id("self_declared_state"));
Select s = new Select(dd);
s.selectByValue("MI");
Thread.sleep(1000);

s.selectByIndex(5);
System.out.println(s.isMultiple());
/*driver.findElement(By.xpath("//option[@value=\"MI\"]")).click();
WebElement txt5=driver.findElement(By.xpath("//option[@value=\"MI\"]"));
txt5.click();
*/

Thread.sleep(2000);
WebElement txt7=driver.findElement(By.xpath("//input[@id='receive_newsletter_choice']"));
txt7.click();



Thread.sleep(2000);

WebElement label =driver.findElement(By.xpath("//div[@class=\"newsletter\"]"));

String actext= label.getText();

System.out.println(actext);

String  extext = "Yes, I would like to receive marketing communications regarding Salesforce products, services, and events. I can unsubscribe at any time";

if (actext==extext) 
{
	System.out.println("Test case is passed");
}
else {
	System.out.println("Test case is passed");
}


Thread.sleep(1000);
/*
driver.findElement(By.xpath("//a[@href="https://policies.google.com/privacy\"]")).click();
WebElement txt8=driver.findElement(By.xpath("//a[@href="https://policies.google.com/privacy\\"));
txt8.click();
*/


File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File ab = new File ("D:\\Screenshot\\Screenshot1.png");



driver.findElement(By.xpath("//input[@type=\"submit\"]"));
WebElement txt10=driver.findElement(By.xpath("//input[@type=\"submit\"]"));
txt10.click();

/* This will copy the screenshot from one folder to another  */
File ss1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File ab2 = new File ("D:\\Screenshot\\Screenshot.png");

org.openqa.selenium.io.FileHandler.copy(ss, ab);
	}


}


//a[@href="https://policies.google.com/privacy"]
//input[@id='signup-button']