public class GetUniqueValuesFromArray {
    public static void main(String[] args) {
        int [] nums={1,2,1,4};
        for(int out=0; out<nums.length; out++) {
            int temp = nums[out];
            boolean unique = true;

            for (int inn = 0; inn < nums.length; inn++) {
                if (nums[inn] == temp && out !=inn) {
                    unique=false;
                    break;
                }
                }
            if(unique){
                System.out.println(temp);
            }
        }
    }
}
