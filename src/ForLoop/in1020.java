package ForLoop;

public class in1020 {
    public static void main(String[] args) {
//        int num1=12;
//        int num2=23;
//        boolean found=false;
//        if(num1>=10&&num1<=20 || num2<=20 && num2>=10){
//            found=true;
//        }
//        System.out.println(found);
        String word="hello";
        String word1=" ";
        int len=word.length();
       if(len>=3){
        for(int i=0; i<word.length()-3; i++) {
            word1=word1+word.substring(i,i+1);
        }

          System.out.print(word1+word.substring(len-3).toUpperCase());
        }else{
           System.out.println(word.toUpperCase());
       }

    }
}
