package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSteps {
	WebDriver driver;
	@Given("User opens Browser")
	public void user_opens_browser() {
		System.out.println("Opens Browser");
	    System.setProperty("webdriver.chrome.driver", "D:\\BuildCRM\\BuildCRM1\\src\\main\\resources\\Driver\\chromedriver2.exe");
	     driver = new ChromeDriver();
	}

	@When("Enters URL")
	public void enters_url() {
	    System.out.println("Enters URL");
	    driver.get("https://www.google.com/");
	}

	@Then("User on Google Page")
	public void user_on_google_page() {
	    System.out.println("Verify Google Page");
	    if(driver.getTitle().equals("Google"))
	    {
	    	System.out.println("Google Page is Displayed, Passed");
	    }
	    else
	    {
	    	System.out.println("Google Page is not Displayed, Failed");
	    }
	}
	
}
