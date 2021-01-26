$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Login.feature");
formatter.feature({
  "name": "Login DealNow Shop",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User can login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on admin login screen",
  "keyword": "Then "
});
formatter.step({
  "name": "I enter user email as \"\u003cemail\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "I click on sign in button",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "buynoirtest@mailinator.com",
        "test12345"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User can login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on admin login screen",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.i_am_on_admin_login_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter user email as \"buynoirtest@mailinator.com\" and password as \"test12345\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.iEnterUserEmailAsAndPasswordAs(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.iClickOnSignInButton()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});