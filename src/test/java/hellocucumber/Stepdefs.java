package hellocucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

class IsItFriday {
    static String isItFriday(String day) {
        return "Friday".equals(day) ? "TGIF" : "Nope";
    }
}

public class Stepdefs {

    private String day;
    private String actualAnswer;

    @Given("today is {string}")
    public void today_is(String string) {
        this.day = day;
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
        actualAnswer = IsItFriday.isItFriday(day);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }


}
