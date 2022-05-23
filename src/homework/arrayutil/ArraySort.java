package homework.arrayutil;

public class ArraySort {
    public static void main(String[] args) {
        int[] nums = {43, 55, 5, -9, 0, 12, 5, 65};
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.print("ըստ աճման կարգի։");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}



