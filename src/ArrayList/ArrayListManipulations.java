package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListManipulations {
    public static void main(String[] args) {
        ArrayList<String> fruits1=new ArrayList<>();
        List<String> fruits=new ArrayList<>();
        List<String> fruits2=new ArrayList<>(10);
        ArrayList<String> fruits4=new ArrayList<>(fruits);
        List<String> fruits5= Arrays.asList(new String[] {"watermelon", "Peach", "Apple"});

        List<String> fruits6=new ArrayList<>(fruits5);
        fruits6.add("Cherry");


    }

}
