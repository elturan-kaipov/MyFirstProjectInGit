package Methods;

import java.util.Arrays;

public class ArrTasksMeth {
    public static void main(String[] args) {
        int [] a1={1,2,3,4,5};
        int [] a2={6,7,8,9,10};
        String [] words={ "bb", "aa","aa", "1", "1", "1", "1"};
        System.out.println(countDuplications(words));
        System.out.println(Arrays.toString(mergeR(a1, a2)));

        int [] arr=new int[6];

        System.out.println(Arrays.toString(populate(arr)));

    }
    public  static int[] mergeR(int [] a, int [] b){
        int [] arr=new int[a.length+b.length];
        int z=0;
        for(int i=0; i<a.length; i++){
            arr[z]=a[i];
            z++;
        }
        for(int k=0; k<b.length; k++){
            arr[z]=b[k];
            z++;
        }
        return arr;
    }





    public static int[] populate(int[] r) {
        for(int i =0; i < r.length; i++){
            r[i] = (i + 1);
        }
        return r;
    }


        public static int countDuplications (String [] arr) {
            String unique = "";
            for(int outer = 0; outer < arr.length; outer++) {
                String currentStr = arr[outer];
                boolean duplicate = false;

                for (int inner = 0; inner < arr.length; inner++)  {

                    if (arr[inner].equals(currentStr) && inner != outer) {
                        duplicate = true; // String is not unique, exit from inner loop
                        break;
                    }
                }
                if (duplicate == false) {
                    unique += currentStr + " ";
                }
            }
            unique = unique.trim();
            String[] uniqueArr = unique.split(" ");
            int count = arr.length - uniqueArr.length;
            return count;
        }
    }


