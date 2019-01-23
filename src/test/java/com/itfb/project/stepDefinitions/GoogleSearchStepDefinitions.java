package com.itfb.project.stepDefinitions;

import com.itfb.project.stepDefinitions.config.ITFBContext;
import cucumber.api.java.en.When;

public class GoogleSearchStepDefinitions implements ITFBContext {

    @When("^user must watch titles with \"([^\"]*)\" word$")
    public void checkTitleIsVisible(String url) {
        googleSearchPage.checkTitleIsVisible(url);
    }

    @When("^user clicks on \"([^\"]*)\" link$")
    public void clickITFBLink(String url) {
        googleSearchPage.clickITFBLink(url);
    }

    @When("^user must watch \"([^\"]*)\" site$")
    public void checkURL(String url) {
        googleSearchPage.checkURL(url);
    }
}
