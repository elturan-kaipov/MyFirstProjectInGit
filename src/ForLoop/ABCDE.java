package ForLoop;

public class ABCDE {
    public static void main(String[] args) {

        for(int i=0; i<=5; i++){
            for(int k=1; k<=i; k++){
                System.out.printf("%3c", k+64);
            }
            System.out.println();
        }
    }
}
