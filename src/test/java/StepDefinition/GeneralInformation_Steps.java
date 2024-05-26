package StepDefinition;

import io.cucumber.java.en.And;
import static actions.ActivateAccount.*;

public class GeneralInformation_Steps {

    @And("^I also completed all the requirements for Step 3 - General Information$")
    public void step3() throws InterruptedException{
        fillUpGeneralInformation();
    }
}
