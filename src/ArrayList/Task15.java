package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task15 {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(1);
        nums.add(5);
        nums.add(3);
        nums.add(7);
        System.out.println(twoTimes(nums));
        ArrayList<Boolean>bool=new ArrayList<>();
        bool.add(true);
        bool.add(false);
        bool.add(false);
       // System.out.println(bool);
        repeatAll(bool);
        System.out.println(bool);
        ArrayList<String> words=new ArrayList<>(Arrays.asList("hi", "yo", "Hello", "yolo", "boop"));
        removeEveryOther(words);
        ArrayList<String> sw=new ArrayList<>(Arrays.asList("one", "two", "three"));
        System.out.println(swap(sw, 0,2));

    }
    public static ArrayList<Integer> twoTimes(ArrayList<Integer> nums){
        ArrayList<Integer> newList=new ArrayList<>();
        for(int i=0; i<nums.size(); i++){
            newList.add(nums.get(i));
            newList.add(nums.get(i));
        }
        return newList;
    }
    public static  void repeatAll(ArrayList<Boolean> bool){
        bool.addAll(bool);
    }
    public static void removeEveryOther(ArrayList<String> word){

        for(int i=0; i<word.size(); i++){
            if(i%2==1){
                word.remove(i);
            }
            if(i%2==0){
                word.remove(i);
            }

        }
        System.out.println(word);
    }
    public static ArrayList<String> swap(ArrayList<String> words, int pos1, int pos2){
        String temp=words.get(pos1);
        for(int i=0; i<words.size(); i++){
            if(i==pos1){
                words.set(i, words.get(pos2));
                words.set(pos2, temp);

            }
        }
        return words;
    }
}
