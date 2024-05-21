package com.canvas.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="./src/main/java/com/canvas/feature/Demo.feature",
				glue="",
				tags="@demo",
				monochrome=true,
				plugin= {"pretty","html:target/result.html"},
				dryRun=false)

public class Testrunner {

}
