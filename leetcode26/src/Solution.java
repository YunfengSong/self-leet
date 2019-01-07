public class Solution {
    public int removeDuplicates(int[] nums) {
        int res=1;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]-nums[i+1]!=0) {
                nums[res]=nums[i+1];
                res++;
            }
        }
        return res;
    }
}