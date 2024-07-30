package libraray;

import java.util.Arrays;

public class LibraryManagement {

    // Linear Search
    public static int linearSearch(Book[] books, String title) {
        if (books == null || title == null) return -1;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getTitle().equals(title)) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search
    public static int binarySearch(Book[] books, String title) {
        if (books == null || title == null) return -1;
        // Ensure the array is sorted by title before binary search
        Arrays.sort(books, (b1, b2) -> b1.getTitle().compareTo(b2.getTitle()));

        int left = 0;
        int right = books.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (books[mid] != null && books[mid].getTitle().equals(title)) {
                return mid;
            } else if (books[mid] != null && books[mid].getTitle().compareTo(title) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}

