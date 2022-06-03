package homework.arrayutil;

import java.util.Arrays;

public class ArraySortDemo {
    public static void main(String[] args) {
        int[] nums = {14, 65, 84, 12, 34, 79, 56,};
        ArraySort arraySort = new ArraySort();
        System.out.println("growth=" + Arrays.toString(arraySort.growth(nums)));
        System.out.println("decrase=" + Arrays.toString(arraySort.decrase(nums)));
    }
}


