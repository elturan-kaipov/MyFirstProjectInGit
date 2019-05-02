package Encapsulation;

        import static Encapsulation.HouseBuilder.*;

public class HouseTester {
    public static void main(String[] args) {
        House yourHouse=new House();
        yourHouse.type="Castle";
        yourHouse.address="1111 main st";
        yourHouse.bedrooms=45;
        yourHouse.year=1789;

        printHouseInfo(yourHouse);
        House returnhouse=buildhouse("JerTam", "137 w Ostrovskogo st", 6, 2001);
        System.out.println(returnhouse.address);
        System.out.println(returnhouse.year);
        System.out.println(returnhouse.type);
        System.out.println(returnhouse.bedrooms);
        printHouseInfo(returnhouse);


    }
    public static void printHouseInfo(House houseobj){
        System.out.println("============");

        System.out.println("Type: "+houseobj.type);
        System.out.println("Address: "+houseobj.address);
        System.out.println("Year: "+houseobj.year);
        System.out.println("Bedroom #: "+houseobj.bedrooms);
        System.out.println("============");

    }

    public static House buildhouse(String type, String address, int rooms, int year){
        House myHouse=new House();
        myHouse.type=type;
        myHouse.address=address;
        myHouse.bedrooms=rooms;
        myHouse.year=2001;
        return myHouse;
    }
}
