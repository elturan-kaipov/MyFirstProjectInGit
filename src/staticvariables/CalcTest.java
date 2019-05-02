package staticvariables;

public class CalcTest {
    public static void main(String[] args) {
        Calc c=new Calc();
        c.plus(10);
        System.out.println(c.getResult());

        c.plus(5).plus(10).plus(10);
        System.out.println(c.getResult());

        c.minus(10).minus(5);
        System.out.println(c.getResult());
    }
}
