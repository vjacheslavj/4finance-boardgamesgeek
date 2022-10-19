package pages;

import org.openqa.selenium.By;


public class MainPage {
    public final By DROPDOWN_MENU = new By.ByXPath("//div[contains(@class, 'c-inner tw-flex')]//button[2]");
    public final By TOP_GROWING_GAME = new By.ByXPath("(//ul[@class='geeksidebar-links hotness tw-m-0 tw-list-none tw-p-0']//*[contains(@data-icon, 'caret-up')])[1]");
}