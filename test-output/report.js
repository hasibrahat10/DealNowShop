$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Login.feature");
formatter.feature({
  "name": "Login DealNow Shop",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User can login with valid credentials",
  "description": "",
  "keyword": "Scenario"
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
formatter.after({
  "status": "passed"
});
});