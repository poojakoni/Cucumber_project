package stepdef;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {

	WebDriver driver = Hooks.driver;

	@Given("I have launched the application")
	public void i_have_launched_the_application() {
		// Write code here that turns the phrase above into concrete actions

		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

	}

	@When("I enter the correct username and password")
	public void i_enter_the_correct_username_and_password() {
		// Write code here that turns the phrase above into concrete actions

		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys("poojakoni7@gmail.com ");

		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Pooja@9876");
	}

	@Then("I should land on the home page")
	public void i_should_land_on_the_home_page() {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("I enter the incorrect username and password")
	public void i_enter_the_incorrect_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys("abc@xyz.com");

		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Test@1234");
	}

	@Then("I should get the error message {string}")
	public void i_should_get_the_error_message(String ExpError) {// one parameter
		// Write code here that turns the phrase above into concrete actions
		WebElement Error = driver.findElement(By.id("msg_box"));
		String ActError = Error.getText();
		Assert.assertEquals(ExpError, ActError);
	}

	@And("i clciked on Login Link") // And or given ,and can work anywhere
	public void i_clciked_on_Login_Link() {
		// Write code here that turns the phrase above into concrete actions
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();

	}

	@When("i clcik on Login Button")
	public void i_clcik_on_Login_Button() {
		// Write code here that turns the phrase above into concrete actions
		WebElement LoginBtn = driver.findElement(By.name("btn_login"));
		LoginBtn.click();
	}

	@When("I enter the  username as {string} and password as {string}")
	public void i_enter_the_username_as_and_password_as(String usernameval, String passwordval) { // pass username and
																									// passowrd in
																									// defination itself
		// Write code here that turns the phrase above into concrete actions

		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys(usernameval);

		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(passwordval);
	}
}
