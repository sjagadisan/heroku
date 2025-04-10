package neoStoxPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxPasswordPage {
	@FindBy(xpath= "//input[@type=\"password\"]") public  WebElement passwordField;
	@FindBy(xpath= "//button[@type=\"submit\"]") public  WebElement submitPWButton;
	
	   public NeoStoxPasswordPage(WebDriver driver) 
	    {
	        PageFactory.initElements(driver, this);
	    }
	    
	    public void enterPassword(String pass) 
	    {
	        passwordField.sendKeys(pass);
	    }
	    
	    public void clickonsubmitButton() throws InterruptedException 
	    {
	        Thread.sleep(1000);
	        submitPWButton.click();
	    }
	}

