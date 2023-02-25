package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public WebDriver driver;
	public LandingPage landingpage;
	public OffersPage offerspage;
	public CheckoutPage checkoutpage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	// LandingPage landingpage = new LandingPage(setup1.driver);
	public LandingPage LandingPage() {
		landingpage = new LandingPage(driver);
		return landingpage;
	}

	public OffersPage OffersPage() {
		offerspage = new OffersPage(driver);
		return offerspage;
	}

	public CheckoutPage CheckoutPage() {
		checkoutpage = new CheckoutPage(driver);
		return checkoutpage;
	}

}
