package StringbuilderAndBuffer;

public class AppendAlphabet {
    public static void main(String[] args) {
        char ch='A';
        ch++;
        System.out.println(ch);

        StringBuilder alpha=new StringBuilder();
        for(char chars='A'; chars<='Z'; chars++){
            alpha.append(chars);
        }
    }
}
