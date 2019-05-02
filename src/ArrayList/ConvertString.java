package ArrayList;

public class ConvertString {
    public static void main(String[] args) {
        String count="432";
        int iCount=Integer.parseInt(count);
        System.out.println(iCount);

        String str="price is 45.77";
        String[] sp=str.split(" ");

        double price=Double.parseDouble(sp[2]);
        System.out.println(price);

        String etsyresult=" 'wooden spoon' (13,950 results)";
        String[] etsyArray=etsyresult.split(" ");
        String strSpoonsCount=etsyArray[2].replace("(", "").replace(",","");
        int woodenSpoons=Integer.parseInt(strSpoonsCount);
        //System.out.println(woodenSpoons);
        if(woodenSpoons>0){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }
}
