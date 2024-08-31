Feature: Home page
Scenario: Click to Surgeries pic
Given I am on Home Page
When: I click to Surgeries pic It Go The Surgery page
Then I Click to Book tests& checkups

Scenario Outline: Select the city and Search tests
When: I Select the city as <"<city>"> 
And: I Search the  tests as <"<tests>"> and Enter the key
And: If I find the tests and the city click on Book Now.

Examples:
     | city | tests |
     | Chennai | Diagnostic |
     | Bangalore | 
     

Scenario Outline: Select the Top Booked Diagnostic Tests in the list of the tests
When: I click Add 
Then: I click Proceed to Checkout

Scenario Outline: Add the Patient Details
When: Enter the Valid Patient Name as <"<patient name>">
And: Enter the Valid Number   as <"<Number>">
And:  Select the Gender and I Click the RadioButton
And: Enter the Valid Mobile Number as <"<mobile number>">
And: Enter the Valid Email-Id as <"<Email-Id>">
Then: I click Continue


Examples:
     | patient name | Number | mobile number | Email-Id |
     | Poovarasan | 22 | 9344179769 | poovarasandl2002@gmail.com |
     | Rajavi | 23 | 9849850890 | 
     

Scenario Outline: Select the Patient Address page
When: I click the Allow Pop Up
And: I Click the current Address
And: I Enter the Pincode as <"<pincode>">
And: I Enter the Flat Number as <"<flatnumber>">
And: I Enter the LandMark as <"<Landmark>">
And: I Select the Address and I click the RadioButton
Then: I click Save & Continue

Examples:
    | pincode | flatnumber | Landmark |
    
    
Scenario: Select the Timing 
When: I click the Avaliable timing in the timing page
Then: I click  Pay Now 










