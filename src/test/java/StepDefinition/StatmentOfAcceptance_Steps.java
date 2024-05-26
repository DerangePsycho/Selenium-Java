package StepDefinition;
import static actions.ActivateAccount.*;
import io.cucumber.java.en.And;

public class StatmentOfAcceptance_Steps {
    @And("^I also completed all the requirements for Step 5 - Statement of Acceptance$")
    public void step5() throws InterruptedException{
        fillUpStatementofAcceptance();
    }

}
