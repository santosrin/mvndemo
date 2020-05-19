package stepDefinitions;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/santoshsrinivas/Documents/mvndemo/src/main/java/features/dealsmap.feature", // path of the feature files
        glue={"stepDefinitions"}, // part of step definintions in glue
        monochrome = true, // readable console output
        strict = true, // it will check if any step is not defined in step definition file
        dryRun = false,// to check if steps have corresponding step definintions before executing test cases ,
        // to check mapping is proper between feature file and step defintion file
        format = {"pretty","html:test-output", "json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"} // to generate different types of reporting - html  , json . xml
        )

public class TestRunner {

}
