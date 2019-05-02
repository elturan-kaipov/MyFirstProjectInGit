package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class retStringArrayV2 {
    public static void main(String[] args) {
        List<String[]> arr = new ArrayList<String[]>();
        String[] arr1 = {"1", "title1", "content1"};
        String[] arr2 = {"2", "title2", "content2"};
        String[] arr3 = {"3", "title3", "content3"};
        arr.add(arr1);
        arr.add(arr2);
        arr.add(arr3);

        System.out.println(blogDb(arr, "3"));
    }
    public static String blogDb(List<String[]> list, String id) {
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)[0].equalsIgnoreCase(id)) {
                list.remove(list.get(i)[0]);
                str += list.get(i)[1] + " "+list.get(i)[2];
            }
        }

        return str;
    }
}
