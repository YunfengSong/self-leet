import java.util.Arrays;

/**
 * @Auther: songyunfeng
 * @Date: 2018/12/31 16:19
 * @Description:
 */
public class Solution {
    public boolean isPalindrome(int x) {
        if( x < 0 || (x != 0 && x % 10==0 ))return false;

        int rev = 0;


        while(rev > x){
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        return (x==rev || x == rev / 10);

    }
}
