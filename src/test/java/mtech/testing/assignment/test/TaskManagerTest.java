package mtech.testing.assignment.test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import mtech.testing.assignment.Task;
import mtech.testing.assignment.TaskManager;


public class TaskManagerTest {
    private TaskManager taskManager;
    
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    @Before
    public void setUp() {
        taskManager = new TaskManager();
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    
    @Test
    public void testDisplayTasks_EmptyList() {
        String expectedOutput = "No tasks found.";
        taskManager.displayTasks();
        
        Assert.assertEquals(expectedOutput, outputStreamCaptor.toString()
        	      .trim());
    }

    @Test
    public void testAddTaskWithValidTask() {
        Task task = new Task("Sample Task", "Sample task description", "2024-10-10", "Low");
        taskManager.addTask(task);
        
        String expectedOutput = ("Tasks:\r\n"
        		+ task.toString()).stripTrailing();
        
        taskManager.displayTasks();
        String actualOutput = outputStreamCaptor.toString().stripTrailing();
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testEditTaskWithIndexLessThanZero() {
        Task task = new Task("Sample Task", "Sample task description", "2024/10/10", "Low");
        taskManager.editTask(-1, task);
               
        // check error is thrown
        String expectedOutput = "Invalid task index.";
        String actualOutput = outputStreamCaptor.toString().stripTrailing();
        Assert.assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    public void testEditTaskWithIndexZero() {
        Task task = new Task("Sample Task", "Sample task description", "2024/10/10", "Low");
        taskManager.addTask(task);
        
        Task taskUpdated = new Task("Sample Updated Task", "Sample task description", "2024/10/10", "Low");
        taskManager.editTask(0, taskUpdated);
               
        // check task updated
        String expectedOutput = "Task updated successfully.";
        String actualOutput = outputStreamCaptor.toString().stripTrailing();
        Assert.assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    public void testEditTaskWithInvalidValidIndexSize() {
        Task task1 = new Task("Sample Task1", "Sample task description", "2024/10/10", "Low");
        Task task2 = new Task("Sample Task2", "Sample task description", "2024/10/10", "Low");

        taskManager.addTask(task1);
        taskManager.addTask(task2);
        
        Task taskUpdated = new Task("Sample Updated Task", "Sample task description", "2024/10/10", "Low");
        taskManager.editTask(2, taskUpdated);
               
        // check task updated
        String expectedOutput = "Invalid task index.";
        String actualOutput = outputStreamCaptor.toString().stripTrailing();
        Assert.assertEquals(expectedOutput, actualOutput);
    }

   
    @Test
    public void testCompleteTaskWithIndexLessThanZero() {
        Task task = new Task("Sample Task", "Sample task description", "2024/10/10", "Low");
        taskManager.addTask(task);
               
        taskManager.markTaskAsComplete(-1);
        // check error is thrown
        String expectedOutput = "Invalid task index.";
        String actualOutput = outputStreamCaptor.toString().stripTrailing();
        Assert.assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    public void testCompleteTaskWithIndexZero() {
        Task task = new Task("Sample Task", "Sample task description", "2024/10/10", "Low");
        taskManager.addTask(task);
        
        taskManager.markTaskAsComplete(0);
               
        // check task updated
        String expectedOutput = "Task marked as complete.";
        String actualOutput = outputStreamCaptor.toString().stripTrailing();
        Assert.assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    public void testCompleteTaskWithInvalidValidIndexSize() {
        Task task1 = new Task("Sample Task1", "Sample task description", "2024/10/10", "Low");
        Task task2 = new Task("Sample Task2", "Sample task description", "2024/10/10", "Low");

        taskManager.addTask(task1);
        taskManager.addTask(task2);
        
        taskManager.markTaskAsComplete(2);
               
        // check task updated
        String expectedOutput = "Invalid task index.";
        String actualOutput = outputStreamCaptor.toString().stripTrailing();
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testDeleteTaskWithIndexLessThanZero() {
        Task task = new Task("Sample Task", "Sample task description", "2024/10/10", "Low");
        taskManager.addTask(task);
               
        taskManager.deleteTask(-1);
        // check error is thrown
        String expectedOutput = "Invalid task index.";
        String actualOutput = outputStreamCaptor.toString().stripTrailing();
        Assert.assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    public void testDeleteTaskWithIndexZero() {
        Task task = new Task("Sample Task", "Sample task description", "2024/10/10", "Low");
        taskManager.addTask(task);
        
        taskManager.deleteTask(0);
               
        // check task updated
        String expectedOutput = "Task deleted successfully.";
        String actualOutput = outputStreamCaptor.toString().stripTrailing();
        Assert.assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    public void testDeleteTaskWithInvalidValidIndexSize() {
        Task task1 = new Task("Sample Task1", "Sample task description", "2024/10/10", "Low");
        Task task2 = new Task("Sample Task2", "Sample task description", "2024/10/10", "Low");

        taskManager.addTask(task1);
        taskManager.addTask(task2);
        
        taskManager.deleteTask(2);
               
        // check task updated
        String expectedOutput = "Invalid task index.";
        String actualOutput = outputStreamCaptor.toString().stripTrailing();
        Assert.assertEquals(expectedOutput, actualOutput);
    }

}
