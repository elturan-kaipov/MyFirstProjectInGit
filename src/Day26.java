public class Day26 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9};
        for(int n:nums){
            System.out.print(n+" ");
        }
        System.out.println();
        for(int i=0; i<nums.length; i++){
            int count=0;
            if(nums[i]%2==0){
                count=nums[i]*2;
            }else if(nums[i]%2==1){
               count= nums[i]*3;
            }
            System.out.print(count+" ");
        }
    }
}
