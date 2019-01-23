Feature: Check ITFB site is visible

@severity=critical
Scenario: Check ITFB site is visible
  Given user must watch titles with "ITFB" word
  When user clicks on "itfb.ru/" link
  Then user must watch "http://itfb.ru/" site