/*
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
}*/
/*public class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;

        if (n == 0) {
            return 0;
        }


        int left = 0, right = n - 1;
        int mid = 0;

        while (left <= right) {
            mid = left + (right - left) / 2;

            if (left == right) {
                if (target <= nums[left]) {
                    return left;
                }
                return right + 1;
            }

            if (target > nums[mid]) {
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else if(target == nums[mid])
                return mid;


        }


        return -1;
    }
}*/

/*
class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int left = 0, right = n - 1;
        int mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;

            if (target > nums[mid]) {
                left = Math.min(mid + 1, right);
            } else if (target < nums[mid]) {
                right = Math.max(mid - 1, left);
            } else {
                return mid;
            }

            if (left == right) {
                if (target <= nums[left]) {
                    return left;
                }
                return right + 1;
            }
        }
        return -1;
    }
}*/
public class Solution {
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i++, j--);
        }
    }

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
}