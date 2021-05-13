import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"D:/fordeveducationAllure/src/test/resources/Tests/AddNewPetToTheStore.feature"},
        plugin = {"json:D:/fordeveducationAllure/target/cucumber-parallel/1.json"},
        monochrome = false,
        tags = {"@petsTests"},
        glue = {"Steps"})
public class Parallel01IT {
}
