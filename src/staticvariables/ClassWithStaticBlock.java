package staticvariables;

public class ClassWithStaticBlock {
    static {
        System.out.println("This is static block. I run once in the beginning");
    }
    public ClassWithStaticBlock(){
        System.out.println("This is a Constructor. I run every time object is created");
    }

    public static void staticMethod(){
        System.out.println("This is a static method");
    }
}
