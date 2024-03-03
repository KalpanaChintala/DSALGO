Feature: Register features of the DSAlgoApplication
Scenario Outline: Register scenario with different sets of data
Given User is on the Register Page
When User fills the page from given sheetname "<SheetName>" and rownumber <RowNumber>
And User clicks on Register button
Then User should be able to see the message displayed "password_mismatch:The two password fields didn’t match."

Examples:
|SheetName|RowNumber|
|Register|0|
|Register|1|
|Register|2|

Scenario Outline: Register scenario with empty fields
Given User is on the Register Page
When User fills the page from given sheetname "<SheetName>" and rownumber <RowNumber>
And User clicks on Register button
Then User should be able to see the alert message "Please fill out this field."
Examples:
|SheetName|RowNumber|
|Register|3|
|Register|4|
|Register|5|