import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: songyunfeng
 * @Date: 2018/12/30 14:39
 * @Description:
 */
public class Solution {
  //试一下//
    public int lengthOfLogestSubstring(String s ){
        char[] sc = s.toCharArray();
        Map<Character, Integer> cm = new HashMap<Character, Integer>();
        int j = 0 ,maxlen = 0;
        for (int i = 0 ; i < sc.length ; i++){
            char cur = sc[i];
            if (cm.containsKey(cur)){
                maxlen = Math.max(i-j,maxlen);
                j = Math.max(j,cm.get(cur)+1);
            }

        }
        return Math.max(sc.length - j, maxlen);
    }
}
