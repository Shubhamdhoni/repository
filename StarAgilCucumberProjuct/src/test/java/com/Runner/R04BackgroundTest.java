package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(features = {"src/test/resources/MyCucumberProjuct/MyCucumberProjuct/F04BackgroundTest.feature"},
                   glue = {"com.stepDefenation"}     )
public class R04BackgroundTest {

}
