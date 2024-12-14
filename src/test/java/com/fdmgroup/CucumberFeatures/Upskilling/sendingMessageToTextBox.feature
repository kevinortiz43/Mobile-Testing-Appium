@ClickingNotificationsMenu

Feature: User reaches the notifications menu and clicks send notification button

    Scenario: User clicks on the notifications menu
        Given User is on main page
        When User clicks App page
        Then User clicks the Notifications page
        When User clicks the Incoming Message button 
        And Verify the API Demo notification is displayed
        Then User clicks the Allow button to clear the notification 


