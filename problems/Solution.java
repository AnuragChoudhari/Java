package problems;

// Prime numbers from 1 to 100
public class Solution {
    public static void main(String[] args) {
        for(int i=2;i<100;i++){
            if(i%2!=0 && i%3!=0 || i==2 || i==3){
                System.out.println(i);
            }
        }
    }
}
