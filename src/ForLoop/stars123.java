package ForLoop;

public class stars123 {
    public static void main(String[] args) {
        System.out.println(reversed("Hello"));
        System.out.println();
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int l=1; l<=4; l++){
            for(int k=4; k>=l; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static String reversed(String word){
        String rev="";
        for(int i=word.length()-1; i>=0; i--){
           rev+= word.charAt(i);
        }
        return rev;
    }
}
