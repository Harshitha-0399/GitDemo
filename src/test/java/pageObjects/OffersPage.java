package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {
	WebDriver driver;

	public OffersPage(WebDriver driver) {
		this.driver = driver;
	}

	By searchBox = By.cssSelector("#search-field");
	By productName = By.cssSelector("tr td:nth-child(1)");

	public void SearchItem(String string) {
		driver.findElement(searchBox).sendKeys(string);
	}

	public String GetName() {
		String s1 = driver.findElement(productName).getText();
		return s1;
	}

}
