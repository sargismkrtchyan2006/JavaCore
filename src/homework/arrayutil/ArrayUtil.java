package homework.arrayutil;

import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

import java.util.EnumSet;

public class ArrayUtil {


    public static void main(String[] args) {
//        int[] nums = {5, 84, 68, 22, 96, 46, 69, 12, 99, 45};
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i] + " ");
//        }
//        int[]nums={9,47,65,2,8,64,94,2,86,4};
//        int max=nums[0];
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i]>max){
//                max=nums[i];
//            }
//
//        }
//        System.out.println(max);
//        int[]nums={5,9,4,68,32,6,8,2,64,69};
//        int min=nums[0];
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i]<min){
//                min=nums[i];
//            }
//        }
//        System.out.println(min);
//        int[] nums = {8, 67, 45, 97, 62, 51, 44, 6, 4, 78};
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] % 2 == 0) {
//                System.out.print(nums[i]);
//                System.out.print(" ");
//
//            }
//        }
//        int[] nums = {5, 78, 94, 65, 7, 12, 459, 2, 6, 1};
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] % 2 == 1) {
//                System.out.print(nums[i]);
//                System.out.print(" ");
//            }
//        }
//        int[] nums = {9, 7, 8, 4, 56, 7, 41, 57, 2, 81,};
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] % 2 == 0) {
//                count++;
//            }
//        }
//        System.out.println(count);
//        int[] nums = {4, 8, 68, 6, 95, 46, 31, 28, 73, 19};
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] % 2 == 1) {
//                count++;
//            }
//        }
//        System.out.println(count);
        int[] nums = {5, 61, 70};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = nums[i] += 66;


        }
        System.out.println(sum);
    }
}


