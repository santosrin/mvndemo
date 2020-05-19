$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/santoshsrinivas/Documents/mvndemo/src/main/java/features/dealsmap.feature");
formatter.feature({
  "line": 1,
  "name": "Deal data creation",
  "description": "",
  "id": "deal-data-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Create a new Deal Scenario",
  "description": "",
  "id": "deal-data-creation;free-crm-create-a-new-deal-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 8
    },
    {
      "cells": [
        "santosh310184@yahoo.co.in",
        "Ragh_1234"
      ],
      "line": 9
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user moves to new deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user enters deal map details",
  "rows": [
    {
      "cells": [
        "title",
        "amount",
        "probability",
        "commission"
      ],
      "line": 15
    },
    {
      "cells": [
        "test deal1",
        "1000",
        "50",
        "10"
      ],
      "line": 16
    },
    {
      "cells": [
        "test deal2",
        "2000",
        "60",
        "20"
      ],
      "line": 17
    },
    {
      "cells": [
        "test deal3",
        "3000",
        "70",
        "30"
      ],
      "line": 18
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "close the browswer",
  "keyword": "Then "
});
formatter.match({
  "location": "dealStepWithMapDefinitions.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 3566209854,
  "status": "passed"
});
formatter.match({
  "location": "dealStepWithMapDefinitions.title_of_login_page_is_free_CRM()"
});
formatter.result({
  "duration": 2022292744,
  "status": "passed"
});
formatter.match({
  "location": "dealStepWithMapDefinitions.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 7056312700,
  "status": "passed"
});
formatter.match({
  "location": "dealStepWithMapDefinitions.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 80773098,
  "status": "passed"
});
formatter.match({
  "location": "dealStepWithMapDefinitions.user_is_on_home_page()"
});
formatter.result({
  "duration": 2011443197,
  "status": "passed"
});
formatter.match({
  "location": "dealStepWithMapDefinitions.user_moves_to_new_deal_page()"
});
formatter.result({
  "duration": 10302202768,
  "status": "passed"
});
formatter.match({
  "location": "dealStepWithMapDefinitions.user_enters_deal_details(DataTable)"
});
formatter.result({
  "duration": 47137945289,
  "status": "passed"
});
formatter.match({
  "location": "dealStepWithMapDefinitions.close_the_browswer()"
});
formatter.result({
  "duration": 96674263,
  "status": "passed"
});
});