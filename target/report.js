$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/eclipse-workspace/cucujava/src/test/resources/features/CucumberClass2.feature");
formatter.feature({
  "name": "To Valitdate the login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User have to lanuch chrome and hit the FB url",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.user_have_to_lanuch_chrome_and_hit_the_FB_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "To verify login functionality with valid username and with password  in FB ",
  "keyword": "Scenario"
});
formatter.step({
  "name": "enter the username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "john",
        "john@123"
      ]
    },
    {
      "cells": [
        "Arun",
        "Arun@123"
      ]
    },
    {
      "cells": [
        "Mathi",
        "Mathi@123"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LoginStep.enter_the_username_and_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User have to lanuch chrome and hit the FB url",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.user_have_to_lanuch_chrome_and_hit_the_FB_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the forgot the password link",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user has to click the forget password link",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStep.user_has_to_click_the_forget_password_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to entre the mobileNo",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.user_has_to_entre_the_mobileNo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click thw search button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.click_thw_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to navigate the OTP page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});