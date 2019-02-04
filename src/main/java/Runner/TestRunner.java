package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"/Users/dola/IdeaProjects/BDDFRAMEWORK/src/main/java/feature"},
        glue = {"stepDefinition"},
        format = {"pretty","html:test-outout"},
        dryRun = false,
        monochrome = true,
        strict = true

)
public class TestRunner {

}
