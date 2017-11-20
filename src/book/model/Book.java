package book.model;


public class Book {
    private String name;
    private String author;
    private String publisher;
    private int year;
    private int amountOfPages;
    private double price;

    public Book(String name, String author, String publisher, int year, int amountOfPages, double price) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.amountOfPages = amountOfPages;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }
}
