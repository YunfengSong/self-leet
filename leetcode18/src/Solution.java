import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: songyunfeng
 * @Date: 2019/1/2 15:29
 * @Description:
 */
public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        return kSum(nums, target, 4, 0, n);
    }
    private static ArrayList<List<Integer>> kSum(int[] nums, int target, int k,
                                                 int index, int len) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        if (index >= len)
            return res;
        int max = nums[nums.length - 1];
        if (k * nums[index] > target || k * max < target)
            return res;
        if (k == 2) {
            int i = index, j = len - 1;
            while (i < j) {
                if (target - nums[i] == nums[j]) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(target - nums[i]);
                    res.add(temp);
                    while (i < j && nums[i] == nums[i + 1])
                        i++;
                    while (i < j && nums[j - 1] == nums[j])
                        j--;
                    i++;
                    j--;
                } else if (target - nums[i] > nums[j])
                    i++;
                else
                    j--;
            }
        } else {
            for (int i = index; i < len - k + 1; i++) {
                ArrayList<List<Integer>> temp = kSum(nums, target - nums[i],
                        k - 1, i + 1, len);
                if (temp != null) {
                    for (List<Integer> t : temp)
                        t.add(0, nums[i]);
                    res.addAll(temp);
                }
                while (i < len - 1 && nums[i] == nums[i + 1])
                    ++i;
            }
        }
        return res;
    }
}