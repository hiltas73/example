Feature: Add item to favorites
  @wip
  Scenario: Search for Lacoste and add to favorites
    Given the user navigate to the URL
    And the user enter valid "h_iltas@yahoo.com" and "12345Hi"
    And navigate to "Parfüm & Deodorant" under "Kozmetik & Kişisel Bakım
    And search for "Lacoste" in Brand filter
    And click product no "<7>" on the result page
    And add product to the "Favorites"