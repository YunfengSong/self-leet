import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @Auther: songyunfeng
 * @Date: 2019/1/2 16:59
 * @Description:
 */
public class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> pM = new HashMap<Character, Character>();
        pM.put('(', ')');
        pM.put('{', '}');
        pM.put('[', ']');
        Stack<Character> pS = new Stack<Character>();
        for(Character c: s.toCharArray()) {
            if(pM.containsKey(c)) {
                pS.push(pM.get(c));
            } else {
                if(pS.isEmpty() || c != pS.pop())
                    return false;
            }
        }
        if(!pS.isEmpty())
            return false;
        return true;
    }
}