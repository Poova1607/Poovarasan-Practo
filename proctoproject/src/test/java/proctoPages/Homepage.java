package proctoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	WebDriver driver;
	public Homepage (WebDriver driver) {
		this.driver=driver;
	}
	By surpic=By.xpath("//a[@aria-label='Surgeries']");
	public void surclick() {
		driver.findElement(surpic).click();
	}
	By tests=By.xpath("//a[@event='Nav:Interacted:Book diagnostic tests'][contains(text(),'Book tests')]");
	public void testclick() {
		driver.findElement(tests).click();
	}
}
