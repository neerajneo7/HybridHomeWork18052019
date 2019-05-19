package PageObjectModel;

import NopCommerce.LoadProp;
import NopCommerce.Utils;
import org.openqa.selenium.By;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class RegistrationPage extends Utils
{
    LoadProp loadProp = new LoadProp();

    private By _clickOnRegister = By.xpath("//a[@class='ico-register']");
    private By _verifyRegistrationPage = By.xpath("//div[@class='page-title']");
    private By _firstName = By.xpath("//input[@id='FirstName']");
    private By _lastName = By.xpath("//input[@id='LastName']");
    private By _dobDay = (By.xpath("//select[@name='DateOfBirthDay']"));
    private By _dobMonth = (By.xpath("//select[@name='DateOfBirthMonth']"));
    private By _dobYear = (By.xpath("//select[@name='DateOfBirthYear']"));
    private By _companyName = (By.xpath("//input[@id='Company']"));
    private By _email = (By.xpath("//input[@type='email']"));
    private By _selectGender = (By.id("gender-male"));
    private By _password = (By.xpath("//input[@type='password']"));
    private By _confirmPassword = (By.xpath("//input[@id='ConfirmPassword']"));
    private By _newsletter = By.xpath("//input[@id='Newsletter']");
    private By _registerButton = By.xpath("//input[@id='register-button']");
    private By _registrationcomplete = By.xpath("//div[@class='result']");



    public void clickOnRegister()
    {
        Utils.clickOnAnElement(_clickOnRegister);
    }

    public void verifyUserIsOnRegistrationPage(){
        Utils.assertTextMessage("Register", _verifyRegistrationPage);

    }

    public void enterRegistrationDetails()
    {
        String timestamp = new SimpleDateFormat("dd.MM.yy.HH.mm.ss").format(new Date());

        Utils.clickOnAnElement(_selectGender);
        Utils.enterTextInTheField(_firstName, loadProp.getProperty("firstName"));
        Utils.enterTextInTheField(_lastName,loadProp.getProperty("lastName"));
        Utils.enterTextInTheField(_dobDay,loadProp.getProperty("day"));
        Utils.enterTextInTheField(_dobMonth, loadProp.getProperty("month"));
        Utils.enterTextInTheField(_dobYear,loadProp.getProperty("year"));
        String firsthalfemail = loadProp.getProperty("firstHalfemail");
        String lasthalfemail = loadProp.getProperty("lasthalfemail");
        String myemail = firsthalfemail + timestamp + lasthalfemail;
        Utils.enterTextInTheField(_email,myemail);
        Utils.enterTextInTheField(_companyName,loadProp.getProperty("companyName"));
        Utils.clickOnAnElement(_newsletter);
        Utils.enterTextInTheField(_password,loadProp.getProperty("password"));
        Utils.enterTextInTheField(_confirmPassword,loadProp.getProperty("confirmPassword"));
        Utils.clickOnAnElement(_registerButton);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Utils.assertTextMessage("Your registration completed", _registrationcomplete);

    }
}
