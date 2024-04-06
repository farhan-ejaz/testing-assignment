# FUNCTION: ADD TASK
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
