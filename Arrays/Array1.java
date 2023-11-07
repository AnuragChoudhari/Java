package Arrays;

import java.util.*;

public class Array1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");

        int size_of_arr = sc.nextInt();

        int[] arr = new int[size_of_arr];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element you want to search in the array: ");

        int num = sc.nextInt();

        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                System.out.println(i);
            }
        }
    }
}
