/**
 * @Auther: songyunfeng
 * @Date: 2019/1/1 15:48
 * @Description:
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs==null||strs.length==0) return "";
        String res = strs[0];

        for (int i = 1 ; i < strs.length ; i++){
            if (strs[i].indexOf(res) != 0){
                res=res.substring(0,res.length()-1);
                while(strs[i].indexOf(res) != 0)
                    res=res.substring(0,res.length()-1);

            }

        }
        return res;
    }
}