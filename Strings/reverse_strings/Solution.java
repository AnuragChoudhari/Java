package Strings.reverse_strings;

public class Solution {
    
    public StringBuilder rev(String string_to_rev){
        
        StringBuilder reversed_string = new StringBuilder("");

        for(int i=string_to_rev.length()-1;i>=0;i--){
            reversed_string.append(string_to_rev.charAt(i));
        }

        return reversed_string;
        
    }

}


class Main{
    public static void main(String[] args) {
        Solution sl = new Solution();
        StringBuilder ans = sl.rev("Hello");
        System.out.println(ans);
    }
}