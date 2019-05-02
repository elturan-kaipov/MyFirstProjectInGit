package StringbuilderAndBuffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWork002 {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("d");
        String b="A";
        boolean found=isSame(b,str);
        System.out.println(found);
        String [] r={"1", "2", "22", "11", "1"};

        System.out.println(replaceWith(r,"1","2"));

        ArrayList<List<String>> strs=new ArrayList<List<String>>();
        List<String>x=new ArrayList<>();
        x.add("a");
        x.add("b");
        strs.add(x);
        List<String>y=new ArrayList<>();
        y.add("c");
        y.add("d");
        strs.add(y);
        System.out.println(strs);
        System.out.println(printList(strs));
    }

    public static boolean isSame(String a, StringBuilder b) {
      return  b.toString().equalsIgnoreCase(a);
    }

    public static StringBuilder replaceWith(String[] r,String replace,String replaceWith){
    StringBuilder strs=new StringBuilder();
        for(String s:r) {

            if(s.equalsIgnoreCase(replace)){
                s=s.replace(replace,replaceWith);
            }
            strs.append(s);
        }
        return  strs;
    }
    public static String printList(ArrayList<List<String>> strs){
        String str="";
        for(int i=0; i<strs.size(); i++){
            for(int k=0; k<strs.get(i).size();k++){
                str+=strs.get(i).get(k);
            }
        }
        return str;
    }
}