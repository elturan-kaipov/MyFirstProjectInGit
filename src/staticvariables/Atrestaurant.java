package staticvariables;

public class Atrestaurant {
    public static void main(String[] args) {
        Diner dad=new Diner();
        Diner mom=new Diner();
        Diner kid=new Diner();

        System.out.println("Pizza slices: "+Diner.pizzaSlices);
        dad.takeASlice(2);
        kid.takeASlice(3);
        mom.takeASlice();

        System.out.println("Pizza slices:"+mom.pizzaSlices);
        mom.takeASlice();
        System.out.println(kid.pizzaSlices);
    }
}
