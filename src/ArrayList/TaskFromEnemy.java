package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class TaskFromEnemy {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("lola");
        words.add("lala");
        words.add("fofa");
        String empty="";
        String qwerty="";
        for(String h:words){
            if(h.startsWith("l")){
                empty+=h;
            }
        }

        System.out.println(empty);
        String[] arr=empty.split(" ");
        System.out.println(Arrays.toString(arr));

        String time="12:35:55";
        String[] arr1=time.split(":");
        int[] timeArr=new int[arr1.length];
        for(int i=0; i<timeArr.length; i++){
            timeArr[i]=Integer.valueOf(arr1[i]);
        }
            int sumSeconds=timeArr[0]*60*60+timeArr[1]*60+timeArr[2];
        System.out.println(sumSeconds);

        System.out.println(Arrays.toString(arr1));
        int nums=Integer.valueOf(arr1[arr1.length-1]);
        System.out.println(nums);
        int numsMin=Integer.valueOf(arr1[arr1.length-2]);
        numsMin=numsMin*60;
        int numsHour=Integer.valueOf(arr1[arr1.length-3]);
        numsHour=(numsHour*60)*60;
        int total=nums+numsMin+numsHour;
        System.out.println(total);


    }
}
