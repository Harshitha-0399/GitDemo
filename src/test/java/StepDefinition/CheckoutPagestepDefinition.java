package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.CheckoutPage;
import utils.TextContextSetup;

public class CheckoutPagestepDefinition {
	public WebDriver driver;
	public String landingPageproductName;
	public String offerPageProductName;
	public TextContextSetup setup1;
	public CheckoutPage checkoutPage;

	public CheckoutPagestepDefinition(TextContextSetup setup) {
		this.setup1 = setup;
		this.checkoutPage = setup1.pageObjectManager.CheckoutPage();
	}

	@Then("^User proceeds to Checkout and validate the (.+) item in checkout page$")
	public void user_proceeds_to_checkout_and_validate_the_item_in_checkout_page(String name) throws Throwable {
		checkoutPage.checkoutItems();
	}

	@And("^verify user has ability to enter promo code and place the order$")
	public void verify_user_has_ability_to_enter_promo_code_and_place_the_order() throws Throwable {

		Assert.assertTrue(checkoutPage.verifyPromoButton());
		Assert.assertTrue(checkoutPage.verifyPlaceOrderButton());

	}
}
