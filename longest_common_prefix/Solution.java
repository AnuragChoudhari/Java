package longest_common_prefix;

import java.util.*;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        
        String common = "";
        for(int i=0;i<strs[i].length();i++){
            for(int j=0;j<strs[j].length();j++){
                if(strs[i].charAt(i) == strs[j].charAt(j)){
                    common = common + strs[i].charAt(i);
                }
            }
        }
        System.out.println(common);

        return "hello";
    }
}

class Main{
    public static void main(String[] args) {
        Solution sl = new Solution();
        String[] words = {"flower", "flow", "flight"};
        System.out.println(words);
        sl.longestCommonPrefix(words);
    }
}