package homework;

public class PracticeHomework {
    long convert(int minutes) {
        return (minutes * 60);

    }

    int calcage(int years) {
        return (years * 365);
    }

    int nextnumber(int number) {
        return (++number);
    }

    boolean isSameNum(int a, int b) {
        return a == b;
    }

    boolean lessThanOrEqualToZero(int number) {
        return number <= 0;
    }

    boolean reverseboolean(boolean value) {
        return !value;
    }

    int maxlength(int[] array1, int[] array2) {
        int array1length = array1.length;
        int array2length = array2.length;
        return array1.length > array2.length ? array1.length : array2.length;
    }
}
