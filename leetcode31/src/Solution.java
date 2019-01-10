public class Solution {
    public void nextPermutation(int[] nums) {
        int i;
        for (i = nums.length - 1; i > 0; --i) {
            if (nums[i] > nums[i - 1]) {
                break;
            }
        }
        if (i > 0) {
            for (int j = nums.length - 1; j >= i; --j) {
                if (nums[j] > nums[i - 1]) {
                    swap(nums, j, i - 1);
                    break;
                }
            }
        }
        reverse(nums, i, nums.length - 1);
    }

    private static void swap(int[] nums, int i, int j) { int temp = nums[i];
        nums[i] = nums[j]; nums[j] = temp;
    }
    private static void reverse(int[] nums, int i, int j) { while (i < j) {
        swap(nums, i++, j--);
    } }
}