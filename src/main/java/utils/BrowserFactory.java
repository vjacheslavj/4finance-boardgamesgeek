package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

    WebDriver driver;

    public void setupBrowser() {
        System.setProperty("webdriver.chrome.driver", "C://Users/vjermakovs/Desktop/New folder/chromedriver.exe");
        driver = new ChromeDriver();
    }
}
