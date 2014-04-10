/**
 * Created by kphani on 09/04/2014.
 */


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,tags = {"@reg"})
public class TestRun {
}
