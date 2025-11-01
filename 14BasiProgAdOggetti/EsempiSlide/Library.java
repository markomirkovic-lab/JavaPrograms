import java.util.Arrays;

class ISBN {
    int[] code = new int[5];

    ISBN(int[] code) {
        this.code = code;
    }
}

class Person {
    String firstName;
    String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

class Book {
    ISBN isbn;
    Person author;
    String title;
    int numPages = -1;

    Book(ISBN isbn, Person author, String title, int numPages) {
        this.isbn = isbn;
        this.author = author;
        this.title = title;
        this.numPages = numPages;
    }
}

public class Library {

    private static void showBook(Book book) {
        System.out.println(book.title + ", " + book.author.firstName + " " + book.author.lastName);
        System.out.println("ISBN: " + Arrays.toString(book.isbn.code));
        System.out.println(book.numPages + " pages");
    }

    public static void main(String[] args) {
        
        ISBN isbn = new ISBN(new int[] { 971, 881, 137, 96, 76 });
        Person author = new Person("Alexandre", "Dumas");
        Book book = new Book(isbn, author, "Il conte di Montecristo", 1538);
        showBook(book);
    }
}
