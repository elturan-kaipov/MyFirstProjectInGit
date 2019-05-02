public class ToCharAr {
    public static void main(String[] args) {
        String word="diamondring";
        char [] letters=word.toCharArray();
//        for(char letter:letters){
//            System.out.println(letter);
//        }

        for(int i=letters.length-1; i>=0; i--){
            System.out.print(letters[i]);
        }

    }
}
