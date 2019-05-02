package CreateOwnMethods;

public class MovieTester {
    public static void main(String[] args) {
        Movie m1=new Movie();
        m1.name="Harry Potter";
        m1.length=123;
        Movie m2=new Movie();
        Movie m3=new Movie();
        m2.name="Gladiator";
        m2.length=112;
        m3.name="StarWars";
        m3.length=134;

        m1.watch();
        m1.buy(12.50);


    }
}
