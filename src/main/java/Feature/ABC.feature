Feature: ABC Feature




#@ABC
#Scenario Outline: ABC
#Given I am "<NameOfPerson>"
#When I do B
#Then I get C

#Examples:
  #|NameOfPerson|
  #|Akshay|
  #|Abikutty|
  #|Kiruthi|
  
  
  Scenario Outline: ABC
  Given I am reading a name and age
  |Akshu||10|
  |Harish||12|
  |Ganesh||34|
  Given I am "<NameOfPerson>"
  Examples:
  |NameOfPerson|
  |Abikuty|
  |Brindha|
  |Kiruthi|
  #When I enter the above provided name
  
  
  