package Arrays;

public class ThirdLargestNumber {
    public static void main(String[] args) {
        int[] arr = {7, 2,9, 4,87,100,54, 6};


        int big = 0;
        int secBig = 0;
        int third=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > big) {
                third=secBig;
                secBig = big;
                big = arr[i];
            } else if (arr[i] > secBig && big != arr[i]) {
                secBig = arr[i];
            }else if(arr[i]>third && secBig!=arr[i]){
                third=arr[i];
            }
        }
        System.out.println(third);
        System.out.println(secBig);
        System.out.println(big);
    }
}
