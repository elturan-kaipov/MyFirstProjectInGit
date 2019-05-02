package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Nanuk {
    public static void main(String[] args) {
        ArrayList<String> strs=new ArrayList<>(Arrays.asList("1", "10", "3", "nanuk", "nanuk"));
        System.out.println(pizNanuk(strs, 2,7));
        ArrayList<String> words=new ArrayList<>(Arrays.asList("one apple", "four bananas", "five peaches"));
        String word="four";
        System.out.println(search(words,word));


    }
    public static boolean pizNanuk(ArrayList<String> nums, int stone, int boast){
        int nanuk=0;
        int sum=0;
        for(int i=0; i<nums.size(); i++){
            if(nums.get(i).equals("nanuk")){
                nanuk++;
            }
        }
        if(!(stone>=nanuk)){
            return false;
        }else{
            for (int j = 0; j < nums.size(); j++) {
                if (!nums.get(j).equals("nanuk")) {

                    sum += Integer.parseInt(nums.get(j));
                }
            }
            if (sum >= boast) {
                return true;
            }
        }

        return false;
    }

    public static String search(ArrayList<String> words, String word) {
        //String empty = "";
        for (String s : words) {
            if (s.toLowerCase().contains(word.toLowerCase())) {
                return s;
            }

        }
        return "Search failed";
    }
    }



