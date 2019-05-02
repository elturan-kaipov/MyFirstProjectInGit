package Arrays;

import java.util.Arrays;

public class task01 {
    public static void main(String[] args) {
        String [] s_r=new String[]{"foo","hello","bar","world"};
        for(String str:s_r){
            if(str.equalsIgnoreCase("foo")){
                System.out.print(str);
            }else if(str.equalsIgnoreCase("bar")){
                System.out.println(str);
            }
        }
    }
}
