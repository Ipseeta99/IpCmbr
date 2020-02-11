package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature\\Tables.feature",glue= {"StepDef"},plugin= {"html:target//report.html"}, monochrome=true)
public class testRunner {

}
