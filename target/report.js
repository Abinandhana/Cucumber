$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/AddTariff.feature");
formatter.feature({
  "name": "Add Tariff",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user should be in the telecom home page to add tariff",
  "keyword": "Given "
});
formatter.match({
  "location": "AddTariffSteps.user_should_be_in_the_telecom_home_page_to_add_tariff()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on add customer button to enter the datas",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariffSteps.user_click_on_add_customer_button_to_enter_the_datas()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters all the fields with valid data to click submit",
  "rows": [
    {
      "cells": [
        "1000",
        "600",
        "700",
        "100",
        "64",
        "45",
        "1"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddTariffSteps.user_enters_all_the_fields_with_valid_data_to_click_submit(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on submit button to get successful message",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariffSteps.user_clicks_on_submit_button_to_get_successful_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be displayed successful message",
  "keyword": "Then "
});
formatter.match({
  "location": "AddTariffSteps.user_should_be_displayed_successful_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/Features/AddTariffTwoDimensional.feature");
formatter.feature({
  "name": "Add Tariff Two Dimensional",
  "description": "",
  "keyword": "Feature"
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
  "name": "Uuser should be in the telecom home page to add tariff",
  "keyword": "Given "
});
formatter.match({
  "location": "AddTariffTwoDimensional.Uuser_should_be_in_the_telecom_home_page_to_add_tariff()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Uuser click on add customer button to enter the datas",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariffTwoDimensional.Uuser_click_on_add_customer_button_to_enter_the_datas()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "Uuser enters all the fields with valid data to click submit.",
  "keyword": "When "
});
formatter.match({
  "location": "AddTariffTwoDimensional.Uuser_enters_all_the_fields_with_valid_data_to_click_submit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Uuser clicks on submit button to get successful message",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariffTwoDimensional.Uuser_clicks_on_submit_button_to_get_successful_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Uuser should be displayed successful message",
  "keyword": "Then "
});
formatter.match({
  "location": "AddTariffTwoDimensional.Uuser_should_be_displayed_successful_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});