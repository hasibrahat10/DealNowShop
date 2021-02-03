$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Store.feature");
formatter.feature({
  "name": "DealNow shop storefront feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login with valid credentials as customer",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test-customerLogin"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I hover mouse on sign in icon",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.StoreSteps.i_hover_mouse_on_sign_in_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on store sign in button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.StoreSteps.i_click_on_store_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have enter login details for customer",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.StoreSteps.i_have_enter_login_details_for_customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on login button",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.StoreSteps.i_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am on customer profile panel",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.StoreSteps.i_am_on_customer_profile_panel()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});