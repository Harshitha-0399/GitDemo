Feature: Search and check product names are displayed

  @SearchOrder
  Scenario Outline: Search Experience for product search in both home and offers page
    Given User is on GreenCart landing page
    When User searched with shortname <Name> and extracted actual name of product
    Then User search for <Name> shortname in offers page
    And validate product name in offers page matches with Landing page

    Examples: 
      | Name |
      | Tom  |
      | Beet |
