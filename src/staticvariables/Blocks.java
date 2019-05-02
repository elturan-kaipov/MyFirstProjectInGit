package staticvariables;

public class Blocks {
    static int num=100;
    static String str;

    static{
        System.out.println("static block");
        num =num+1000;
        str="Hello";
    }

    {
        System.out.println("Init block");
        num+=500;
        str=str+" world";
    }

    public Blocks(){
        System.out.println("Constructor");
        num*=2;
        str=str+"!!!";
    }
}
