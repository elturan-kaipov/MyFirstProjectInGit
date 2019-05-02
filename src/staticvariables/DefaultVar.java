package staticvariables;

public class DefaultVar {
    public int num;
    public byte byteValue;
    public boolean bolBalue;
    public char chValue;
    public String strValue;
    public Integer inValue;


    public static void main(String[] args) {
        DefaultVar d=new DefaultVar();
        System.out.println(d.num);
        System.out.println(d.bolBalue);
        System.out.println(d.byteValue);
        System.out.println(d.chValue);
        System.out.println(d.strValue);
        System.out.println(d.inValue);

        System.out.println(d.num+101);
        d.strValue="Hello World";
        System.out.println(d.strValue.toUpperCase());

    }
}
