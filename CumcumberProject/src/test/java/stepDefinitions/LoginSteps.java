package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	private ChromeDriver driver;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		//System.out.println("Inside step -- user is on login page");	
		System.setProperty("webdriver.chrome.driver","D:/projects/src/test/resources/Drivers/chromedriver.exe");

		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://facebook.com/login");
	}


	@When("user enters username and password")
	public void user_enters_username_and_password() {
		//System.out.println("Inside step -- user enters username and password");
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("rbgproject1@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rbgproject@123");

	}


	@And("Click on login button")
	public void click_on_login_button() {
		//System.out.println("Inside step -- Click on login button");
		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();	
	}

	@Then("user is the navigated to the home page")
	public void user_is_the_navigated_to_the_home_page() {
		//System.out.println("Inside step -- user is the navigated to the  User home page");
	}

}
