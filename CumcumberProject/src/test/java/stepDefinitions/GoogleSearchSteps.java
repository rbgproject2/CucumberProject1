package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {

	WebDriver driver= null;

	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside step -- browser is open");

		String projectPath= System.getProperty("user.dir");

		//System.out.println("Project Path is: " ,+projectPath);
		//System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");

		System.setProperty("webdriver.chrome.driver","D:/projects/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().window().maximize();

	}


	@And("user is on google search box")
	public void user_is_on_google_search_box() {
		System.out.println("Inside step -- user is on google search box");


		driver.navigate().to("https://www.google.com/");
	}

	@When("user enter a text in search box")
	public void user_enter_a_text_in_search_box() throws InterruptedException {
		System.out.println("Inside step -- user enter a text in search box");

		driver.findElement(By.name("q")).sendKeys("Rbgtechnologies");
		Thread.sleep(3000);
	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException {
		System.out.println("Inside step -- hits enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("Inside step -- user is navigated to search results");
		driver.navigate().to("https://rbgtechnologies.com/");

		driver.getPageSource().contains("COURSES");
		driver.close();
		driver.quit();

	}

}


