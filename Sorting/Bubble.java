package Sorting;



public class Bubble {
    
    public static void display_arr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);;
        }
    }

    public static void main(String[]args){

        int[] sample_arr = {2,3,1,0,5};

        for(int i=0;i<sample_arr.length-1;i++){
            for(int j=0;j<sample_arr.length-i-1;j++){
                if(sample_arr[j]> sample_arr[j+1]){
                    int temp = sample_arr[j];
                    sample_arr[j] = sample_arr[j+1];
                    sample_arr[j+1] = temp;
                }
            }
        }

        display_arr(sample_arr);
    }
    
}
