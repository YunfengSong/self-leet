/**
 * @Auther: songyunfeng
 * @Date: 2019/1/7 15:42
 * @Description:
 */
class Solution {
    public int strStr(String haystack, String needle) {

        if (haystack == null || needle == null)
            return -1;
        char[] cn = needle.toCharArray(); if (cn.length == 0)
            return 0;
        char[] ch = haystack.toCharArray();
        for (int i = 0; i < ch.length - cn.length ; ++i) {
            for (int j = 0; j < cn.length; ++j) {
                if (ch[i + j] != cn[j])
                    break;
                else if (j == cn.length - 1)
                return i;
            }
        }
        return -1;
    }
}