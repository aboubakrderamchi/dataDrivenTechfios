$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/LoginWithDataFromMySqlDatabase.feature");
formatter.feature({
  "name": "Codefios page login functionality validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@DataFromMySqlFeature"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the codefios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.StepDefinition.user_is_on_the_codefios_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to login with valid credential",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@DataFromMySqlFeature"
    },
    {
      "name": "@DBScenario1"
    }
  ]
});
formatter.step({
  "name": "User enters \"username\" from mysql database",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_enters_from_mysql_database(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"password\" from mysql database",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_enters_from_mysql_database(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.StepDefinition.user_clicks_on_the_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to land on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.StepDefinition.user_should_be_able_to_land_on_dashboard_page()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: Welcome To Codefios expected [Codefios QA] but found [Page not landed on Dashboard page]\r\n\tat org.testng.Assert.fail(Assert.java:99)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:1037)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:140)\r\n\tat org.testng.Assert.assertEquals(Assert.java:122)\r\n\tat org.testng.Assert.assertEquals(Assert.java:629)\r\n\tat steps.StepDefinition.user_should_be_able_to_land_on_dashboard_page(StepDefinition.java:55)\r\n\tat ✽.User should be able to land on dashboard page(classpath:features/LoginWithDataFromMySqlDatabase.feature:13)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});