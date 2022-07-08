package books.commandbook;

public interface CommandBook {
    int EXIT = 0;
    int ADD_BOOK = 1;
    int PRINT_ALL_BOOKS = 2;
    int PRINT_BOOKS_BY_AUTHORNAME = 3;
    int PRINT_BOOK_BY_GENRE = 4;
    int ADD_AUTHOR = 5;

    static void printCommandsBook() {
        System.out.println("please input " + EXIT + " for exit");
        System.out.println("please input " + ADD_BOOK + " for add book");
        System.out.println("please input " + PRINT_ALL_BOOKS + " for print all books");
        System.out.println("please input " + PRINT_BOOKS_BY_AUTHORNAME + " for print books by authorname");
        System.out.println("please input " + PRINT_BOOK_BY_GENRE + " for print book by genre");
        System.out.println("please input " + ADD_AUTHOR + " for add author");
    }
}
