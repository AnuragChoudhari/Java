package problems;

public class Solution2 {
    public static void main(String[] args) {
        String str = "Youtube";
        char curr_char;
        char[] char_array = str.toCharArray();
        for(int i=0;i<str.length();i++){
            curr_char = str.charAt(i);
            if(curr_char == 'a' || curr_char == 'e' || curr_char == 'i' || curr_char == 'o' || curr_char == 'u'){
                char_array[i] = 'n';
            }
        }
        
        for(int i=0;i<str.length();i++){
            System.out.println(char_array[i]);
        }
        
    }
}
