package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

	WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	By searchBox = By.xpath("//input[@type='search']");
	By productName = By.cssSelector("h4.product-name");
	By topdDealsLink = By.linkText("Top Deals");
	By increment = By.cssSelector("a.increment");
	By addToCart = By.cssSelector(".product-action button");

	public void searchItem(String name) {
		driver.findElement(searchBox).sendKeys(name);
	}

	public String nameExtraction() {
		String s1 = driver.findElement(productName).getText();
		return s1;

	}

	public void GoToTopDeals() {
		driver.findElement(topdDealsLink).click();
	}

	public String GetTitle() {
		return driver.getTitle();
	}

	public void incrementQuantity(int quantity) {
		int i = quantity - 1;
		while (i > 0) {
			driver.findElement(increment).click();
			i--;
		}
	}

	public void addToCart() {
		driver.findElement(addToCart).click();
	}
}
