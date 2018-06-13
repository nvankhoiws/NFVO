**I. PREREQUISITE**
----
  Some API need token or/and project id. This describes how to get token and where to grab project id when you are running project.
  
***1. Get token***
* **CURL**

  curl -v -u openbatonOSClient:secret -X POST http://localhost:8080/oauth/token -H "Accept:application/json" -d "username=admin&password=openbaton&grant_type=password"

* **Method:**

  `POST`

* **Sample Call:**

  curl -v -u openbatonOSClient:secret -X POST http://localhost:8080/oauth/token -H "Accept:application/json" -d "username=admin&password=openbaton&grant_type=password"

* **Sample Response:**

  <pre>{
    "value": "08365a4b-9607-4397-80ad-4183cc5fc9b6",
    "expiration": "Jun 12, 2018 9:58:09 PM",
    "tokenType": "bearer",
    "refreshToken": {
      "expiration": "Jul 12, 2018 9:38:09 PM",
      "value": "7bcc14f0-1afd-4c18-919b-fb2aa36ee7ca"
    },
    "scope": [
      "read",
      "write"
    ],
    "additionalInformation": {}
  }</pre>

* **Notes:**

  The value of attribute "value" is token string. In this example, token is `08365a4b-9607-4397-80ad-4183cc5fc9b6`
