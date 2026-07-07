package main;

import model.Order;
import service.SortingService;

public class Main {

    public static void main(String[] args) {

        Order[] bubbleOrders = {
                new Order(101, "Alice", 4500),
                new Order(102, "Bob", 1200),
                new Order(103, "Charlie", 8500),
                new Order(104, "David", 3000),
                new Order(105, "Eva", 6700)
        };

        System.out.println("===== Bubble Sort =====");

        SortingService.bubbleSort(bubbleOrders);

        for (Order order : bubbleOrders) {
            System.out.println(order);
        }

        System.out.println();

        Order[] quickOrders = {
                new Order(101, "Alice", 4500),
                new Order(102, "Bob", 1200),
                new Order(103, "Charlie", 8500),
                new Order(104, "David", 3000),
                new Order(105, "Eva", 6700)
        };

        System.out.println("===== Quick Sort =====");

        SortingService.quickSort(quickOrders, 0, quickOrders.length - 1);

        for (Order order : quickOrders) {
            System.out.println(order);
        }

    }

}