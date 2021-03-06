package students;

public class StudentStorage {
    private Student[] array = new Student[10];
    private int size = 0;

    void add(Student student) {
        if (size == array.length) {
            increaseArray();
        }
        array[size++] = student;

    }

    private void increaseArray() {
        Student[] temp = new Student[array.length + 10];
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

    public int getSize() {
        return size;
    }


    public void delete(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                array[index] = array[index + 1];
            }
            size--;
            System.out.println("student deleted");
        } else {
            System.out.println("Index out of bounds");
        }
    }

    public void printStudentbyLesson(String lessonName) {
        for (int i = 0; i < size; i++) {
            if (array[i].getLesson().equals(lessonName)) {
                System.out.println(array[i]);
            }

        }
    }

    public Student getStudentByIndex(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        }
        return null;
    }


}




