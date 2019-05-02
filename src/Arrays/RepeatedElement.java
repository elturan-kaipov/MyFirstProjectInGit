package Arrays;

public class RepeatedElement {
    public static void main(String[] args) {
        int[] nums={1,1,2,3,4,3,4};

        for(int i=0; i<nums.length; i++){
            boolean unique=false;
            int temp=nums[i];
            for(int k=0; k<nums.length; k++){
                if(nums[k]==temp && k!=i){
                    unique=true;
                }
            }


        if(unique==false) {
            System.out.println(temp);
        }
        }
    }
}
