package Arrays;

import java.util.*;

public class Solution {

    Scanner sc = new Scanner(System.in);

    public void matrix() {
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println(" ");

        for (int k = 0; k < rows; k++) {
            for (int x = 0; x < cols; x++) {
                System.out.print(numbers[k][x] + " ");
            }
            System.out.println();
        }

        int t = 3;

        while (t > 0) {

            System.out.println(" \n Enter a number to search in matrix: ");

            int search_num = sc.nextInt();

            boolean search_result = false;

            for (int k = 0; k < rows; k++) {
                for (int x = 0; x < cols; x++) {
                    if (numbers[k][x] == search_num) {
                        search_result = true;
                        System.out.println("The number you entered exists at location " + k + " " + x);
                    }

                }

            }

            if (search_result == false) {
                System.out.println("The number you entered was not found!");
            }

             t--;
        }

       
    }

}

class Main {
    public static void main(String[] args) {

        Solution sl = new Solution();

        sl.matrix();
    }
}
