package neoStoxPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxSignInPage {
	@FindBy(xpath= "//input[@id='txt_mobilenumber']") private  WebElement mobileNoFiled;
	@FindBy(xpath= "//button[@id='frmsubmit']") private  WebElement submitButton;
	
public NeoStoxSignInPage(WebDriver driver) {
        
        PageFactory.initElements(driver,this );
    }
    
    public void enterMobileNumber(String mobNum) 
    {
        mobileNoFiled.sendKeys(mobNum);
    }
    
    public void clickOnSubmitButton() 
    {
        submitButton.click();
    }


    
}

