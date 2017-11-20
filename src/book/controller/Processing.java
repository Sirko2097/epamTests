package book.controller;


import book.input.Input;
import book.model.Book;
import book.service.BooksComparator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Processing {
    private Book[] bookList = new Book[7];

    {
        go();
    }

    private void go() {
        Input input = new Input();
        input.addBook();
        bookList = input.getBookList();
    }



    private void print(Book elem) {
        System.out.println();
        System.out.println(elem.getName());
        System.out.println(elem.getAuthor());
        System.out.println(elem.getPublisher());
        System.out.println(elem.getYear());
        System.out.println(elem.getAmountOfPages());
        System.out.println(elem.getPrice());
        System.out.println();
    }

    public void printSameAuthor() {

        String userAuthor = null;

        System.out.print("Whom do you want to find? Input name: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            userAuthor = reader.readLine();
        } catch (IOException e){
            e.printStackTrace();
        }

        for (Book elem : bookList) {
            try {
                if (userAuthor.equals(elem.getAuthor())) {
                    print(elem);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        System.out.println();
    } //close prSameAuth()

    public void printSamePublisher() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input publisher: ");
        String publish = null;

        try {
            publish = reader.readLine();
        } catch (Exception ex){
            ex.printStackTrace();
        }

        for (Book elem : bookList) {
            if (elem.getPublisher().equals(publish)){
                print(elem);
            }
        }

    } //close prSamePub()


    public void printAfterTheYear(){
        int year = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.print("Input year: ");

            try {
                year = Integer.parseInt(reader.readLine());
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            if (year < 0 || year > 2017){
                System.err.println("Invalid input!");
            }

        } while (year > 0 & year > 2017);

        for (Book elem : bookList) {
            if (year < elem.getYear()) {
                print(elem);
            }
        }
    } //close prYear()

    public void printSortedByPublisher() {

        Arrays.sort(bookList, new BooksComparator());

        for (Book elem : bookList) {
            print(elem);
        }
    }

    public void printAll(){
        for (Book elem : bookList) {
            print(elem);
        }
    }

} //close class