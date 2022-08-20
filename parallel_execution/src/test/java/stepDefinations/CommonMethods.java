package stepDefinations;

import io.cucumber.java.en.*;

public class CommonMethods {
	
	@Given("this is given")
	public void this_is_given() {
		System.out.println(Thread.currentThread().getId());
	    System.out.println("given");
	}
	
	
	@When("this is when")
	public void this_is_when() {
		System.out.println(Thread.currentThread().getId());
	    System.out.println("when");
	}
	@Then("this is then")
	public void this_is_then() {
		System.out.println(Thread.currentThread().getId());
	    System.out.println("then");
	}


}
