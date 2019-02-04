$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Lulu signIn Feature",
  "description": "",
  "id": "lulu-signin-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Lulu signIn Feature test",
  "description": "",
  "id": "lulu-signin-feature;lulu-signin-feature-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "user is already on the signin page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "title of signin page is Lulu",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user clicks on signIn",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user enters email and password",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user clicks signin button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user is in My account page",
  "keyword": "Then "
});
formatter.match({
  "location": "SingInStepDefinition.user_is_already_on_the_signin_page()"
});
formatter.result({
  "duration": 6887757931,
  "status": "passed"
});
formatter.match({
  "location": "SingInStepDefinition.title_of_signin_page_is_Lulu()"
});
formatter.result({
  "duration": 15436904,
  "status": "passed"
});
formatter.match({
  "location": "SingInStepDefinition.user_clicks_on_signIn()"
});
formatter.result({
  "duration": 2348538405,
  "status": "passed"
});
formatter.match({
  "location": "SingInStepDefinition.user_enters_email_and_password()"
});
formatter.result({
  "duration": 334356284,
  "status": "passed"
});
formatter.match({
  "location": "SingInStepDefinition.user_clicks_signin_button()"
});
formatter.result({
  "duration": 2110360312,
  "status": "passed"
});
formatter.match({
  "location": "SingInStepDefinition.user_is_in_My_account_page()"
});
formatter.result({
  "duration": 10030173,
  "status": "passed"
});
});