Feature: Redirect to ITFB site

@severity=critical
Scenario: Redirect to ITFB site
  Given user must watch titles with "ITFB" word
  When user clicks on "itfb.ru/" link
  Then user must watch "http://itfb.ru/" site