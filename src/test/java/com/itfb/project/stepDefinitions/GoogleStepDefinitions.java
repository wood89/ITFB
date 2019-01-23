package com.itfb.project.stepDefinitions;

import com.itfb.project.stepDefinitions.config.ITFBContext;
import cucumber.api.java.en.When;

public class GoogleStepDefinitions implements ITFBContext {

    @When("^user opens \"([^\"]*)\"$")
    public void openSite(String url) {
        googlePage.openSite(url);
    }

    @When("^user clicks on search area$")
    public void clickSearchField() {
        googlePage.clickSearchField();
    }

    @When("^user types \"([^\"]*)\" in search area and press key$")
    public void clickSearchField(String text) {
        googlePage.setSearchField(text);
    }
}
