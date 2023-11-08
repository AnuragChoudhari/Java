package Recursion;

public class SumOfNaturalNum {
    
    public static void print_sum(int n, int end, int sum){

        if(n == end){
            sum = sum + end;
            System.out.println(sum);
            return;
        }

        sum = sum + n;

        print_sum(n+1, end, sum);

    }


    public static void main(String[] args) {
        print_sum(1, 5, 0);
    }
}
