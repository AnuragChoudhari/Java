package roman_to_integer;

import java.util.*;


class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> map = new HashMap<>(); // Correct data type

        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        int res = 0;

        if (s.length() <= 15) {
            for (int i = 0; i < s.length(); i++) {
                String currentSymbol = String.valueOf(s.charAt(i));
                Integer currentVal = map.get(currentSymbol);

                if (i < s.length() - 1) {
                    String nextSymbol = String.valueOf(s.charAt(i + 1));
                    Integer nextVal = map.get(nextSymbol);

                    if (nextVal > currentVal) {
                        res -= currentVal;
                    } else {
                        res += currentVal;
                    }
                } else {
                    res += currentVal;
                }
            }
        } else {
            System.out.println("String length exceeded!");
        }

        return res;
    }
}

class Main {
    public static void main(String[] args) {
        Solution sl = new Solution();
        int res = sl.romanToInt("XXVII");
        System.out.println(res);
    }
}
