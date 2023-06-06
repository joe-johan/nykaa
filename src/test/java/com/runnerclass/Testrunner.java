package com.runnerclass;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Joe\\eclipse-workspace\\nykaa\\src\\test\\java\\com\\feature\\nyakka1.feature",
glue = "com.stepdefinition")

public class Testrunner  {




}
