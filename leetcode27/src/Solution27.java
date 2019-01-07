/**
 * @Auther: songyunfeng
 * @Date: 2019/1/7 15:38
 * @Description:
 */
public class Solution27 {
    public int removeElement(int[] nums, int val) {
        int cur;
        int j = 0;
        for(int i = 0;i < nums.length; ++i) {
            cur = nums[i];
            if(val != cur) {
                nums[j] = cur;
                ++j;
            }
        }
        return j;
    }
}