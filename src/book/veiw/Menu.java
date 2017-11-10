package book.veiw;

import book.input.Input;
import book.processing.Processing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

    public static void printMenu() {
        Input input = new Input();
        input.addBook();
        Processing processing = new Processing();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char key = '0';


        while (true){
            menu();
            try {
                key = reader.readLine().charAt(0);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            switch (key){
                case '0':
                    System.exit(0);
                    break;
                case '1':
                    processing.printSameAuthor();
                    break;
                case '2':
                    processing.printSamePublisher();
                    break;
                case '3':
                    processing.printAfterTheYear();
                    break;
                case '4':
                    processing.printSortedByPublisher();
                    break;
                case '5':
                    processing.printAll();
                    break;
                default:
                    System.out.println("Try again");
                    break;
            }

        }
    }

    private static void menu() {
        System.out.println("1) To find books with input author's name;");
        System.out.println("2) List of books by the input publisher;");
        System.out.println("3) Books after input year;");
        System.out.println("4) Sort list by publisher;");
        System.out.println("5) Print all books;");
        System.out.println("0) Exit");
        System.out.print("Input key on of the following keys> ");
    }
}
