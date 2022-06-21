package StepDef;

import java.io.FileNotFoundException;

import Apiutils.CreateApi1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Verifypoststeps {

	@Given("Calling Post Method")
	public void calling_post_method() throws FileNotFoundException {
	    CreateApi1 ref = new CreateApi1();
	    ref.postmethod();
	}

	@Then("Post executed Successfully")
	public void post_executed_successfully() {
	   System.out.println("Executed successfully");
}
}