package Arrays;

public class Aza {
    public static void main(String[] args) {
        double [] nums={23,12,3,4,32};

        for(int i=0; i<nums.length;i++){
            System.out.println(nums[i]+" ");
        }

        double max=0;
        for(int j=0; j<nums.length;j++){
            if(nums[j]>max){
                max=nums[j];
            }
        }
        System.out.println(max);


        System.out.println("I change my cod here");


    }
}
