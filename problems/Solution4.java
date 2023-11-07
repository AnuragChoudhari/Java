package problems;

import java.util.*;

public class Solution4 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

        Scanner sc = new Scanner(System.in);

        int user_inp = sc.nextInt();


            int prod = 0;

            for (int i = 0; i <= arr.length; i++) {

                for (int j = i + 1; j < arr.length; j++) {
                    prod = arr[i] * arr[j];
                    if (prod == user_inp) {
                        System.out.println("The two numbers are " + arr[i] + " " + arr[j]);
                    }else{
                        prod = 0;
                    }
                }
                
            }

     

    }
}
