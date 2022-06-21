package StepDef;

import Apiutils.CreateApi;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Verifygetsteps {

	@Given("Calling Get Method")
	public void calling_get_method() {
	   CreateApi ref = new CreateApi();
	   ref.getmethod();
	}

	@Then("executed Successfully")
	public void executed_successfully() {
	    System.out.println("executed successfully");
	}
}
