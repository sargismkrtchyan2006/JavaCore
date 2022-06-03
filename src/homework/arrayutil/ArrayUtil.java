package homework.arrayutil;

public class ArrayUtil {
    void allelements(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    int max(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];

        }
        return max;
    }

    int min(int[] nums) {
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min)
                min = nums[i];
        }
        return min;
    }

    void pair(int[] numss) {
        for (int i = 0; i < numss.length; i++) {
            if (numss[i] % 2 == 0) {
                System.out.print(numss[i] + " ");
            }
        }

    }

    void odd(int[] numss) {
        for (int i = 0; i < numss.length; i++) {
            if (numss[i] % 2 != 0) {
                System.out.print(numss[i] + " ");
            }
        }


    }

    int countpair(int[] nums) {
        int countpair = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                countpair++;
            }

        }
        return countpair;
    }

    int countodd(int[] nums) {
        int countodd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                countodd++;
            }
        }
        return countodd;
    }


    int sum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

}

