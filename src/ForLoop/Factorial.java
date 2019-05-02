package ForLoop;

public class Factorial {
    public static void main(String[] args) {
        Factorial(4);
    }
    public static void Factorial(int num){
        int sum=1;
        if(num<0){
            System.out.println("negative number");
        }else if(num==0){
            System.out.println(1);
        }else {
            for (int i=1; i<=num; i++){

                    sum*=i;

            }
            System.out.println(sum);
        }
    }
}
