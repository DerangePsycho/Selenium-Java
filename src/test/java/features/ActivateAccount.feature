Feature: Activate Account

  Scenario: I am user that wants to activate my PayMongo Account
    Given I login as a verified user of PayMongo
     When I completed all the requirements for Step 2 - Identity Verification
      And I also completed all the requirements for Step 3 - General Information
      And I also completed all the requirements for Step 4 - Business Information
      And I also completed all the requirements for Step 5 - Statement of Acceptance
     Then I am able to submit my PayMongo account activation application