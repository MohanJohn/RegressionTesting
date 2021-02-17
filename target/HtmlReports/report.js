$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/eclipse-workspace/cucujava/src/test/resources/features/DataTablewithHeader.feature");
formatter.feature({
  "name": "This is login feature of Booking Hostel",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "This is login scenario of hostel",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user in Hostel Login page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enter valid cendentials",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ]
    },
    {
      "cells": [
        "MathiJohn",
        "Mathi1612"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click login button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});