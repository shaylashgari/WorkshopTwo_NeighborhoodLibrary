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

        // how would I put in a way to show the books before asking them to choose one

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
        Book book2 = new Book (1, "dwkjd," "Hamlet");
        Book book3 = new Book (2,"mdhgl,""Reading Lolita in Tehran" );
        Book book4 = new Book (3, "asjui,""Body Kindness");
        Book book5 = new Book (4, "lkdgh," "The House on Mango Street");
        Book book6 = new Book (5, "wonks," "Esperanza Rising");
        Book book7 = new Book (6, "spleg," "Sacret Rthms");
        Book book8 = new Book (7, "pslnf," "The Lion Woman of Tehran");
        Book book9 = new Book (8, "aphsb,""Intermezzo");
        Book book10 = new Book (9, "oahdf," "A Court of Thorn and Roses");
        Book book11 = new Book (10, "wkdhg,""Stolen Pride");
        Book book12 = new Book (11, "slyuv,""Charm");
        Book book13 = new Book (12, "dlhmq,""Concerning the Future of Souls");
        Book book14 = new Book (13, "pqsjx,""Rejection");
        Book book15 = new Book (14, "pxjhs,""Taming Scilicon Valley");
        Book book16 = new Book (15, "zakgh,""Be Ready When the Luck Happens");
        Book book17 = new Book (16, "cslfh,""Inside Out");
        Book book18 = new Book (17, "lczmdh,""Life and Death of an American Worker");
        Book book19 = new Book (18, "lmskj,""Our Evenings");
        Book book20 = new Book (19, "popcx,""The Sons of El Ray");
        

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
