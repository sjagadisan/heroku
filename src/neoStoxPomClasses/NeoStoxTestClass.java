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
import org.openqa.selenium.support.FindBy;

public class NeoStoxTestClass {
	
//	@FindBy(xpath = ("//a[@class=\"btn btn-success\"]")) private WebElement popUp0k1Button;
	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
    {
        
        WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         
         driver.get("https://neostox.com/");
         
         
    
         // read data from excel 
         
         File myfile = new File("D:\\TestData\\TestData_updated.xlsx");
         
         Sheet MySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
         
         // MobNum , Password
         String  mobNum = MySheet.getRow(0).getCell(0).getStringCellValue();
        
        String  pass = MySheet.getRow(0).getCell(1).getStringCellValue();
        
       NeoStoxHomePage home = new NeoStoxHomePage(driver);
         
         home.clickOnSignInButton();
         
         
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
         
         NeoStoxSignInPage signin = new NeoStoxSignInPage(driver);
         
         signin.enterMobileNumber(mobNum);
         signin.clickOnSubmitButton();
         
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
         
         NeoStoxPasswordPage passWord = new NeoStoxPasswordPage(driver);
         passWord.enterPassword(pass);
         passWord.clickonsubmitButton();
         
         Thread.sleep(500);

      

    }

}