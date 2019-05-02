package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class retStringArray {
    public static void main(String[] args) {
        List<String[]> arr = new ArrayList<String[]>();
        String[] arr1 = {"1", "title1", "content1"};
        String[] arr2 = {"2", "title2", "content2"};
        String[] arr3 = {"3", "title3", "content3"};
        arr.add(arr1);
        arr.add(arr2);
        arr.add(arr3);
       blogDb(arr,"1");
    }

    public static void blogDb(List<String[]> list, String id) {
        String[] str = new String[2];
        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)[0].equalsIgnoreCase(id)) {
                for (int j = 1; j < list.get(i).length; j++) {
                    str[count]=list.get(i)[j];
                    count++;
                }
            }
        }
        for(String s:str){
            System.out.println(s);
        }

    }
}