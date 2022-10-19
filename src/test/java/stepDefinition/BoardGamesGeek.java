package stepDefinition;

import helpers.CommonHelpers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tests.BoardGamesGeekTest;
import utils.Environment;

public class BoardGamesGeek {
    CommonHelpers commonHelpers = new CommonHelpers();
    Environment environment = new Environment();
    BoardGamesGeekTest geek = new BoardGamesGeekTest();

    @Given("I launch BoardGamesGeek main page")
    public void launchBGGMainPage() {
        commonHelpers.openMaximized(environment.getUrl());
    }

    @When("open dropdown menu")
    public void openDropdownMenu() {
        geek.openDropdown();
    }

    @Then("click on top growing game")
    public void clickOnTopGrowingGame() {
        geek.clickTopGrowingGame();
    }
}
