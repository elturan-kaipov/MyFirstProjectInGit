package Encapsulation;

public class PersonCheck {
    public static void main(String[] args) {
        Person you=new Person();
        System.out.println(you.getFirstName()+" | "+you.getLastName()+" | "+you.getAge());
        System.out.println(you.toString());

        Person me=new Person();
        me.setFirstName("Elturan");
        me.setLastName("Kaipov");
        me.setAge(28);
        System.out.println(me.toString());
        System.out.println(me);
    }
}
