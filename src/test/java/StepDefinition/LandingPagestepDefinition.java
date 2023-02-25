package StepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.TextContextSetup;

public class LandingPagestepDefinition {
	public WebDriver driver;
	public String landingPageproductName;
	public String offerPageProductName;
	public TextContextSetup setup1;
	public LandingPage landingpage;

	public LandingPagestepDefinition(TextContextSetup setup) {
		this.setup1 = setup;
		this.landingpage = setup1.pageObjectManager.LandingPage();
	}

	@Given("User is on GreenCart landing page")
	public void user_is_on_green_cart_landing_page() throws IOException {
		Assert.assertTrue(landingpage.GetTitle().contains("GreenKart"));
		System.out.println("HI");
		System.out.println("BYE");

System.out.println("4");
		System.out.println("5");

		
	}

	@When("^User searched with shortname (.+) and extracted actual name of product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String string)
			throws InterruptedException {
		// LandingPage landingpage = new LandingPage(setup1.driver);

		landingpage.searchItem(string);
Thread.sleep(2000);
		setup1.landingPageproductName = landingpage.nameExtraction().split("-")[0].trim();

	}

	@And("^Added \"([^\"]*)\" items of the selected product to cart$")
	public void added_something_items_of_the_selected_product_to_cart(String strArg1) throws Throwable {

		landingpage.incrementQuantity(Integer.parseInt(strArg1));
		landingpage.addToCart();

	}

}
