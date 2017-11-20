package book.veiw;

import book.input.Input;
import book.controller.Processing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu implements MainMenu {

    public static void printMenu() {
        Input input = new Input();
        input.addBook();
        Processing processing = new Processing();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char key = '0';


        while (true){
            MainMenu.menu();
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


}
