package neopack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class ValidateNeoStoxUserName {
	WebDriver driver;
	homepage home;
	
	
public void launchapp()
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://neostox.com/");
	Reporter.log("Launching the Neostax app",true);
	home= new NeoStoxHomepage(driver);
	
}

}
