package Methods;

import java.util.Arrays;

public class TasksArrMeth {
    public static void main(String[] args) {
        int [] arr = {6,4,5,6,8,1};
        int num = 4;
        int [] newArr = deleteInt(arr, num);
        System.out.println(Arrays.toString (newArr));
    }
    public static int [] deleteInt (int[] arr, int num) {
        int [] newArr = new int [arr.length - 1];
        for (int i = 0; i < newArr.length; i++) {
            if (arr[i] == num) {
                for (int j = i+1; j < arr.length; j++)
                    arr[j-1] = arr [j];
            }
            newArr[i] = arr [i];
        }
        return newArr;
    }
}