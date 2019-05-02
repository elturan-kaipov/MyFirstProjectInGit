package Methods;

import java.util.Arrays;

public class MethodsWithConditions {
    public static void main(String[] args) {
        larger(45,45);
        int [] arr={34,23,56,76};
        getMax(arr);
        getMax(new int[]{45,90,23});
        steps(new int []{0,-4, 7});
    }
    public static void larger(int num1, int num2){
        if(num1>num2){
            System.out.println("Largest number is: "+num1);
        }else if(num2>num1){
            System.out.println("Largest number is: "+num2);
        }else{
            System.out.println("Numbers are equal: "+num1+"="+num2);
        }
    }

    public static void getMax(int[] nums){

        Arrays.sort(nums);//Sort and find largest number in int Array and also we can find Second largest number)))
        System.out.println(nums[nums.length-1]);//Largest number
        System.out.println(nums[nums.length-2]);// Second Largest number



        int max=0;
        if(nums.length==0){
            System.out.println("Error: Array is empty");
        }
        for(int i=0; i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        System.out.println("Largest number is: "+max);
    }

    public static void steps(int [] nums){
        for(int i=0; i<nums.length; i++){
            if(nums[i]<0){
                for(int k=nums[i]; k<0; k++) {
                for(int l=1; l<=nums[i]*(-1); l++)

                    System.out.println("Jump "+l);
                break;

                }
            }else if(nums[i]==0){
                System.out.println("Sit");
            }else if(nums[i]>0){
                for(int j=1; j<=nums[i]; j++)
                System.out.println("Step "+j);
            }
        }
    }
}
