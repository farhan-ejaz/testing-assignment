# FUNCTION: ADD TASK		

[<< Back](index.md)

------------------------


# ID: TC - 1 

*Description*

	Create a task with title, description, priority, with valid string, and due date in "YYYY-MM-DD" format. 
	Title: 10 characters
	Description: 25 characters
	Date: current date
	Priority: High

*Test Data*

	Title: Task-1
	Description: Test Assignment 
	Priority: High
	Due-date: 2024-05-01


*Expected Result*

	Task is created

----------------
 

# ID: TC - 2

*Description*
	
	Create a task with unsupported priority: Critical

*Test Data*
	
	Title: Task-2
	Description: Test Assignment 
	Priority: great
	Due-date: 2024-05-01
	

*Expected Result*

	Task not to be created, Message saying priority not supported, please provide valid priority: ‘High, Medium, Low’
----------------

# ID: TC - 3

*Description*
	
	Create a task with blank “priority”

*Test Data*
	
	Title: Task-3
	Description: Test Assignment
	Priority: 
	Due-date: 2024-04-01
	

*Expected Result*

	Task not to be created, Message saying priority not supported, please provide valid priority: ‘High, Medium, Low’
----------------

# ID: TC - 4

*Description*
	
	Create a task with blank “Due-date”

*Test Data*
	
	Title: Task-4
	Description: Test assignment
	Priority: Low
	Due-date: 
	

*Expected Result*

	Task not to be created, Message saying “Due-date” is invalid, provide valid date in “yyyy-mm-dd”
----------------

# ID: TC - 5

*Description*
	
	Create a task with title, description, priority, with valid string, and due date is past date in "YYYY-MM-DD" format

*Test Data*
	
	Title: Task-5
	Description: Test assignment
	Priority: High
	Due-date: 2024-04-01
	

*Expected Result*

	Task not to be created, Message saying “Due-date” is invalid, provide valid date in “yyyy-mm-dd”
----------------

# ID: TC - 6

*Description*
	
	Create a task with title, description, priority, with valid string, and due date in " DD-MM-YYY" format

*Test Data*
	
	Title: Task-6
	Description: Test assignment
	Priority: High
	Due-date: 04-04-2025
	

*Expected Result*

	Task not to be created, Message saying “Due-date” is invalid, provide valid date in “yyyy-mm-dd”
----------------

[<< Back](index.md)
