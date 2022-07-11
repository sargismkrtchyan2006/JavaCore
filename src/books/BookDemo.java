package books;

import books.commandbook.CommandBook;
import books.model.Author;
import books.model.Book;

import books.model.User;
import books.model.UserType;
import books.storage.AuthorStorage;
import books.storage.BookStorage;
import books.storage.UserStorage;


import java.util.Scanner;

public class BookDemo implements CommandBook {
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();
    private static AuthorStorage authorStorage = new AuthorStorage();
    private static UserStorage userStorage = new UserStorage();
    private static User currentUser = null;

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            CommandBook.printLoginCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case LOGIN:
                    login();
                    break;
                case REGISTER:
                    register();
                    break;
                default:
                    System.out.println("invalid command,please try again");
            }
        }
    }

    private static void login() {
        System.out.println("please input email,password");
        String emailPasswordStr = scanner.nextLine();
        String[] emailPassword = emailPasswordStr.split(",");
        User user = userStorage.getUserByEmail(emailPassword[0]);
        if (user == null) {
            System.out.println("User with " + emailPassword[0] + " does not exists!");
        } else {
            if (user.getPassword().equals(emailPassword[1])) {
                currentUser = user;
                if (user.getUserType() == UserType.ADMIN) {
                    loginAdmin();
                } else if (user.getUserType() == UserType.USER) {
                    loginUser();
                }
            } else {
                System.out.println("Password is wrong!");
            }
        }


    }

    private static void loginUser() {
        System.out.println("Welcome" + currentUser.getName());
        boolean run = true;
        while (run) {
            CommandBook.printUserCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_BOOK:
                    addbook();
                    break;
                case PRINT_ALL_BOOKS:
                    userStorage.print();
                    break;
                case PRINT_BOOKS_BY_AUTHORNAME:
                    System.out.println(bookStorage.getSize());
                    break;
                case PRINT_BOOK_COUNT:
                    System.out.println("books count:" + bookStorage.getSize());
                    break;
                case PRINT_ALL_AUTHOR:
                    authorStorage.print();
                default:
                    System.out.println("invalid command");
            }
        }
    }

    private static void register() {
        System.out.println("please input name,surname,email,password");
        String userDataStr = scanner.nextLine();
        String[] userData = userDataStr.split(",");
        if (userData.length < 4) {
            System.out.println("please input correct data");
        } else {
            if (userStorage.getUserByEmail(userData[0]) == null) {
                User user = new User();
                user.setName(userData[0]);
                user.setSurname(userData[1]);
                user.setEmail(userData[2]);
                user.setPassword(userData[3]);
                user.setUserType(UserType.USER);
                userStorage.add(user);
                System.out.println("User created!");
            } else {
                System.out.println("User with" + userData[0] + "already exist");
            }
        }


    }

    private static void loginAdmin() {
        System.out.println("Welcome" + currentUser.getName());
        boolean run = true;
        while (run) {
            CommandBook.printAdminCommands();
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
                Book book = new Book(title, author, price, count, genre, currentUser);
                bookStorage.add(book);
                System.out.println("Thank you, book added");
            }

        }


    }

}
