import java.util.HashSet;
import java.util.Set;

/**
 * @Auther: songyunfeng
 * @Date: 2018/12/31 14:45
 * @Description:
 */
public class Solution {
  private int lo , maxLen;
  public String longestPalindrome(String s){
      int len  = s.length();
      if (len < 2) {
          return s;
      }
      for (int i = 0; i < len - 1; i++) {
          expendPalindrome(s, i, i);
          expendPalindrome(s, i, i + 1);
      }
      return s.substring(lo , lo + maxLen);
  }

    private void expendPalindrome(String s, int j, int k) {
      while(j >=0 && k < s.length() && s.charAt(j) == s.charAt(k) ){
          j--;
          k++;
      }
          if (maxLen < k - j - 1){
              lo = j + 1;
              maxLen = k - j - 1;
          }
    }
}
