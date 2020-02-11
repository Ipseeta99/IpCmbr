$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Feature/Tables.feature");
formatter.feature({
  "name": "Login Functionality Testing",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login with multiple sets of test data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User opens the application",
  "keyword": "Given "
});
formatter.step({
  "name": "User clicks on the signin link",
  "keyword": "When "
});
formatter.step({
  "name": "User eneters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User will click on Login Button",
  "keyword": "Then "
});
formatter.step({
  "name": "Demo webshop homepage will be displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "wanderingkesh@gmail.com",
        "Test$123"
      ]
    },
    {
      "cells": [
        "jackson.aurora@aol.com",
        "Test$123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login with multiple sets of test data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User opens the application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.tableUser.user_opens_the_application1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the signin link",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.tableUser.user_clicks_on_the_signin_link1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User eneters \"wanderingkesh@gmail.com\" and \"Test$123\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.tableUser.user_eneters_and1(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will click on Login Button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.tableUser.user_will_click_on_Login_Button1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Demo webshop homepage will be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.tableUser.demo_webshop_homepage_will_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with multiple sets of test data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User opens the application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.tableUser.user_opens_the_application1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the signin link",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.tableUser.user_clicks_on_the_signin_link1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User eneters \"jackson.aurora@aol.com\" and \"Test$123\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.tableUser.user_eneters_and1(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will click on Login Button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.tableUser.user_will_click_on_Login_Button1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Demo webshop homepage will be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.tableUser.demo_webshop_homepage_will_be_displayed()"
});
formatter.result({
  "status": "passed"
});
});