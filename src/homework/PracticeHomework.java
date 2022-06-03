package homework;

public class PracticeHomework {
    long convert(int minutes, int seconds) {
        return (minutes * seconds);

    }

    int calcage(int years, int day) {
        return (years * day);
    }

    int nextnumber(int number) {
        int nextnumber = number + 1;
        return (nextnumber);
    }

    boolean isSameNum(int a, int b) {
        if (a == b) {
            return (true);
        } else {
            return (false);
        }
    }

    boolean lessThanOrEqualToZero(int number) {
        if (number <= 0) {
            return (true);
        } else {
            return (false);
        }
    }



}
