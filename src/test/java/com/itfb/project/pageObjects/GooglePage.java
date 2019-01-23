package com.itfb.project.pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GooglePage {

    private final SelenideElement searchField = $("[title=\"Поиск\"]");

    public void openSite(String url) {
        open(url);
    }

    public void clickSearchField() {
        searchField.click();
    }

    public void setSearchField(String text) {
        searchField.setValue(text).pressEnter();
    }

}
