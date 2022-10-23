package tests;

import helpers.CommonHelpers;
import pages.MainPage;

public class BoardGamesGeekTest {
    CommonHelpers helpers = new CommonHelpers();
    MainPage main = new MainPage();
    public void openDropdown() {
        helpers.click(main.DROPDOWN_MENU);
    }

    public void clickTopGrowingGame() {
        helpers.click(main.TOP_GROWING_GAME);
    }

}