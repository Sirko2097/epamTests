package book.input;


import book.scheme.Book;

public class Input {
    private Book[] books = new Book[7];

    public void addBook(){
        Book book = new Book("Lord of The Rings", "Tolkien" ,"London",
                1945, 1500, 290);
        Book book1 = new Book("Harry Potter" , "Rolling", "London",
                2000, 300, 12.5);
        Book book2 = new Book("Natalka Poltavka", "Kotlyareskyy", "Ukraine",
                1900, 500, 450.6);
        Book book3 = new Book("Tom Sawyer", "Mark Twain", "USA",
                1832, 470, 560.73);
        Book book4 = new Book("1984", "George Orwell", "London",
                1984, 256, 512.8);
        Book book5 = new Book("Children of Gurin","Tolkien", "Yaroslaviv Val",
                2012, 500, 255);
        Book book6 = new Book("Shantaram", "Gregory David Roberts", "Vydavnytstvo Starogo Leva",
                2003, 936, 900);


        books[0] = book;
        books[1] = book1;
        books[2] = book2;
        books[3] = book3;
        books[4] = book4;
        books[5] = book5;
        books[6] = book6;

    }

    public Book[] getBooks() {
        return books;
    }

}
