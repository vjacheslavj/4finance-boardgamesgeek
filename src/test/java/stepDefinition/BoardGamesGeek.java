package stepDefinition;

import helpers.CommonHelpers;
import io.cucumber.java.en.Given;
import utils.Environment;

public class BoardGamesGeek {
    CommonHelpers commonHelpers = new CommonHelpers();
    Environment environment = new Environment();

    @Given("I launch BoardGamesGeek main page")
    public void launchBGGMainPage() {
        commonHelpers.openMaximized(environment.getUrl());
    }
}
