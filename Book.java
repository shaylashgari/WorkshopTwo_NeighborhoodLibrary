package com.ps;


public class Book {
    // all instance variables
    int id;
    String isbn;
    String title;
    boolean isCheckedOut;
    String checkedOutTo;

    // constructor method
    public Book(int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
        this.checkedOutTo = "";

    }
// click right to get all the getters and setters for all variables
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    // check out method - allows someone to check out the book
    public void checkOut (String name) {
        this.isCheckedOut= true;
        this.checkedOutTo= name;

    }
    // check in method - allows someone to check in borrowed book
    public void checkIn () {
        this.isCheckedOut= false;
        this.checkedOutTo= "";
    }

    //method for printing out object to the screen, right click/generate/ toString()
    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", isCheckedOut=" + isCheckedOut +
                ", checkedOutTo='" + checkedOutTo + '\'' +
                ", id=" + id +
                '}';
    }
}





}