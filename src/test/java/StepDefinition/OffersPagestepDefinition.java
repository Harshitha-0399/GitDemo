package StepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import pageObjects.PageObjectManager;
import utils.TextContextSetup;

public class OffersPagestepDefinition {

	public String offerPageProductName;
	TextContextSetup setup1;
	PageObjectManager pageObjectManager;

	public OffersPagestepDefinition(TextContextSetup setup) {
		this.setup1 = setup;
	}

	@Then("^User search for (.+) shortname in offers page$")
	public void user_search_for_same_shortname_in_offers_page(String string) throws InterruptedException {
		// OffersPage offerspage = new OffersPage(setup1.driver);
		OffersPage offerspage = setup1.pageObjectManager.OffersPage();

		switchToOffersPage();
		offerspage.SearchItem(string);
		Thread.sleep(2000);
		offerPageProductName = offerspage.GetName();
	}

	public void switchToOffersPage() {

		// pageObjectManager = new PageObjectManager(setup1.driver);
		// LandingPage landingpage =pageObjectManager.LandingPage();
		LandingPage landingpage = setup1.pageObjectManager.LandingPage();
		// LandingPage landingpage = new LandingPage(setup1.driver);

		landingpage.GoToTopDeals();
		setup1.genericUtils.switchToChildWindow();
	}

	@And("validate product name in offers page matches with Landing page")
	public void validate_product_name_in_offers_page_matches_with_Landing_page() {
		Assert.assertEquals(setup1.landingPageproductName, offerPageProductName);
System.out.println("BYE");	
}
}
