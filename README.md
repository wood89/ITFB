# ITFB

Test plan:

Scenario: Check google
- user opens "https://www.google.com/?hl=ru"
- user clicks on search area
- user types "ITFB" in search area and press key
- user must watch titles with "ITFB" word

Scenario: Redirect to ITFB site
- user must watch titles with "ITFB" word
- user clicks on "itfb.ru/" link
- user must watch "http://itfb.ru/" site
