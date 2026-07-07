package main;

import java.util.Arrays;
import java.util.Comparator;

import model.Product;
import service.SearchService;

public class Main {

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Shoes", "Fashion"),
                new Product(103, "Keyboard", "Electronics"),
                new Product(104, "Mobile", "Electronics"),
                new Product(105, "Watch", "Accessories")
        };

        // Linear Search

        System.out.println("===== Linear Search =====");

        Product result1 = SearchService.linearSearch(products, "Keyboard");

        if (result1 != null)
            System.out.println(result1);
        else
            System.out.println("Product Not Found");


        // Sort Array before Binary Search

        Arrays.sort(products,
                Comparator.comparing(Product::getProductName));

        System.out.println();

        System.out.println("===== Binary Search =====");

        Product result2 = SearchService.binarySearch(products, "Keyboard");

        if (result2 != null)
            System.out.println(result2);
        else
            System.out.println("Product Not Found");

    }

}