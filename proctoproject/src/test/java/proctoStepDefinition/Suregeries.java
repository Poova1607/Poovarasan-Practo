package proctoStepDefinition;

import javax.xml.datatype.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.When;

public class Suregeries {
	static public WebDriver driver;
	@Given("I am on Home Page")
	public void i_am_on_home_page() {
		driver = new ChromeDriver();
		driver.get("https://www.practo.com");
		driver.manage().window().maximize(); 
	}

	@Then("I click to Surgeries pic")
	public void i_click_to_surgeries_pic() {
		driver.findElement(By.xpath("//a[@aria-label='Surgeries']")).click();
		
	}
@Then("I Click to Book tests& checkups")
public void i_click_to_book_tests_checkups() throws InterruptedException {
	//Thread.sleep(10000);
	    driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[1]/div/div[2]/div/div/div[4]/a")).click();
}
}
