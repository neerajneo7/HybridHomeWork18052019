$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/Resources/Features/Register.feature");
formatter.feature({
  "name": "As a user I should be able to register on the given website after filling in all compulsory fields on the registration form.",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@register"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to navigate to home page and click on register to see the registration form.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@register"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.userIsOnTheHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the register button",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.userClicksOnTheRegisterButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to see the registration form successfully.",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userShouldBeAbleToSeeTheRegistrationFormSuccessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "As a user I should then be able to register after filling in all compulsory fields on the registration form",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@register"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the register page",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.userIsOnTheRegisterPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters all the fields",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.userEntersAllTheFields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to register successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userShouldBeAbleToRegisterSuccessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "should see a message “Your registration completed”.",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.shouldSeeAMessageYourRegistrationCompleted()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/Resources/Features/VerifyCurrency.feature");
formatter.feature({
  "name": "As a user I should be able to select  any given currency on homepage and see the Featured Products according to the selected currency.",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@currency"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to select the Euro currency.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@currency"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.userIsOnTheHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects the Euro Currency from dropdown",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.userSelectsTheEuroCurrencyFromDropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to see the Featured Products in Euro.",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userShouldBeAbleToSeeTheFeaturedProductsInEuro()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to select the Dollar Currency",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@currency"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.userIsOnTheHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects Dollar Currency from dropdown",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.userSelectsDollarCurrencyFromDropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to see the Featured Products in Dollar.",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userShouldBeAbleToSeeTheFeaturedProductsInDollar()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});