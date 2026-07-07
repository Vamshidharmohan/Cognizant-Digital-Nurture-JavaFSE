package main;

import model.Task;
import service.TaskManagement;

public class Main {

    public static void main(String[] args) {

        TaskManagement manager = new TaskManagement();

        manager.addTask(new Task(1, "Design UI", "Pending"));
        manager.addTask(new Task(2, "Write Code", "In Progress"));
        manager.addTask(new Task(3, "Testing", "Pending"));

        System.out.println("\n===== All Tasks =====");

        manager.displayTasks();

        System.out.println("\n===== Search Task =====");

        Task task = manager.searchTask(2);

        if (task != null)

            System.out.println(task);

        else

            System.out.println("Task Not Found");

        System.out.println("\n===== Delete Task =====");

        manager.deleteTask(2);

        System.out.println("\n===== Remaining Tasks =====");

        manager.displayTasks();

    }

}