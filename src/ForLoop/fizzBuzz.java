package ForLoop;

import java.util.Arrays;

public class fizzBuzz {
    public static void main(String[] args) {
        int [] nums={1,16};
        int start=nums[0];
        int end=nums[1];
        String[] arr=new String[end-start];
        System.out.println();
        for(int i=0; start<end; i++){
            nums[i]=start;
            arr[i]=String.valueOf(nums[i]);
            if(nums[i]%3==0 && nums[i]%5==0){
                arr[i]="FizzBuzz";
            }else if(nums[i]%5==0){
                arr[i]="Buzz";
            }else if(nums[i]%3==0){
                arr[i]="Fizz";
            }
            start++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
