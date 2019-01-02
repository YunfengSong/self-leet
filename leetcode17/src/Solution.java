import java.util.*;

/**
 * @Auther: songyunfeng
 * @Date: 2019/1/2 15:24
 * @Description:
 */
public class Solution {
    public List<String> letterCombinations(String digits) {
        Map<String, List<String>> digitalMap = new HashMap<String, List<String>>();
        digitalMap.put("2",
                new ArrayList<String>(Arrays.asList("a", "b", "c")));
        digitalMap.put("3",
                new ArrayList<String>(Arrays.asList("d", "e", "f")));
        digitalMap.put("4",
                new ArrayList<String>(Arrays.asList("g", "h", "i")));
        digitalMap.put("5",
                new ArrayList<String>(Arrays.asList("j", "k", "l")));
        digitalMap.put("6",
                new ArrayList<String>(Arrays.asList("m", "n", "o")));
        digitalMap.put("7",
                new ArrayList<String>(Arrays.asList("p", "q", "r", "s")));
        digitalMap.put("8",
                new ArrayList<String>(Arrays.asList("t", "u", "v")));
        digitalMap.put("9",
                new ArrayList<String>(Arrays.asList("w", "x", "y", "z")));
        List<String> resultList = new ArrayList<String>();
        getLetterCombinations(digits.toCharArray(), new StringBuilder(), 0,
                digitalMap, resultList);
        return resultList;
    }
    private static void getLetterCombinations(char[] c, StringBuilder sbSoFar,
                                              int curP, Map<String, List<String>> digitalMap,
                                              List<String> resultList) {
        if (curP == c.length) {
            if (sbSoFar.length() > 0)
                resultList.add(sbSoFar.toString());
            return;
        }
        char cur = c[curP];
        for (String letter : digitalMap.get(String.valueOf(cur))) {
            StringBuilder sb = new StringBuilder();
            sb.append(sbSoFar);
            sb.append(letter);
            getLetterCombinations(c, sb, curP + 1, digitalMap, resultList);
        }
    }
}