package StepDefinition;

import io.cucumber.java.en.*;
import static actions.Login.*;

public class LoginSteps {
    @Given("^I login as a verified user of PayMongo$")
    public void user_logins_to_login_page(){
        loginToPage();
    }

}
