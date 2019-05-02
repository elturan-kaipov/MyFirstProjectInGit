package staticvariables;

public class BlocksTester {
    public static void main(String[] args) {
        System.out.println(Blocks.num);
        System.out.println(Blocks.str);

//        System.out.println(Blocks.num);
//        System.out.println(Blocks.str);

        Blocks b=new Blocks();
        //Blocks b2=new Blocks();
        System.out.println(b.num);
        System.out.println(b.str);

//        System.out.println(b2.num);
//        System.out.println(b2.str);


    }
}
