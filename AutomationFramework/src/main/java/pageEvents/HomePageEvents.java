package pageEvents;

import org.testng.Assert;

import pageObjects.HomePageElements;
import pageObjects.LoginPageElements;
import utils.ElementFetch;

public class HomePageEvents {
	ElementFetch ele = new ElementFetch();
	public void signInButton()
	{
		ele.getWebElement("XPATH", HomePageElements.signInButtonText).click();
		
	}
	public void clickAboutButton(){
		ele.getWebElement("XPATH", HomePageElements.aboutButton).click();
		
		Assert.assertTrue(ele.getWebElements("XPATH", HomePageElements.aboutText).size()>0);
	}
	
}
