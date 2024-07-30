package libraray;

public class LibraryManagementTest {
    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"),
            new Book(2, "To Kill a Mockingbird", "Harper Lee"),
            new Book(3, "1984", "George Orwell"),
            new Book(4, "Pride and Prejudice", "Jane Austen")
        };

        System.out.println("Testing Linear Search:");
        int indexLinear = LibraryManagement.linearSearch(books, "1984");
        System.out.println(indexLinear != -1 ? "Found: " + books[indexLinear] : "Not Found");

        System.out.println("\nTesting Binary Search:");
        int indexBinary = LibraryManagement.binarySearch(books, "Pride and Prejudice");
        System.out.println(indexBinary != -1 ? "Found: " + books[indexBinary] : "Not Found");
    }
}

