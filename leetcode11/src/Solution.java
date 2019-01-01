import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Auther: songyunfeng
 * @Date: 2019/1/1 15:21
 * @Description:
 */
public class Solution {
    public int maxArea(int[] height) {
        int maxv = 0;
        int n = Array.getLength(height);
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                int tall = Math.max(height[i], height[j]);
                int low = Math.min(height[i],height[j]);
                maxv = Math.max(maxv,low*(j-i));
            }
        }
        return maxv;
    }
}
