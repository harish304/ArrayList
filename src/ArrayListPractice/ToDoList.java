package ArrayListPractice;

import java.util.ArrayList;

/* Task: Implement a simple “To-Do List” application

Scenario: You are developing a simple “To-Do List” application for a user. The user should be able to add tasks to the list, view all tasks, and remove completed tasks.

Requirements:

Add Tasks: The user should be able to add a task to the to-do list. Each task will be a String. Use an ArrayList to store the tasks.
View Tasks: The user should be able to view all the tasks currently in the to-do list. Print each task on a new line.
Remove Tasks: The user should be able to remove a task from the to-do list by specifying the task’s index.
Implementation Steps:

Create a new class ToDoList with an instance variable tasks which is an ArrayList of Strings.
Implement a method addTask(String task) that adds a task to the tasks ArrayList.
Implement a method viewTasks() that prints all the tasks in the tasks ArrayList.
Implement a method removeTask(int index) that removes a task from the tasks ArrayList based on its index.
In a main method, create an instance of ToDoList and add, view, and remove tasks to test your implementation.
Remember to handle potential IndexOutOfBoundsException when removing tasks. If the user tries to remove a task at an index that doesn’t exist, print a friendly error message.

This task will help you understand how to manipulate data in an ArrayList, which is a common requirement in many real-world applications. Happy coding! 😊
 */

public class ToDoList {
	
		ArrayList<String> tasks;
		
		public ToDoList( ) {
		 tasks = new ArrayList<>();	
		}
		public void addTask(String task) {
			tasks.add(task);
		}
		
		public void viewTasks() {
			for(int i =0 ;i<tasks.size();i++) {
				System.out.println("Tasks viewd are : " + tasks.get(i));
			}
		}
		public void removeTask(int index) {
			if (index > 0 && index <= tasks.size()) {
	            tasks.remove(index - 1);
	        } else {
	            System.out.println("Invalid task number. Please try again.");
	        }
	    }

	    public static void main(String[] args) {
	        ToDoList toDoList = new ToDoList();
	        toDoList.addTask("Buy groceries");
	        toDoList.addTask("Finish homework");
	        toDoList.viewTasks();
	        toDoList.removeTask(1);
	        toDoList.viewTasks();
		
	    }

}
