package ArrayList;

public class CreateWrapperclass {
    public static void main(String[] args) {
        Integer n1=new Integer(100);
        Integer n2=Integer.valueOf(45);
        Integer n3=Integer.parseInt("23");

        Double d1=new Double(123.45);
        Double d2=Double.valueOf(234.56);
        Double d3=Double.parseDouble("123.890");

        System.out.println(n1);
        System.out.println(n1+n2+n3);
        System.out.println();


        char ch3='9';
        System.out.println(Character.isDigit(ch3));

        String str="abc";
        System.out.println(Character.isAlphabetic(str.charAt(0)));

    }
}
