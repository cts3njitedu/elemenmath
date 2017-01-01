package com.elementary.math;

import java.util.ArrayList;
import java.util.List;

import com.elementary.math.calculate.CalculateLCM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LCMSteps {

	CalculateLCM calcLcm;
	@Given("^a list of numbers$")
	public void a_list_of_numbers() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    List<Integer> numbers = new ArrayList<Integer>();
		
	    numbers.add(8);
	    numbers.add(9);
	    numbers.add(21);
	    calcLcm = new CalculateLCM(numbers);
	}

	@When("^I attempt to find the least common multiple$")
	public void i_attempt_to_find_the_least_common_multiple() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    calcLcm.execute();
	}

	@Then("^I should receive the correct result$")
	public void i_should_receive_the_correct_result() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println(calcLcm.lcmResult());
	}

}
