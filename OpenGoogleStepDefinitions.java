package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenGoogleStepDefinitions {
	WebDriver driver;
	@Given("user is entering a google.co.in")
	public void user_is_entering_a_google_co_in() {
	    // Write code here that turns the phrase above into concrete actions
	driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
		
	}
	@When("user is typing a search term {string}")
	public void user_is_typing_a_search_term(String searchterm) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(searchterm);
	}
	@When("enter the return Key")
	public void enter_the_return_key() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

	}
    @Then("the user Should see the search results")
	public void the_user_should_see_the_search_results() {
	    // Write code here that turns the phrase above into concrete actions
		boolean status = driver.findElement(By.partialLinkText("wikiped")).isDisplayed();
		if (status==true) {
			System.out.println("Results displayed");
		}
		else
			System.out.println("Results not displayed");
		// add coomand
	}




}
