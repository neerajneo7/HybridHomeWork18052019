package PageObjectModel;

import NopCommerce.Utils;
import org.openqa.selenium.By;

public class HomePage extends Utils
{
    private By _euroCurrency = By.xpath("//*[@id=\"customerCurrency\"]/option[2]");
    private By _verifyEuroCurrency = By.xpath("//span[@class='price actual-price'][1]");
    private By _dollarCurrency = By.xpath("//*[@id=\"customerCurrency\"]/option[1]");
    private By _verifyDollarCurrency = By.xpath("//span[@class='price actual-price'][1]");
    private By _clickOnRegisterPage = By.className("ico-register");


    public void selectEuroCurrency()
    {
        Utils.clickOnAnElement(_euroCurrency);

    }

    public void verifyEuroCurrency()
    {
        Utils.sortPriceIsInAscendingOrDescendingOrder(_verifyEuroCurrency);
        assertUsingSubstring("Ђ", _verifyEuroCurrency);
    }

    public void selectDollarCurrency()
    {
        Utils.clickOnAnElement(_dollarCurrency);
    }

    public void verifyDollarCurrency(){
        Utils.sortPriceIsInAscendingOrDescendingOrder(_verifyDollarCurrency);
        assertUsingSubstring("$", _verifyDollarCurrency);
    }

    public void clickOnRegistrationPage(){
        Utils.clickOnAnElement(_clickOnRegisterPage);
    }
}

