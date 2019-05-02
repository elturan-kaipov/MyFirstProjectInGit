package ArrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class CitiesArrayList {
    public static void main(String[] args) {
        ArrayList <String> cities=new ArrayList();
        cities.add("Bishkek");
        cities.add("Chicago");
        cities.add("London");
        cities.add("NewYork");
        cities.add("SanFransisco");
        cities.add("losAngeles");
        cities.add("Rockford");
        cities.add("Columbus");
        cities.add("Portland");
        cities.add("Miami");
        cities.add("Richmond");

        int len=cities.size();
        System.out.println(len);
        System.out.println(cities);
        for(String city: cities){
            System.out.print(city+" ");
        }
        System.out.println();
        ArrayList <String> longNames=new ArrayList<>();
        System.out.println(longNames.size());
        System.out.println(longNames.isEmpty());
        for (String city:cities){
            if(city.length()>6) {
                longNames.add(city);
            }
        }
        System.out.println(longNames);
        System.out.println();

        System.out.println("Clearing LongNames ArrayList......");
        longNames.clear();// clear ArrayList
        System.out.println(longNames.isEmpty());
        System.out.println();

        for(int i=0; i<len; i++){
            if (cities.get(i).length()>6) {
                longNames.add(cities.get(i));
            }
            }
            for(String n:longNames) {
                System.out.println("Long Names cities: " + n+" <"+n.length()+"> length");
            }
    }
}
