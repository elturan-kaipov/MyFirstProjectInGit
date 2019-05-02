package StringbuilderAndBuffer;

public class Compare {
    public static void main(String[] args) {
        StringBuilder build1=new StringBuilder("java");
        StringBuilder build2=new StringBuilder("java");

        System.out.println(build1==build2);// false
        System.out.println(build1.equals(build2));
        System.out.println(build1.toString().equals(build2.toString()));

        StringBuilder build3=build1;
        System.out.println(build3==build1);

        build3.append(" programming");
        System.out.println(build1);
        System.out.println(build3);

        StringBuilder build4=new StringBuilder(build1);
        System.out.println(build4);
        build1.append("!!!");
        System.out.println(build4);
        System.out.println(build1);
        System.out.println(build3);

    }
}
