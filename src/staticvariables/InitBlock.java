package staticvariables;

public class InitBlock {
    static{
        System.out.println("Static block");
    }
    {
        System.out.println("This is initalizer block. I run automatically every time object is created");
    }
    public InitBlock(){
        System.out.println("This is a Constructor. I run every time object is created");
    }

    public static void staticMethod(){
        System.out.println("static method");
    }
}
