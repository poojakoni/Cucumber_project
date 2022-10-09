package stepdef;

import java.util.List;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalcultorStepdDef {
	
	int result=0;
	@Given("I have a calculator")
	public void i_have_a_calculator() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("open calculator");
	}

	@When("I add {int} and {int}")
	public void i_add_and(int int1, int int2) {
	    // Write code here that turns the phrase above into concrete actions
	    result= int1+int2;
	}

	@Then("I should get the result as {int}")
	public void i_should_get_the_result_as(int expectedresult) {
	    // Write code here that turns the phrase above into concrete actions
	Assert.assertEquals(expectedresult, result);
	}
	
	
	@When("I mul {int} and {int}")
	public void i_mul_and(int int1, int int2) {
	    // Write code here that turns the phrase above into concrete actions
		result= int1*int2;
	}

	@When("I div {int} and {int}")
	public void i_div_and(int int1, int int2) {
	    // Write code here that turns the phrase above into concrete actions
		result= int1/int2;
	}
	
	@When("I mul {string} and {string}")
	public void i_mul_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@Then("I should get the result as {string}")
	public void i_should_get_the_result_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@When("I add below numbers")
	public void i_add_below_numbers(List<Integer> numbers) {
	 
		for(Integer num:numbers)
			result=result+num;	
	}
}
