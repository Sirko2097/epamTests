package book.service;


import book.model.Book;

import java.util.Comparator;

public class BooksComparator implements Comparator<Book>{
    @Override
    public int compare(Book firstBook, Book secondBook) {
        return firstBook.getPublisher().compareTo(secondBook.getPublisher());
    }
}
