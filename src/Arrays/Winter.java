package Arrays;

public class Winter {
    public static void main(String[] args) {
        int [] nums={0,-12,-23, 0,3,-4, 4,5,17, 15, 23,-1};
        System.out.println(season(nums));
    }
    public static String season(int[] nums) {
        String str = "";
        int wDif, sprDif, sumDif, fDif = 0;
        int maxW = 0;
        int maxSpr = 0;
        int maxSum = 0;
        int maxF = 0;
        int minW = 0;
        int minSpr = 0;
        int minSum = 0;
        int minF = 0;
        int countW = 0;
        int countSpr = 0;
        int countSum = 0;
        int countF = 0;
        int[] winter = new int[nums.length / 4];
        int[] spring = new int[nums.length / 4];
        int[] summer = new int[nums.length / 4];
        int[] fall = new int[nums.length / 4];
        for (int i = 0; i < nums.length / 4; i++) {
            winter[i] = nums[i];
        }
        for (int l = 0; l < winter.length; l++) {
            if (winter[l] >= maxW) {
                maxW = winter[l];
            }
            if (winter[l] <= minW) {
                minW = winter[l];
            }
        }
        wDif = maxW - minW;

        for (int s = nums.length / 4; s < nums.length / 2; s++) {
            spring[countSpr] = nums[s];
            countSpr++;
        }
        for (int k = 0; k < spring.length; k++) {
            if (spring[k] >= maxSpr) {
                maxSpr = spring[k];
            }
            if (spring[k] <= minSpr) {
                minSpr = spring[k];
            }
        }
        sprDif = maxSpr - minSpr;

        for (int j = nums.length / 2; j < nums.length / 4 * 3; j++) {
            summer[countSum] = nums[j];
            countSum++;
        }
        for (int a = 0; a < summer.length; a++) {
            if (summer[a] >= maxSum) {
                maxSum = summer[a];
            }
            if (summer[a] <= minSum) {
                minSum = summer[a];
            }
        }
        sumDif = maxSum - minSum;

        for (int q = nums.length / 4 * 3; q < nums.length; q++) {
            fall[countF] = nums[q];
            countF++;
        }
        for (int e = 0; e < fall.length; e++) {
            if (fall[e] >= maxF) {
                maxF = fall[e];
            }
            if (fall[e] <= minF) {
                minF = fall[e];
            }
        }
        fDif = maxF - minF;

        if(wDif> sprDif && wDif > sumDif && wDif > fDif) {
            return "winter";
        } else if(sprDif>wDif && sprDif > sumDif && sprDif > fDif) {
            return "spring";
        } else if(sumDif >wDif && sumDif >sprDif && sumDif  > fDif) {
            return "summer";
        } else if(fDif>wDif && fDif >sprDif && fDif>sumDif) {
            return "fall";
        } else {
            return "More than one season with the biggest amplitude";
        }
    }
}
