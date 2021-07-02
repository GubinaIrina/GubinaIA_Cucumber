
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "Cucumber/features",
        glue = "step",
        tags = "@1"
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
