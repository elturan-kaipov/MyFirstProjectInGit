package ForLoop;

public class StarsChars {
    public static void main(String[] args) {
        String word="xy*yjka";
        int len=word.length();
        boolean found=false;
        for(int i=0; i<len; i++){
            if(word.charAt(i)=='*'&& word.charAt(i-1)==word.charAt(i+1)){
                found=true;
                break;
            }
        }
        System.out.println(found);
    }
}
