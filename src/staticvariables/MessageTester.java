package staticvariables;

public class MessageTester {
    public static void main(String[] args) {
        Message msg1=new Message("Hello!", "Elturan", "Alin");
        Message msg2=new Message("Java is Fun....");
        Message msg3=new Message("This keyword is interesting", "Aza");
        Message msg4=new Message();


        System.out.println(msg1.toString());
        System.out.println(msg2.toString());
        System.out.println(msg3.toString());
        System.out.println(msg4.toString());

        StringBuilder stb=new StringBuilder("A");
        stb.append("B").append("C");
        System.out.println(stb);

    }
}
