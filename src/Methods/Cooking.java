package Methods;

public class Cooking {
    public static void main(String[] args) {
        cook("Steak");
        youWillNeed("meat, salt, pepper");
        cookTime(20, "Well done");
        ready();

    }
    public static void cook(String fooName){
        System.out.println("today we are cooking "+fooName);
    }
    public static void youWillNeed(String items){
        System.out.println("We need following items: "+items);
    }
    public static void cookTime(int minutes, String wayOfCooking){
        System.out.println("You need to cook for "+minutes+" minutes, by "+wayOfCooking);
    }
    public static void ready(){
        System.out.println("Enjoy your meal!");
    }


}
