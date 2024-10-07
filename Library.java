package com.ps;

// scanner class, import statement
import java.util.Scanner;

public class Library {

    public static void main(String[] args) {

        // scanner initialization
        Scanner inputLibrary = new Scanner(System.in);

        // statement to ask user

        System.out.println("Please select an option below: ");

        System.out.println("1) Show Available Books 2) Show Checked Out Books 3) Exit");

        // read the user input
        int userInput = inputLibrary.nextInt ();

        if (userInput == 1){
            System.out.println("Select which book to check out by book ID:");
            int bookChoice = inputLibrary.nextInt ();
            // when taking in int, use line below to take in user input
            inputLibrary.nextLine ();
            System.out.println("What is your name?");
            String personName = inputLibrary.nextLine ();
            // retrieve object with book choice as the index
            // call the checkout method -

        }


        // instantiate a book object, do it 20 times for 20 books,
        Book book1 = new Book( 0, "hnd23", "Old Man and the Sea");
        Book book2 = new Book (1, "dwkjdj," "Hamlet")

                // create an array
        Book[] books = new Book [20];
    }
    // Method that would show available books
    public static void availableBooks (){
        // for loop for iteration, check if the books are available and prints out


    }
    // Method for checked out books
    public static void checkedOutBooks (){
        // for loop going through array checking to see if boolyan is true, if books are checked out

    }





}
