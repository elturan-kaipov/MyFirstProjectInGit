package ForLoop;

public class SOS {
    public static void main(String[] args) {
        String word="abcsos".toLowerCase();


        int len=word.length()-2;
        boolean sos=false;
        for(int i=0; i<len; i++){
            if(word.charAt(i)=='s' && word.charAt(i+2)=='s'){
                sos=true;
            }else{
                sos=false;
            }
        }
        System.out.println(sos);
    }

}
