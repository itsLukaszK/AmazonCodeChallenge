Feature: Amazon
  Scenario: Add products to the shopping cart
    Given User is visiting 'https://www.amazon.com/' site
    When User goes into Best Sellers in Digital Cameras
    And User opens details of product number 'productNumber' from the list
    And User adds 'quantity' pieces of the product to the shopping cart and gets the name and price of the product
    Then The correct product was added
    And The subtotal price sum is correct