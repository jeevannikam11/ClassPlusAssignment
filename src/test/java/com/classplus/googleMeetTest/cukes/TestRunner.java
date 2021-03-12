package com.classplus.googleMeetTest.cukes;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        publish = true,
        features = {"src/test/resources/feature/googleMeet.feature"},
        glue = {"com/classplus/googleMeetTest"},
        tags = "@TestNow",
        plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber-html-reports/cucumber.json"}
)

public class TestRunner {
}
