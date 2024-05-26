package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"StepDefinition","utility"},
        plugin = {"pretty","html:target/cucumber-html-report","json:cucumber.json"}
)

public class TestRunner {

}
