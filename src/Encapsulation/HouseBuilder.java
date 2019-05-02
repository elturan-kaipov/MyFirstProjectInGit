package Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HouseBuilder {
    public static void main(String[] args) {
        House house=new House();
        house.address="2435 w Balmoral ave";
        house.bedrooms=3;
        house.type="appartment";
        house.year=1998;

        House house2=new House();
        house2.address="2435 n Foster ave";
        house2.bedrooms=1;
        house2.type="TownHouse";
        house2.year=2005;

        House house3=new House();
        house3.address="123 n Main ave";
        house3.bedrooms=6;
        house3.type="SingleHouse";
        house3.year=2019;

        House whiteHouse=new House();
        whiteHouse.address="1600 Pennsyllvania ave NW, Washington DC";
        whiteHouse.bedrooms=132;
        whiteHouse.type="Mansion";
        whiteHouse.year=1800;


        System.out.println("House type:"+house.type);
        System.out.println("House2 type:"+house2.type);
        System.out.println("white House type:"+whiteHouse.type);
        System.out.println("House3 type:"+house3.type);


        int[] nums=new int[4];
        nums[0]=87;
        String[] names=new String[4];



        House EsqerHouse=new House();
        EsqerHouse.type="TownHouse";
        EsqerHouse.address="3525 w Peterson ave";
        EsqerHouse.bedrooms=3;
        EsqerHouse.year=2001;


        House[] houses=new House[5];
        houses[0]=house;
        houses[1]=house2;
        houses[2]=house3;
        houses[3]=whiteHouse;
        houses[4]=EsqerHouse;

        System.out.println(houses[0].address);

       for(int i=0; i<houses.length; i++){
           System.out.println(houses[i].address);
       }

       for(House h: houses){
           System.out.println(h.type+"      =======>      "+h.address);
       }

        System.out.println("=====ARRAYLIST OF HOUSE OBJECTS========");

        ArrayList<House> housesList=new ArrayList<>();
        housesList.add(house);
        housesList.add(house2);
        housesList.add(house3);
        housesList.add(whiteHouse);
        housesList.add(EsqerHouse);


        ArrayList<House> housesList2=new ArrayList<>(Arrays.asList(houses));
        List<House> housesList3=Arrays.asList(houses);// fix size

        for(House y:housesList){
            if(y.year>=2005 && y.year<=2019){
                System.out.println(y.address+"==> was build in ==> "+y.year);
            }
        }
        System.out.println("               For Loop");

        for(int l=0; l<housesList.size();l++){
            House tempHouse=housesList.get(l);
            if(tempHouse.year>=2005 && tempHouse.year<=2019){
                System.out.println(tempHouse.address+"==> was build in ==> "+tempHouse.year);
            }
        }
            printHouseInfo(house);
    }
    public static void printHouseInfo(House house){
        System.out.println("============");

        System.out.println("Type: "+house.type);
        System.out.println("Address: "+house.address);
        System.out.println("Year: "+house.year);
        System.out.println("Bedroom #: "+house.bedrooms);
        System.out.println("============");

    }
}
