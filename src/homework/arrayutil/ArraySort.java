package homework.arrayutil;

public class ArraySort {
    public static void main(String[] args) {
        int[] nums = {43, 55, 5, -9, 0, 12, 7, 65};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = tmp;
                }
            }
        }
        for (int x : nums) {
            System.out.print(x + " ");
        }
    }
}



