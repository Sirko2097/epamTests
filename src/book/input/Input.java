package book.input;


import book.model.Book;

public class Input {
    private Book[] bookList = new Book[7];

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


        bookList[0] = book;
        bookList[1] = book1;
        bookList[2] = book2;
        bookList[3] = book3;
        bookList[4] = book4;
        bookList[5] = book5;
        bookList[6] = book6;

    }

    public Book[] getBookList() {
        return bookList;
    }

}
