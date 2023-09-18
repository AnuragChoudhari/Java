package twoSum;

class Solution {
     int[] twoSum(int[] nums, int target) {
        int sum = 0;
        int[] arr_ind = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                sum = nums[i] + nums[j];
                if(sum == target){
                        arr_ind[0] = i;
                        arr_ind[1] = j;
        
                }
            }
        }
         
                     return arr_ind;
    }
}


class Main{
    public static void main(String[]args){
        Solution sl = new Solution();
        int[] arr = {3,3};
        int[] res = sl.twoSum(arr, 6);
        System.out.println(res[0] + " " + res[1]);
    }
}