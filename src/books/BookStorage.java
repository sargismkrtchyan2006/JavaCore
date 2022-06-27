package books;

public class BookStorage {
    private Book[] array = new Book[10];
    private int size = 0;

    void add(Book book) {
        if (size == array.length) {
            increaseArray();
        }
        array[size++] = book;

    }

    private void increaseArray() {
        Book[] temp = new Book[array.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }


    void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + "." + array[i] + " ");
        }
    }

    public void printBookByauthorName(String authorName) {
        for (int i = 0; i < size; i++) {
            if (array[i].getAuthorName().equals(authorName)) {
                System.out.println(array[i]);
            }

        }
    }

    public int getSize() {

        return size;
    }

    public void searchBookbyGenre(String genreName) {
        for (int i = 0; i < size; i++) {
            if (array[i].getGenre().equals(genreName)) {
                System.out.println(array[i]);
            }

        }
    }


}
