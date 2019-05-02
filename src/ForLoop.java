import java.util.Scanner;

public class ForLoop {


    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        System.out.println("Enter any word");
        String str=scan.next();
        int len=str.length();
        int half =str.length()/2;
        if(len %2==0 && len>4){
            System.out.println(str.substring(half-1, half+1));
        }else if(len%2==1 && len>5){
            System.out.println(str.substring(half-1, half+2));
        }else{
            System.out.println("Error");
        }


    }
}
