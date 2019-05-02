package staticvariables;

public class Diner {


    public static int pizzaSlices=8;
    public void takeASlice(){
        pizzaSlices--;
    }

    public void takeASlice(int num) {
        pizzaSlices -= num;
    }
}
