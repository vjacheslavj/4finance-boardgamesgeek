package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonHelpers {

    WebDriver driver;
    WebDriverWait wait;

    public void openMaximized(String link) {
        driver.get(link);
        driver.manage().window().maximize();
    }

    public void click(By locator){
        wait.until(ExpectedConditions.presenceOfElementLocated(locator)).click();
    }
}
