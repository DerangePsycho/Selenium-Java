package StepDefinition;
import static actions.ActivateAccount.*;
import io.cucumber.java.en.Then;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class AssertionStep {
    @Then("^I am able to submit my PayMongo account activation application$")
    public void checkIfMyRequirementsAreSubmitted() throws IOException, ParseException {
        assertApplicationSubmission();
    }
}
