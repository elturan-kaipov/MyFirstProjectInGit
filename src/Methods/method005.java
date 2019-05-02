package Methods;

import java.util.Arrays;

public class method005 {
    public static void main(String[] args) {
        int[] arr1={3,2,1,4};
        int[] arr2={4,32,17,5};
//     int [] arr=addElements(new int[]{12,23,43,12},
//                        new int[]{10,21,32,12});
      int[] arr3 = addElements(arr1,arr2);
        System.out.println(Arrays.toString(arr3));

        System.out.println(playGame(11, "Soccer"));
        System.out.println(playGame("Soccer", 5));
    }

    public static int[] addElements(int[] ints1, int[] ints2) {
        int[] ints3 = new int[ints1.length];

        for (int i = 0; i < ints3.length; i++) {
            ints3[i] = ints1[i] + ints2[i];
        }
        return ints3;
    }

    public static boolean playGame(String game, int players ){
        System.out.println("Playing <"+game+"> with <"+players+"> players");
        return players>=2;
    }
    public static boolean playGame(int players, String game ) {
        System.out.println("Playing <" + game + "> with <" + players + "> players");
        return players >= 2;
    }
    public static boolean work(String jobtype){
        System.out.println("Working as <"+jobtype+"> and it is fun");
        return jobtype.equalsIgnoreCase("sdet")|| jobtype.equalsIgnoreCase("developer");
    }
    public static double work(int hours){
        double salary=hours*60;
        System.out.println("Worked <"+hours+"> and made <$"+salary+"> income");
        return salary;
    }

}