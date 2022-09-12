Feature: Dynamics new record creation functionality
@tag_accountpipeline
Scenario: Account pipeline new record creation
	Given Im on the dynamics.com page
	And I click on client button
	Then I get existing records and new record creation page
	When I Click on +New button
	Then I get creation of new client form
	
	When I click on the Client Name filed and send values
	And I click on the Client Size 
	Then I select the Value from the drop down list

	When I click on the Client Ownership field
	Then I select the value from the drop drown list
	
	When I click on the Client Type
	Then I search for client type result
	
	When I click on TA or Contact? field
	Then I select the value from the drop down list
	
	When I click on Sector field
	Then I search for the sector result 
	
	When I click on Office Type
	Then I Select the value from the drop down list

	And I navigate to Client Details page
	And I click on Levy Paying field
	Then I select value from the drop down list
	
	When I click on The Apprenticeship Service status field
	Then I select the value from the drop down list
	
	When I click on the TAS Name
	Then I send value to TAS Name field
	
	When I click on the TAS Agreement ID field
	Then I send value to TAS Agreement ID field
	
	And I navigate to Site Details page
	When I click on Employer ID(ERN) field
	Then I send value to Employer ID(ERN) field
	
	When I click Status Reason field
	Then I select the value from the drop down list
	
	And I navigate to Client Contact Details page
	When I click on Street 1 field
	Then I pass the value and click on enter button
	And Check for all remaining address fields are filled with values
	
	And I navigate to Other page
	When I click on Price List field
	Then I select value from the drop down
	
	And I click on the Save button from the header tag.
	
	
	
	
	
	
	
	
	