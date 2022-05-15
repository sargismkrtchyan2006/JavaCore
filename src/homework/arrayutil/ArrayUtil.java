package homework.arrayutil;

import java.util.EnumSet;

public class ArrayUtil {


    public static void main(String[] args) {

//        int[] nums = new int[]{1, 45, 3, 4, 5, 6, 9, 5, 8, 91};
//        int min = nums[0];
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] < min)
//                min = nums[i];
//        }
//        System.out.println(min);


//        int[] nums = {1, 45, 3, 4, 5, 6, 9, 5, 8, 91,};
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i] + " ");
//        }
        int[] nums = {1, 45, 3, 4, 5, 6, 9, 64, 8, 91};
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;


            }

        }
        System.out.print(count);
    }

}



