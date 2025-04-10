package neoStoxPomClasses;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class ValidateNeoUsername {
	
	WebDriver driver;
	NeoStoxHomePage home;
	NeoStoxSignInPage signin;
	NeoStoxPasswordPage pwd;
	NeoStoxDashBoardPage dash;
	File Myfile; 
	Sheet MySheet;
	@BeforeClass
	public void launchapp() throws EncryptedDocumentException, IOException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://neostox.com/");
		Reporter.log("Lauching Neostox app");
		home = new NeoStoxHomePage(driver);
		signin =new NeoStoxSignInPage(driver);
		pwd=new NeoStoxPasswordPage(driver);
		dash= new NeoStoxDashBoardPage(driver);
 
 
 File Myfile = new File("D:\\TestData\\TestData_updated.xlsx");
 
 MySheet = WorkbookFactory.create(Myfile).getSheet("Sheet1");
	}
	@BeforeMethod
	public void login() throws InterruptedException
	{
		home.clickOnSignInButton();
		Reporter.log("Clicking on signing button", true);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	    
	    signin.enterMobileNumber(MySheet.getRow(0).getCell(0).getStringCellValue()); 
	    
	    Reporter.log("Entering mobile number", true);
	    signin.clickOnSubmitButton();
	   
	    pwd.enterPassword(MySheet.getRow(0).getCell(1).getStringCellValue());
	    Reporter.log("Entering pin", true);
	    pwd.clickonsubmitButton();
	    Reporter.log("Clicking on submit Button", true);
	    dash.handlePopUp1();
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));  
	/*       WebElement pop=  driver.findElement(By.xpath("//a[@class=\"btn btn-success\"]"));
	         pop.click();
	         
	         Thread.sleep(500);
	         
	         WebElement pop1=driver.findElement(By.xpath("//*[@id=\"modal_neostoxinfo\"]/div/div/div[3]/div/div/div/a")) ;
	        pop1.click();
	*/    Reporter.log("Handeling popup", true); 
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

	  
	}
@Test
	public void validateusername()
	{

		String expectedusername= MySheet.getRow(0).getCell(2).getStringCellValue();
 String actualusernam =dash.getActualusername();
 
 Reporter.log("Validating UserName ", true);

 Assert.assertEquals(actualusernam, expectedusername,"actual and expected UserNames are not Matching TC is failed");
 
	}
 @AfterMethod
 public void logOutFromNeoStox() throws InterruptedException
 
 {

 Thread.sleep(1000); 
 
 dash.logout();
 Reporter.log("logging out from neostox", true);
 Thread.sleep(1000);


 }
 @AfterClass
 public void closeBrowser()
 {


 driver.close();
 Reporter.log("Closing browser", true);
 }

/*
 public String getActualUserName()
 
 {
  
 String actualUserName = dash.NeoStoxDashBoardPage();
 return actualUserName;

*/

}

