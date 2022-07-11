package books.commandbook;

public interface CommandBook {
    int LOGOUT = 0;
    int ADD_BOOK = 1;
    int PRINT_ALL_BOOKS = 2;
    int PRINT_BOOKS_BY_AUTHORNAME = 3;
    int PRINT_BOOK_COUNT = 4;
    int PRINT_ALL_AUTHOR = 5;

    int EXIT = 0;
    int LOGIN = 1;
    int REGISTER = 2;

    static void printAdminCommands() {
        System.out.println("please input " + LOGOUT + " for logout");
        System.out.println("please input " + ADD_BOOK + " for add book");
        System.out.println("please input " + PRINT_ALL_BOOKS + " for print all books");
        System.out.println("please input " + PRINT_BOOKS_BY_AUTHORNAME + " for print books by authorname");
        System.out.println("please input " + PRINT_BOOK_COUNT + " for print book count");
        System.out.println("please input " + PRINT_ALL_AUTHOR + " for print all author");


    }

    static void printUserCommands() {
        System.out.println("please input " + EXIT + " for logout");
        System.out.println("please input " + ADD_BOOK + " for add book");
        System.out.println("please input " + PRINT_ALL_BOOKS + " for print all books");
        System.out.println("please input " + PRINT_BOOKS_BY_AUTHORNAME + " for print books by authorname");
        System.out.println("please input " + PRINT_BOOK_COUNT + " for print book count");
        System.out.println("please input " + PRINT_ALL_AUTHOR + " for print all author");

    }

    static void printLoginCommands() {
        System.out.println("please input " + EXIT + " for exit");
        System.out.println("please input " + LOGIN + " for login");
        System.out.println("please input " + REGISTER + " for register");
    }
}
