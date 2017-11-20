package book.veiw;

interface IMainMenu {
     static void menu() {
        System.out.println("1) To find books with input author's name;");
        System.out.println("2) List of books by the input publisher;");
        System.out.println("3) Books after input year;");
        System.out.println("4) Sort list by publisher;");
        System.out.println("5) Print all books;");
        System.out.println("0) Exit");
        System.out.print("Input one of the following keys> ");
    }
}
