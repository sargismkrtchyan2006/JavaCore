package homework.arrayutil;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class ArrayUtilDemo {

    public static void main(String[] args) {
        int[] nums = {14, 65, 84, 12, 34, 79, 56, 11};
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.allelements(nums);
        System.out.println();
        System.out.println("max=" + arrayUtil.max(nums));
        System.out.println("min=" + arrayUtil.min(nums));
        arrayUtil.pair(nums);
        System.out.println();
        arrayUtil.odd(nums);
        System.out.println();
        System.out.println("countpair=" + arrayUtil.countpair(nums));
        System.out.println("countodd=" + arrayUtil.countodd(nums));
        System.out.println("sum=" + arrayUtil.sum(nums));

    }
}