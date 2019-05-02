package ForLoop;

public class Find77 {
    public static void main(String[] args) {
        int [] nums={7,1};
        boolean find=false;
        for(int i=0; i<nums.length-2; i++){
            if(nums[i]==7 && nums[i+1]==7){
                find=true;
                 break;
            }else if(nums[i]==7 && nums[i+2]==7){
                find=true;
                break;
            }
        }
        System.out.println(find);
    }
}
