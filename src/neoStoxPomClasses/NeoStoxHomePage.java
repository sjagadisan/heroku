package neoStoxPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxHomePage {
	// 1. Data member should be declared globally with access level private using @findBy Annotation
	
			@FindBy(xpath= "//a[@href=\"/account/sign-in\"]") private   WebElement signInButton;
			
			   // 2. Initialize within Constructor with access level public using pagefactory

		    public NeoStoxHomePage(WebDriver driver ) 
		    {
		        PageFactory.initElements(driver , this );
		    }
		    
		    public void clickOnSignInButton() 
		    {
		        signInButton.click();
		    }
		}

