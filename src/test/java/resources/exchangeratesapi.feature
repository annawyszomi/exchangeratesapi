Feature: exchangeratesapi endpoint tests

  Scenario: Get successful response from exchangeratesapi
    Given Create API call
    When Execute API call url: "https://api.apilayer.com/exchangerates_data/latest" apikey: "y0wKbxNW3woDwtfiPNF1bVNsZVpHKm0K"
    Then Get 200 code status

  Scenario: Get bad request response from exchangeratesapi
    Given Create API call
    When Execute API call url: "https://api.apilayer.com/exchangerates_data/lates" apikey: "y0wKbxNW3woDwtfiPNF1bVNsZVpHKm0K"
    Then Get 400 code status

  Scenario: Get unauthorized response from exchangeratesapi
    Given Create API call
    When Execute API call url: "https://api.apilayer.com/exchangerates_data/latest" apikey: ""
    Then Get 401 code status

  Scenario: Get not found response from exchangeratesapi
    Given Create API call
    When Execute API call url: "https://api.apilayer.com/exchangerates_data/" apikey: "y0wKbxNW3woDwtfiPNF1bVNsZVpHKm0K"
    Then Get 404 code status
