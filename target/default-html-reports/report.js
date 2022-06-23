$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "RocketChat.step_definitions.LoginStepDefs.user_is_on_the_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User logs with valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "RocketChat.step_definitions.LoginStepDefs.user_logs_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "RocketChat.step_definitions.LoginStepDefs.user_should_be_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});