package staticvariables;

public class Application {
    public static void main(String[] args) {
        AppUser user1=new AppUser("Ironman", "Marc sniter", "qwerty");
        AppUser user2=new AppUser("Spiderman", "Elturan Kai", "ewxj123");
        AppUser user3=new AppUser("Antman", "Erqwf Mjkdfnhrj", "jnhjnf333");

        user1.setCount(100);

        System.out.println(user3.getCount());
        System.out.println(user1.getCount());
        System.out.println(user2.getCount());

        AppUser user4=new AppUser();
        System.out.println(user4.getCount());

        System.out.println(user1.getUserID());
        System.out.println(user2.getUserID());


    }
}
