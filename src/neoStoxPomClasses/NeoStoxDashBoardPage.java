package neoStoxPomClasses;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxDashBoardPage {

	@FindBy(xpath= ("//a[@class=\"btn btn-success\"]")) private WebElement pops1;
	
//	@FindBy(xpath = ("//a[@class=\"btn btn-success\"]")) private WebElement popUp0k1Button;
	
	@FindBy(xpath = "(//a[text()='OK'])[2]") private WebElement popUp0k2Button;

//	@FindBy(xpath = "((\"//*[@id=\"modal_neostoxinfo\"]/div/div/div[3]/div/div/div/a"] private WebElement pops2;


	@FindBy(xpath= ("//span[@id=\"lbl_username\"]")) private WebElement userName;


	@FindBy(xpath = "//span[text()='Logout']") private WebElement logoutButton;
	
public NeoStoxDashBoardPage(WebDriver driver )
{
PageFactory.initElements(driver,this);
}

public void handlePopUp1() throws InterruptedException 

{

//Thread.sleep(500); 
pops1.click();
 
//Thread.sleep(500); 
popUp0k2Button.click();

}

public void validateusername(String expectedusername)


{
	
	String actualusernmae= userName.getText();
	
if (actualusernmae.equals(expectedusername))
		
		System.out.println("Test case is passed");
	
		else { 
			System.out.println("Test case is failed");
		}
}

public void logout()
{
	userName.click();
	logoutButton.click();
	
}

public String getActualusername()
{
	String username= userName.getText();
	return username;
}

}
	

