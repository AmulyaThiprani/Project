package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.webtestbase;
import util.utility;

public class myaccount extends webtestbase {
	//ask
@FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[1]/h1")
   WebElement accountTitle;


   @FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")
    WebElement searchTextBox;

	@FindBy(id = "nav-search-submit-text")
    WebElement searchBtn;
//done change
    @FindBy(xpath = "//div[@class='search-summary search-heading']")
    WebElement searchTitle;
  

    @FindBy(xpath = "//select[@class='styled']")
    WebElement dropDown;

    @FindBy(id = "nav-logo-sprites")
    WebElement hover;


    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[1]/div/div[7]/ul/li[6]/a")
    WebElement helpOption;
    
    @FindBy(xpath = "//*[@id=\\\"nav-orders\\\"]/span[1]")
    WebElement retOrderoption;
  
    
	public myaccount(){
        PageFactory.initElements(driver, this);
    }
	public String getTextOFMYAccountPage(){
        return accountTitle.getText();
}
	
/*	public void search(){
        searchTextBox.click();
        searchTextBox.sendKeys("shoes");
        searchTextBox.sendKeys(Keys.ENTER);
        searchBtn.click();
    }*/

	
    public void mouseHover(){
    	utility.mouseHover(driver,hover);
    }
   
  //  public String getTextOfSearch(){
  //      return searchTitle.getText();
//	    }

    public void scrollDownMethod() {
    	utility.scrollDownByElement(driver,helpOption);
    	 helpOption.click();

    }
    public void scrollUpMethod() {
    
    	utility.scrollUpByElement(driver,retOrderoption); 
       // retOrderoption .click();
    }

    public void windowHandle(){
    	utility.scrollDownByElement(driver,helpOption);
    	 helpOption.click();
        utility.switchToWindows(driver);
    }

    public void getCookiesHandle(){
    	utility.getCookies();
    }	

	
}