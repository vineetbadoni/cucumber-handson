package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class StepDefinitions {
    @Given("I have {int} cakes in my belly")
    public void I_have_cakes_in_my_belly(int cakes) {
        Belly belly = new Belly();
        belly.eat(cakes);
    }

    @When("I wait {int} minutes")
    public void i_wait_hour(Integer minutes_to_wait) {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
        Belly belly = new Belly();
        belly.digestfor(minutes_to_wait);
    }
    @Then("my belly should growl")
    public void my_belly_should_growl() {
        Belly belly = new Belly();
        belly.growls();
    }

}
