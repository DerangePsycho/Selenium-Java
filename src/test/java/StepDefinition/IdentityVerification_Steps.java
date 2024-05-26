package StepDefinition;
import io.cucumber.java.en.*;
import static actions.ActivateAccount.*;
import static actions.KYC.*;

public class IdentityVerification_Steps {
    @When("^I completed all the requirements for Step 2 - Identity Verification$")
    public void step2() throws InterruptedException {
        navigateToKycPage();
        verifyIdentity();
    }

}
