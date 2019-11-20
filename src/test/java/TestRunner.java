import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"/media/manish/data2/IJ/IJ_Projects/CucumberGradle/src/test/java/features/tag.feature"},
        glue = {"steps/"},
        dryRun = false,
        monochrome = true
)
public class TestRunner {

}
