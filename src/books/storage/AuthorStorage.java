package books.storage;

import books.model.Author;
import books.model.Book;
import students.model.Lesson;

public class AuthorStorage {
    private Author[] array = new Author[10];
    private int size = 0;

    public void add(Author author) {
        if (size == array.length) {
            increaseArray();
        }
        array[size++] = author;

    }

    private void increaseArray() {
        Author[] temp = new Author[array.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + "." + array[i] + " ");
        }
    }


    public int getSize() {

        return size;
    }
    public void delete(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                array[index] = array[index + 1];
            }
            size--;
            System.out.println("author deleted");
        } else {
            System.out.println("Index out of bounds");
        }
    }
    public Author getAuthorByIndex(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        }
        return null;
    }

}
