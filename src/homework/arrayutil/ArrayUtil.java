package homework.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 45, 3, 4, 5, 6, 9, 5, 8};
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>max) {
                max= nums[i] ;
            }

        }
        System.out.println(max);
    }
}



