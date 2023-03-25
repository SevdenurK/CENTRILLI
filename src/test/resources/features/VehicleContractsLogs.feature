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
      And Attachment(s) button is displayed at the top of the page
      Then Action button is displayed at the top of the page

@wip
    Scenario: Verify that user can find the new created Vehicle Contract value under Vehicle Contract list by using search box.
     When user clicks on the Create button
     And user selects a Vehicle
     And user clicks to Save button
     And user selects "Vehicles Contracts" module button to land on the page
     And user searches for his recently created vehicle contract using search box by typing newly created vehicle's name
     When user should see his vehicle contract listed  under Vehicle Contract list


    Scenario: 7. Verify that user can change Vehicle Contract display to Kanban / List / Graph
      When user clicks to Kanban icon to change the view into kanban style
      And user clicks to Graph icon to change the view into graph style
      Then user clicks to List icon to change the view into list style


    Scenario: 8. Verify that user can change Vehicle Contract page number by right and left arrow, up right corner of screen.
      When user clicks to List icon to change the view into list style
      And user clicks right arrow that is at the up right corner of screen to change the page number
      And user jumps to the next page and the page number changes
      And user clicks left arrow that is at the up right corner of screen to change the page number
      Then user jumps to the previous page and the page number changes


      # Scenario Template: Verify that user can find the new created Vehicle Contract value under Vehicle Contract list by using search box.
      #    When user clicks on the Create button
      #    And user selects a Vehicle
      #    And user enters service type "<Service Type>"
      #    And user enters total price <Total price>
      #    And user enters date "<Date>"
      #    And user enters purchaser "<Purchaser>"
      #    And user enters vendor "<Vendor>"
      #    And user enters invoice reference <Invoice Reference>
      #    And user enters notes "<Notes>"
      #    And user clicks Save button
      #    And user sees the "<Vehicle>" on the page
      #    And user returns to the Vehicle Services Logs List by clicking the Vehicles Services Logs button
      #    And user enters below data in the search box along with filters on the Filters pageside.
      #    And user adds vehicle "<Vehicle>"
      #    And user adds service type "<Service Type>"
      #    And user adds total price <Total price>
      #    And user adds date "<Date>"
      #    And user adds purchaser "<Purchaser>"
      #    And user adds vendor "<Vendor>"
      #    And user adds invoice reference <Invoice Reference>
      #    And user adds notes "<Notes>"
      #    And user clicks Advanced Search... button
      #    Then user sees the "<new created>" Services Logs value.
      #    Examples:
      #      | Vehicle                    | Service Type | Total price | Date       | Purchaser | Vendor | Invoice Reference | Notes  | new created                |
      #      | Mercedes/Class A/1-MER-001 | Tax roll     | 100         | 03/19/2023 | Asli      | Yalcin | 100               | Thanks | Mercedes/Class A/1-MER-001 |