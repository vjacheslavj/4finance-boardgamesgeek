package stepDefinition;

import io.cucumber.java.Before;
import utils.BrowserFactory;

public class Hooks {
    BrowserFactory browserFactory = new BrowserFactory();

    @Before
    public void setupWebBrowser() {
        browserFactory.setupBrowser();
    }
}
