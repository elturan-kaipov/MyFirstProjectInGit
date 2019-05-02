package Arrays;

import java.util.Arrays;

public class ZombieAttack {
    public static void main(String[] args) {
        int [] inhabitants={3,6,0,4,3,2,7,0};
        int day = 0;
        int sum = 0;


        do {
            day++;
            sum = 0;
            int[] temp = Arrays.copyOf(inhabitants, inhabitants.length);
          // System.out.println(Arrays.toString(temp));

            for(int i = 0; i <inhabitants.length; i++) {
                if(inhabitants[i] == 0 && i != 0 && i != inhabitants.length-1) {
                    temp[i-1] = inhabitants[i-1]/2;
                    temp[i+1] = inhabitants[i+1]/2;
                }else if(i == 0 && inhabitants[i] == 0) {
                    temp[i+1] = temp[i+1]/2;
                }else if(i == inhabitants.length-1 && inhabitants[i] == 0) {
                    temp[i-1] = inhabitants[i-1]/2;
                }
            }
            for(int i = 0; i< inhabitants.length; i++) {
                inhabitants[i] = temp[i];
            }
            for(int inhabitant : inhabitants) {
                sum = sum+inhabitant;
            }

            System.out.println("Day "+day+" "+Arrays.toString(inhabitants));
        }while (sum != 0);




    }
}


