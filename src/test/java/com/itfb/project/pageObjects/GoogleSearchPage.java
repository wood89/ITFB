package com.itfb.project.pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.junit.Assert.assertEquals;

public class GoogleSearchPage {

    public void checkTitleIsVisible(String titleName) {
        $$("h3").findBy(text(titleName));
    }

    public void clickITFBLink(String titleName) {
        SelenideElement link = $$("cite").findBy(text(titleName));
        link.click();
    }

    public void checkURL(String url) {
        assertEquals(url(), url);
    }
}
