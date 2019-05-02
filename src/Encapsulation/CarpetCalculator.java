package Encapsulation;

public class CarpetCalculator {
    public double width;
    public double length;
    public double unitPrice;
    public double totalPrice;
    public boolean isPersian;

    public CarpetCalculator(){
        this.width=300;
        this.length=300;
        this.unitPrice=0;
        this.isPersian=false;
        this.totalPrice=200;
    }
    public CarpetCalculator(double width, double length, double unitPrice, boolean isPersian){
        this.width=width;
        this.length=length;
        this.unitPrice=unitPrice;
        this.totalPrice=(width+length)*2;
        this.isPersian=false;
        if(isPersian)
            totalPrice+=200;

    }


    public static void main(String[] args) {
        CarpetCalculator c=new CarpetCalculator(20.0,20.0, 2.0, true);
        System.out.println(c.totalPrice);
        CarpetCalculator c2=new CarpetCalculator(20.0,20.0, 2.0, false);
        System.out.println(c2.totalPrice);
        CarpetCalculator c3=new CarpetCalculator();
        System.out.println(c3.totalPrice);
    }

}
