package helpers;

import org.openqa.selenium.WebDriver;

public class CommonHelpers {

    WebDriver driver;

    public void openMaximized(String link) {
        driver.get(link);
        driver.manage().window().maximize();
    }
}
