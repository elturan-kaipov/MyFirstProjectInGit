package ArrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tasks {
    public static void main(String[] args) {
        String[] str1={"g", "oo", "g", "l", "e "};
        String[] str2={"ch", "ro", "me"};
        String str3=word(str1, str2);
        System.out.println(str3);
        ArrayList<String> strs=new ArrayList<>();
        strs.add("Hello");
        strs.add("Panda");
        strs.add("lola");
        System.out.println(strs);

        List<String> world1=Arrays.asList(new String[]{"banana", "apple", "Plum", "peach", "Beach"});
        List<String> world2=new ArrayList<>();
        world2.add("Elturan");
        world2.add("Alinbek");
        System.out.println(combine(world1,world2));
        int lenList=combine(world1,world2).size();
        System.out.println(lenList);
        ArrayList<String> world3=new ArrayList<>(combine(world1, world2));
        System.out.println(world3);
        for(String str:world3){
            System.out.print(str+" ");
        }
        System.out.println();
        System.out.println();
        String str11="";
        for(int i=0; i<world3.size(); i++){
            int len=world3.get(i).length()/2;
            if(world3.get(i).length()>4 && world3.get(i).length()%2==1){
                str11+=world3.get(i).substring(len-1, len+2);
            }
        }
        System.out.println(str11);
        String arr=str11.replace('p', ' ').replace('e',' ').replace('a',' ').trim();
        System.out.println(arr);
        System.out.println();
        String[] splArr=arr.split(" ");
        System.out.println(Arrays.deepToString(splArr));
        for (String s:splArr){
            System.out.print(s);
        }

    }
    public static String word(String[] str1, String [] str2){
        List<String> arr=new ArrayList<>();
        List<String> list1= Arrays.asList(str1);
        List<String> list2=Arrays.asList(str2);
        arr.addAll(list1);
        arr.addAll(list2);

        String str3="";
        for(String s:arr){
            str3+=s;
        }
        return str3;
    }
    public static ArrayList<String> combine(List<String> word1, List<String> word2){
        ArrayList<String> worldWord=new ArrayList<>(word1);
        worldWord.addAll(word2);
        return worldWord;

    }

}
