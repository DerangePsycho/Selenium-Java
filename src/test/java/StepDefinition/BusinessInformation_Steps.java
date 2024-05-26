package StepDefinition;

import static actions.ActivateAccount.*;
import io.cucumber.java.en.And;

public class BusinessInformation_Steps {

    @And("^I also completed all the requirements for Step 4 - Business Information$")
    public void step4() throws InterruptedException{
        fillUpBusinessInformationSteps();
    }

}
