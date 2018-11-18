import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/"}, glue = {"java.steps"},
        plugin = {"json:target/cucumber-report.json",
                "pretty",
                "html:target/cucumber-reports",
                "rerun:rerun.txt"},
        tags = {"@web"})
public class CucumberRunner {
}