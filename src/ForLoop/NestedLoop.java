package ForLoop;

public class NestedLoop {
    public static void main(String[] args) {
        for (int j = 1; j <= 5; j++) {
            for (int i = 1; i <= j; i++) {
              if(i<=5-j){
                  System.out.print(" ");
                }else {
                  System.out.print(j);
              }
                System.out.println();
            }
        }
    }
}
