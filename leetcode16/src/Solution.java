import java.util.Arrays;

/**
 * @Auther: songyunfeng
 * @Date: 2019/1/2 15:16
 * @Description:
 */
public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = Integer.MAX_VALUE;
        int i = 0;
        while(i < nums.length - 2) {
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if(closest == Integer.MAX_VALUE
                        || Math.abs(closest - target) > Math.abs(sum - target)) {
                    closest = sum;
                }

                if(sum == target) return sum;
                if(sum <= target) while(nums[j] == nums[++j] && j < k);
                if(sum >= target) while(nums[k--] == nums[k] && j < k);
            }
            while(nums[i] == nums[++i] && i < nums.length - 2);
        }
        return closest;
    }
}