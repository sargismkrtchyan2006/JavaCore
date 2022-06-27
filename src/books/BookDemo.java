package books;

import students.Student;

import java.util.Scanner;

public class BookDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("please input 0 for exit");
            System.out.println("please input 1 for add book");
            System.out.println("please input 2 for print all books");
            System.out.println("please input 3 for print books by authorName");
            System.out.println("please input 4 for print books by genre");
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case 0:
                    run = false;
                    break;
                case 1:
                    addbook();
                    break;
                case 2:
                    bookStorage.print();
                    break;
                case 3:
                    System.out.println(bookStorage.getSize());
                    break;
                case 4:
                    searchBookBygenre();
                    break;
                default:
                    System.out.println("invalid command,please try again");
            }
        }

    }

    private static void searchBookBygenre() {
        System.out.println("please input genre name");
        String genre = scanner.nextLine();
        bookStorage.searchBookbyGenre(genre);
    }


    private static void addbook() {
        System.out.println("please input book title ");
        String title = scanner.nextLine();
        System.out.println("please input book authorName");
        String authorName = scanner.nextLine();
        System.out.println("please input book price ");
        String priceStr = scanner.nextLine();
        System.out.println("please input book count");
        String countStr = scanner.nextLine();
        System.out.println("please input book genre");
        String genre = scanner.nextLine();

        int count = Integer.parseInt(countStr);
        double price = Integer.parseInt(priceStr);
        Book book = new Book(title, authorName, price, count, genre);
        bookStorage.add(book);
        System.out.println("Thank you, book added");
    }
}
