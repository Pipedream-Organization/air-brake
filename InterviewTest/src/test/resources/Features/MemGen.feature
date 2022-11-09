Feature: Generate Meme

  Scenario Outline: Create First Meme
    Given I load the Meme Page
    When I Enter the <textfield>
    And I Enter the text field2
    Then I Generate Meme
    Examples:
      | textfiels |
      | test1     |
      | test2     |