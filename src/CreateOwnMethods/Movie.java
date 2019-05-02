package CreateOwnMethods;

public class Movie {
    String name;
    int length;

    public void watch(){
        System.out.println("Watching Movie:"+name);
        System.out.println("It is "+length+" minutes");
    }
    public void buy(double price){
        System.out.println("Buying "+ name+" for $"+price);
    }
}
