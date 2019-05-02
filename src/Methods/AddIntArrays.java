package Methods;

import java.util.Arrays;

public class AddIntArrays {
    public static void main(String[] args) {
    add_to_r(new int[]{1,2,3},3);
        System.out.println(max(23,35));
        System.out.println(isEven(22));
        System.out.println(c_profits(100, 100));
        System.out.println(hamletQuote(true, false));
        System.out.println(simpleRoomBook(true, 7,3,2018));
    }
    public static void add_to_r(int[] r, int n){
        int[] newArr=new int[r.length+1];
        for(int i=0; i<newArr.length-1; i++) {
            newArr[i] = r[i];
            newArr[newArr.length - 1] = n;
        }
        System.out.println(Arrays.toString(newArr));
    }

    public static int max (int max, int x){
        if(x>max){
            return max;
        }else {
            return x;
        }
    }

    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }else{
            return false;
        }
    }

    public static String c_profits(int num1,int num2){
        if(num1<num2){
            return "profit";
        }else if(num1>num2){
            return "loss";
        }else{
            return "no loss";
        }
    }


    public static boolean hamletQuote(boolean toBe, boolean notToBe) {
        if (toBe == true || notToBe == true) {
            return true;
        } else {
            return false;
        }
    }

        public static boolean simpleRoomBook(boolean isAvailable, int month, int day, int year){
            if(isAvailable && year==2018 && (!(month==7 && day<=8 && day>1))){
                return true;
        }else{
                return false;
            }

    }












}
