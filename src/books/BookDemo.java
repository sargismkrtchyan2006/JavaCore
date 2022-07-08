package books;

import books.commandbook.CommandBook;
import books.model.Author;
import books.model.Book;

import books.storage.AuthorStorage;
import books.storage.BookStorage;

import java.util.Scanner;

public class BookDemo implements CommandBook {
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();
    private static AuthorStorage authorStorage = new AuthorStorage();


    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            CommandBook.printCommandsBook();
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_BOOK:
                    addbook();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case PRINT_BOOKS_BY_AUTHORNAME:
                    System.out.println(bookStorage.getSize());
                    break;
                case PRINT_BOOK_BY_GENRE:
                    searchBookBygenre();
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                default:
                    System.out.println("invalid command,please try again");
            }
        }

    }

    private static void addAuthor() {
        System.out.println("please input author name");
        String name = scanner.nextLine();

        System.out.println("please input author surname");
        String surname = scanner.nextLine();

        System.out.println("please input author email");
        String email = scanner.nextLine();

        System.out.println("please input author gender");
        String gender = scanner.nextLine();

        Author author = new Author(name, surname, email, gender);
        authorStorage.add(author);
        System.out.println("Author created");
    }

    private static void searchBookBygenre() {
        System.out.println("please input genre name");
        String genre = scanner.nextLine();
        bookStorage.searchBookbyGenre(genre);
    }


    private static void addbook() {
        if (authorStorage.getSize() == 0) {
            System.out.println("please add author");
            addAuthor();
        } else {
            authorStorage.print();
            System.out.println("please choose author index");
            int authorIndex = Integer.parseInt(scanner.nextLine());
            Author author = authorStorage.getAuthorByIndex(authorIndex);
            if (author == null) {
                System.out.println("please input correct index");
                addbook();
            } else {
                System.out.println("please input book title ");
                String title = scanner.nextLine();
                System.out.println("please input book price ");
                String priceStr = scanner.nextLine();
                System.out.println("please input book count");
                String countStr = scanner.nextLine();
                System.out.println("please input book genre");
                String genre = scanner.nextLine();

                int count = Integer.parseInt(countStr);
                double price = Integer.parseInt(priceStr);
                Book book = new Book(title, author, price, count, genre);
                bookStorage.add(book);
                System.out.println("Thank you, book added");
            }

        }


    }

}
