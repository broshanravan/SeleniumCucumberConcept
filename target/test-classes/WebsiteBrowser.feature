
   Feature: go to a particular predefined website

     Scenario Outline: Check the title of websites.
       Given I am on the home of <website>
       Then I should see that title contaild <word>

     Examples: This is a test data
       |website                 |word|
       |http://www.softpost.org |tutorials|
       |http://www.google.com   |google|