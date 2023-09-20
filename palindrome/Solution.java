package palindrome;

class Solution {
    public boolean isPalindrome(int x) {
        
        if(x<0){
            return false;
        }

        int reversed = 0;
        int temp = x;

        while( temp != 0){
            int digit = temp % 10; 
            reversed = reversed * 10 + digit;
            temp = temp / 10;
        }

        if(reversed == x){
            return true;
        }
        return false;
    }
}

class Main{
    public static void main(String[] args) {
        Solution sl  = new Solution();
        boolean res = sl.isPalindrome(10);
        System.out.println(res);
    }
}