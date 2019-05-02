package ArrayList;

import java.util.ArrayList;

public class StringsOnlyAL {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        //Arraylist<String> names=new ArrayList<String>();
        // we can assign  different ways
        names.add("Ali");
        names.add("Elturan");
        names.add("Ella");
        names.add("Aza");
        names.add("Alesha");
        names.add("Yulia");

        System.out.print(names);
        System.out.println();
        System.out.println(names.get(1));
        System.out.println(names.size());
        int len=names.size();
        System.out.println("Number of Length: "+len);

        String last=names.get(names.size()-1);// get last element in ArrayList

        System.out.println(last);

        System.out.println(names.remove(0));// delete element from ArrayList
        names.remove("Aza");
        System.out.print(names);
        System.out.println();


    }
}
