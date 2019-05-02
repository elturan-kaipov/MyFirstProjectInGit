package Arrays;

public class dArraysMatches {
    public static void main(String[] args) {
        int [][] nums={{1,2,3,4,3,3}, {2,1,1,3,4,5}, {5,4,3,3,5,5}};
        int matches=0;
            for(int i=0; i<nums.length; i++){
                for(int j=0; j<nums[i].length-1; j++){

                    if(nums[i][j]== nums[i][j+1]){
                        matches++;
                    }
                }
        }
        System.out.println(matches);
    }
}
