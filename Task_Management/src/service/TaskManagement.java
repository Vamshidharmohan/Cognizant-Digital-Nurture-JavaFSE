package service;

import model.Task;

public class TaskManagement {

    private Task head;

    // Add Task
    public void addTask(Task task) {

        if (head == null) {
            head = task;
        } else {

            Task temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = task;
        }

        System.out.println("Task Added Successfully.");
    }

    // Display Tasks
    public void displayTasks() {

        Task temp = head;

        while (temp != null) {

            System.out.println(temp);

            temp = temp.next;
        }

    }

    // Search Task
    public Task searchTask(int id) {

        Task temp = head;

        while (temp != null) {

            if (temp.getTaskId() == id) {

                return temp;

            }

            temp = temp.next;

        }

        return null;

    }

    // Delete Task
    public void deleteTask(int id) {

        if (head == null)
            return;

        if (head.getTaskId() == id) {

            head = head.next;

            System.out.println("Task Deleted.");

            return;
        }

        Task temp = head;

        while (temp.next != null && temp.next.getTaskId() != id) {

            temp = temp.next;

        }

        if (temp.next != null) {

            temp.next = temp.next.next;

            System.out.println("Task Deleted.");

        } else {

            System.out.println("Task Not Found.");

        }

    }

}