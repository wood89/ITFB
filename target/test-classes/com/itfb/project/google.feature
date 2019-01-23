Feature: Check google

@severity=blocker
Scenario: Check google
  Given user opens "https://www.google.com/?hl=ru"
  When user clicks on search area
  And user types "ITFB" in search area and press key
  Then user must watch titles with "ITFB" word