package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Presentation {
    public static void main(String[] args) {

        // Creating an ArrayList object
        ArrayList<String> list1=new ArrayList<>();
        //List<String> list1=new ArrayList<>();
        //adding elements
        list1.add("Alin"); list1.add("Azamat"); list1.add("Alesha"); list1.add("Elnara");
//        System.out.println(list1);
//
//        //getting elements
//        System.out.println("first element: "+list1.get(0)); //Alin
//        System.out.println("second element: "+list1.get(1)); //Azamat
//
//        //check if items exists in the list
//        System.out.println(list1.contains("Alin")); //true
//        System.out.println(list1.contains("Elturan")); //false

        //getting the index of item by value indexOf(item)
        System.out.println("Index of Alesha is "+list1.indexOf("Alesha"));// 2

        //checking how many item in the list
        System.out.println("element count: "+list1.size());

        // checking if the list is empty
        System.out.println("list is empty? "+list1.isEmpty() );

        //setting the value for certain index
        list1.set(1, "Elturan");
        System.out.println("new list elements "+list1);

        //removing item by index
        list1.remove(0);
        System.out.println(list1);
        //removing item by value
        list1.remove("Elturan");
        System.out.println(list1);

        //remove all items in the list
        list1.clear();
        System.out.println("new list items after clearing "+list1);

        //checking if the list is empty or not
        System.out.println("list is empty "+ list1.isEmpty());

      boolean b=new Boolean("true");
        System.out.println(b);






    }
}
