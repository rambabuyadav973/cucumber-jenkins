Feature: Sign In for petstore
  I want to use this template for my feature file

		Scenario Outline: 
			Given I want to launch the browser 
	    And I click on the link
	    When I click on sign in
	    And I enter username <name>
	    And I enter password <password>
	    And I click on login
	    
			 Examples: 
	    | name  |password|
	    | j2ee 	| j2ee 	| 
		 
 
	  Scenario: order for fish
	  Given I click on Fish
			| FISH |
			And I click on second
			| FI-SW-01 |
			And I click on third 
			| EST-1 |
			And I click add to cart
			And I click proceed to checkout
			And I click on continue
			And I click on confirm
			Then I validate fish order is placed
	
	
		Scenario: order for birds
		Given I click on Fish
			| BIRDS |
			And I click on second
			| AV-CB-01 |
			And I click on third 
			| EST-18 |
			And I click add to cart
			And I click proceed to checkout
			And I click on continue
			And I click on confirm
			Then I validate fish order is placed
		
		
		
    



  