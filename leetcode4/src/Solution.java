import java.util.Arrays;

/**
 * @Auther: songyunfeng
 * @Date: 2018/12/30 15:11
 * @Description:
 */
//public class Solution {
//
////我先试试//
//    public double findMedianSortedArrays(int[] nums1,int[] nums2){
//
//        int m =nums1.length,n=nums2.length;
//        int l = (m + n + 1) >> 1;
//        int r = (m + n + 2) >> 1;
//        return (getkth(nums1, 0, nums2, 0, l) + getkth(nums1, 0, nums2, 0, r)) / 2.0;
//    }
//
//    public double getkth(int[] A, int aStart, int[] B, int bStart, int k) {
//        if (aStart == A.length) return B[bStart + k - 1];
//        if (aStart == B.length) return A[bStart + k - 1];
//        if (k == 1 ) return Math.min(A[aStart],B[bStart]);
//
//        int
//
//    }
//}
/*
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int l = (m + n + 1) >> 1;
        int r = (m + n + 2) >> 1;
        return (getkth(nums1, 0, nums2, 0, l) + getkth(nums1, 0, nums2, 0, r)) / 2.0;
    }

    public double getkth(int[] A, int aStart, int[] B, int bStart, int k) {
        if (aStart == A.length) return B[bStart + k - 1];
        if (bStart == B.length) return A[aStart + k - 1];
        if (k == 1) return Math.min(A[aStart], B[bStart]);

        int aMid = Integer.MAX_VALUE, bMid = Integer.MAX_VALUE;
        if (aStart + k/2 - 1 < A.length) aMid = A[aStart + k/2 - 1];
        if (bStart + k/2 - 1 < B.length) bMid = B[bStart + k/2 - 1];

        if (aMid < bMid)
            return getkth(A, aStart + k/2, B, bStart, k - k/2);
        else
            return getkth(A, aStart, B, bStart + k/2, k - k/2);
    }
}*/
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] nums = new int[nums1.length+nums2.length];

        for(int x=0;x<nums1.length;x++){
            nums[x] = nums1[x];
        }
        for(int y=0;y<nums2.length;y++){
            nums[nums1.length+y]=nums2[y];
        }


        Arrays.sort(nums);

        int mid = nums.length/2;

        if (nums.length%2 == 1)
            return (double)nums[mid+1];
        else
            return  (double)(nums[mid]+nums[mid+1])/2;
    }
}
