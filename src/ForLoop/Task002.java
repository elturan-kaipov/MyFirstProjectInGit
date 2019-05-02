package ForLoop;

import java.util.Arrays;

        public class Task002 {
            public static void main(String[] args) {
                int[] nums = {0, 5, 0, 3};
                int p;

                for (int i = 0; i < nums.length - 1; i++) {
                    if (nums[i] == 0) {
                        p = 0;
                        for (int k = i + 1; k < nums.length; k++) {

                            if (nums[k] > p && nums[k] % 2 == 1) {
                                p = nums[k];

                            }
                            if (p != 0) {
                                nums[i] = p;
                            }
                        }

                    }

                }
                System.out.println(Arrays.toString(nums));
            }
        }
