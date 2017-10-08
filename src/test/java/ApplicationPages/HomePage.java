package ApplicationPages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver1)
	{
		this.driver= driver1;
	}
	
	@FindBy(xpath= "//span[text()='Log In']") 
	WebElement login;
	
	@FindBy(xpath= "//span[text()='Wishlist']") 
	WebElement wishlist;
	
	@FindBy(xpath= "//span[text()='My Cart']")
	WebElement MyCart;
	
	@FindBy(xpath= "//span[text()='My Account']") 
	WebElement MyAccount;
	
	@FindBy(xpath= "//span[class='hidden-xs'][text()='Home']") 
	WebElement Homepage;
	
	public void login()
	{
		login.click();
	}
	
	public void home()
	{
		Homepage.click();
	}
	
	public void cart()
	{
		MyCart.click();
	}
	
	public void myAccount()
	{
		MyAccount.click();
	}
	
	public void wishlist()
	{
		wishlist.click();
	}
	public String getApplicationTitle()
	{
		return(driver.getTitle());
	}
	
	
	
	

	
	
}
