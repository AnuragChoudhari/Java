package letter_combination_phone_number;

import java.util.*;




public class Solution {
    public static void main(String[] args) {
        String sr = "23";
        HashMap <String, String> map_digit_letters = new HashMap<String, String>();

        ArrayList<String> result = new ArrayList<String>();

        map_digit_letters.put("2", "abc");
        map_digit_letters.put("3", "def");
        map_digit_letters.put("4", "ghi");
        map_digit_letters.put("5", "jkl");
        map_digit_letters.put("6", "mno");
        map_digit_letters.put("7", "pqrs");
        map_digit_letters.put("8", "tuv");
        map_digit_letters.put("9", "wxyz");

        String[] char_arr = sr.split("");


        for (int i = 0; i < sr.length(); i++) {
            String digit = String.valueOf(sr.charAt(i));
            String letters = map_digit_letters.get(digit);
            
            if (letters != null) { // Check if the digit exists in the map
                for (int j = 0; j < letters.length(); j++) {
                    String letter = String.valueOf(letters.charAt(j));
                    String res = letters.charAt(i) + letter;
                    result.add(res);
                }
            } else {
                // Handle the case where the digit is not in the map
            }
        }

        System.out.println(result);
    }

 }   

