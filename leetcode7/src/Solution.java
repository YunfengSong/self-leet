/**
 * @Auther: songyunfeng
 * @Date: 2018/12/31 15:28
 * @Description:
 */
public class Solution {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int tile = x % 10;
            int newresult = result * 10 + tile;
            if ((newresult - tile)/10 != result)
                return  0 ;
            result = newresult;
            x = x /10;
        }
        return result;
    }

}
