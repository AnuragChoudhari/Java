package Strings.reverse_strings;

import java.util.*;


public class Solution2 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Super");
        StringBuilder rev_str = new StringBuilder("");
        for(int i=str.length()-1;i>=0;i--){
           rev_str.append(str.charAt(i));
        }

        System.out.println(rev_str);
    }
}
