package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.webtestbase;



public class loginpage extends webtestbase {

	@FindBy(xpath = "//*[@id=\"ap_email\"]")
	   WebElement mobileTextBox;
	
   
	   @FindBy(xpath = "//*[@id=\"continue\"]")
	    WebElement continuebtn;

	   @FindBy(xpath = "//*[@id=\"ap_password\"]")
	    WebElement passwordTextBox;
		    
	    @FindBy(id = "signInSubmit")
	    WebElement loginbtn;
	
	    public loginpage() {
	    	PageFactory.initElements(driver,this);
	    }
	    
	

	    
//sending the mobileno and password to the login
	    public void login(String mobile, String password){
	    	//signinbtn.click();
	        mobileTextBox.sendKeys(mobile);
	        continuebtn.click();
	        passwordTextBox.sendKeys(password);
	        loginbtn.click();
	        
	    }	
}
