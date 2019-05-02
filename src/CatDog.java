import java.util.Scanner;

public class CatDog {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word");
        String word=scan.nextLine();
        boolean found=false;
        int countCat=0;
        int countDog=0;
        for(int i=0; i<word.length()-2; i++) {
            if (word.charAt(i) == 'c' && word.charAt(i + 1) == 'a' && word.charAt(i + 2) == 't') {
                countCat++;
            } else if (word.charAt(i) == 'd' && word.charAt(i + 1) == 'o' && word.charAt(i + 2) == 'g') {
                countDog++;
            }
        }
            if(countCat==countDog){
                found=true;
            }

        System.out.println(found);
    }
}
