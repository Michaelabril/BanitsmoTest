package com.prueba.Banitsmo.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/register.feature",
        tags = "@portalBanistmo",
        glue= "com/prueba/Banitsmo/stepdefinitions",
        snippets= SnippetType.CAMELCASE,
        monochrome = true)
public class RegisterRunner {

}
