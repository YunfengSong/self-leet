import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: songyunfeng
 * @Date: 2018/12/30 14:15
 * @Description:
 */
//public class Solution {
//    public int[] twoSum(int[] nums , int target ){
//        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//        for (int i = 0 ; i < nums.length ; ++ i ){
//            int num  = target - nums[i];
//            if (map.containsKey(num))
//                return new int[]{map.get(num),i};
//            map.put(nums[i],i);
//        }
//        throw new RuntimeException("no answer!");
//    }
//
//}
public class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; ++i) {
            int cur = nums[i];
            sum += cur;
            max = Math.max(max, sum);
            if (sum < 0) {
                sum = 0;
                continue;
            }
        }
        return max;
    }
}
/*
public class Solution {
    public ArrayContext getArrayContext(int[] nums, int l, int r) {
        ArrayContext ctx = new ArrayContext();
        if (l == r) {
            ctx.max = nums[l];
            ctx.lMax = nums[l];
            ctx.rMax = nums[l];
            ctx.sum = nums[l];
        } else {
            int m = (l + r) / 2;
            ArrayContext lCtx = getArrayContext(nums, l, m);
            ArrayContext rCtx = getArrayContext(nums, m + 1, r);
            ctx.max = Math.max(Math.max(lCtx.max, rCtx.max),
                    lCtx.rMax + rCtx.lMax);
            ctx.lMax = Math.max(lCtx.lMax, lCtx.sum + rCtx.lMax);
            ctx.rMax = Math.max(rCtx.rMax, rCtx.sum + lCtx.rMax);
            ctx.sum = lCtx.sum + rCtx.sum;
        }
        return ctx;
    }
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        ArrayContext ctx = getArrayContext(nums, 0, nums.length - 1);
        return ctx.max;
    }
    private class ArrayContext {
        int max;
        int lMax;
        int rMax;
        int sum;
    }
}*/
