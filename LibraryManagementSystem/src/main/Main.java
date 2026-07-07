package main;

import java.util.Arrays;
import java.util.Comparator;

import model.Book;
import service.SearchService;

public class Main {

    public static void main(String[] args) {

        Book[] books = {
                new Book(101, "C Programming", "Dennis Ritchie"),
                new Book(102, "Data Structures", "Mark Allen"),
                new Book(103, "Java Programming", "James Gosling"),
                new Book(104, "Operating Systems", "Galvin"),
                new Book(105, "Python", "Guido")
        };

        System.out.println("===== Linear Search =====");

        Book book = SearchService.linearSearch(books, "Java Programming");

        if (book != null)
            System.out.println(book);
        else
            System.out.println("Book Not Found");

        Arrays.sort(books, Comparator.comparing(Book::getTitle));

        System.out.println();

        System.out.println("===== Binary Search =====");

        Book result = SearchService.binarySearch(books, "Java Programming");

        if (result != null)
            System.out.println(result);
        else
            System.out.println("Book Not Found");

    }

}