package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr={7,2,4,6};


        int big=0;
        int secBig=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>big){
                secBig=big;
                big=arr[i];
            }else if(arr[i]>secBig && big !=arr[i]){
                secBig=arr[i];
            }
        }
        System.out.println(secBig);
        System.out.println(big);
    }
}
