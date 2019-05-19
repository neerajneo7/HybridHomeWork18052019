package NopCommerce;

import PageObjectModel.HomePage;
import PageObjectModel.RegistrationPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();

    @Given("user is on the homepage")
    public void userIsOnTheHomepage() {
    }

    @When("user selects the Euro Currency from dropdown")
    public void userSelectsTheEuroCurrencyFromDropdown() {
        homePage.selectEuroCurrency();
    }

    @Then("user should be able to see the Featured Products in Euro.")
    public void userShouldBeAbleToSeeTheFeaturedProductsInEuro() {
        homePage.verifyEuroCurrency();
    }

    @Then("user should be able to see the Featured Products in Dollar.")
    public void userShouldBeAbleToSeeTheFeaturedProductsInDollar() {
        homePage.verifyDollarCurrency();

    }

    @When("user selects Dollar Currency from dropdown")
    public void userSelectsDollarCurrencyFromDropdown() {
        homePage.selectDollarCurrency();
    }


    @When("user clicks on the register button")
    public void userClicksOnTheRegisterButton() {
        registrationPage.clickOnRegister();
    }

    @Then("user should be able to see the registration form successfully.")
    public void userShouldBeAbleToSeeTheRegistrationFormSuccessfully() {
        registrationPage.verifyUserIsOnRegistrationPage();
    }

    @Given("user is on the register page")
    public void userIsOnTheRegisterPage() {
        registrationPage.clickOnRegister();

    }

    @When("user enters all the fields")
    public void userEntersAllTheFields() {
        registrationPage.enterRegistrationDetails();

    }

    @Then("user should be able to register successfully")
    public void userShouldBeAbleToRegisterSuccessfully() {

    }

    @And("should see a message “Your registration completed”.")
    public void shouldSeeAMessageYourRegistrationCompleted() {
    }
}
