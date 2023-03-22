Feature: Vehicle contracts functionality

  Background:
    Given User logged in as posmanager
    And user selects "Fleet" module from the navigation bar
    And user selects "Vehicles Contracts" module button to land on the page


    Scenario: Verify that user can create a Vehicle Contract
      When user clicks on the Create button
      And user selects a Vehicle
      And user clicks to Save button
      Then page title changes to the new Vehicle Contract value


    Scenario: Verify that user cannot create a Vehicle Contract without selecting vehicle
      When user clicks on the Create button
      And user clicks to Save button
      And user receives a warning popup message, means that he is unable to create a vehicle.
      Then user makes sure his contract is NOT created by verifying page title stayed the same


    Scenario: Verify that user can cancel creating by clicking Discard button
      When user clicks on the Create button
      And user clicks on the Discard button
      Then user makes sure his contract is discarded by landing on the Vehicles Contracts page


    Scenario: Verify that page title is changed to the new Vehicle Contract value after user create the Vehicle Contract
      When user clicks on the Create button
      And user selects a Vehicle
      And user clicks to Save button
      Then page title changes to the new Vehicle Contract value


    Scenario: Verify that “Attachment” and Action buttons are displayed at the top of the page (after creating a new Vehicle Contract).
      When user clicks on the Create button
      And user selects a Vehicle
      And user clicks to Save button
      Then “Attachment” and Action buttons are displayed at the top of the page

      @wip
    Scenario: Verify that user can find the new created Vehicle Contract value under Vehicle Contract list by using search box.
     When user clicks on the Create button
     And user selects a Vehicle
     And user clicks to Save button
     And user selects "Vehicles Contracts" module button to land on the page
     And user searches for his recently created vehicle contract using search box by typing newly created vehicle's name
     When user should see his vehicle contract listed  under Vehicle Contract list