import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import org.testng.annotations.*;



@CucumberOptions(
        features = "Cucumber/features",
        glue = "step",
        tags = "@1"
)
public class TestRunner extends AbstractTestNGCucumberTests {

    @Test
    public static void runTest() {

    }
}
