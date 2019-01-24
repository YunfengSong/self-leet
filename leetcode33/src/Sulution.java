/**
 * @Auther: songyunfeng
 * @Date: 2019/1/24 17:09
 * @Description:
 */
public class Sulution {
    public int search(int[] nums, int target) {
        int l = 0, h = nums.length - 1;
        if (h < 0)
            return -1;
        int n0 = nums[0];
        while (l <= h) {
            int mid = (l + h) >>> 1, m = nums[mid];
            if (target == m)
                return mid;
            else if (m < n0 == target < n0 && target < m || target >= n0 && m < n0)
                h = mid - 1;
            else l = mid + 1;
        }
        return -1;
    }
}