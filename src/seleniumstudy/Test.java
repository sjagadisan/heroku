package seleniumstudy;

import java.io.File;
import java.util.Arrays;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


ChromeOptions ss1= new ChromeOptions();
ss1.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
WebDriver driver  = new ChromeDriver(ss1);
driver.get("https://demo.guru99.com/test/newtours/register.php");

File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

File ss22 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);






	}

}
