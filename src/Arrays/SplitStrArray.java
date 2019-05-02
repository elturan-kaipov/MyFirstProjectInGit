package Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class SplitStrArray {
    public static void main(String[] args) {


        String str = "Hello World";

        String[] arr = str.split(" ");
        String[]str11={"Hello"};
        String [] arr1=Arrays.copyOf(str11, str11.length);
        System.out.println(Arrays.toString(arr1));
        System.out.println();

        System.out.println(Arrays.toString(arr));
        int count=0;
        for(String word:arr){
            count++;
        }
        System.out.println(count);
    }
}