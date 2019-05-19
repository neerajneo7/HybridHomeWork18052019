package NopCommerce;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Utils
{
    BrowserSelector browserSelector = new BrowserSelector();
    LoadProp loadProp = new LoadProp();

@Before
    public void openBrowser()
    {
        browserSelector.setupBrowser();
    }

@After
    public void tearDown(Scenario scenario) {
    if (scenario.isFailed())
        {
        Utils.screenshotOfTheBrowserUsingCucumber(scenario);
        }
    driver.close();
    }
}
