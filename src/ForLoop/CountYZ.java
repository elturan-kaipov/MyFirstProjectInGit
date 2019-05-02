package ForLoop;

public class CountYZ {
    public static void main(String[] args) {
        String word="fez day";
        word=word.toLowerCase();
        String [] arr=word.split(" ");
        int count=0;
        for(String str:arr){
            if(word.endsWith("y")||word.endsWith("z")){
                count++;
            }
        }
        System.out.println(count);
    }
}
