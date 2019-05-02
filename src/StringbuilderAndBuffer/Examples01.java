package StringbuilderAndBuffer;

public class Examples01 {
    public static void main(String[] args) {
        StringBuilder stb1 = new StringBuilder("Halloween");
        System.out.println(stb1);

        StringBuilder stb2 = new StringBuilder();
        //  stb2+"Java"// + operator will not work

        stb2.append("Java");
        stb2.append(" programming");
        stb2.append(" is the best");
        System.out.println(stb2);

        StringBuilder listBuilder = new StringBuilder("Wooden Spoon");
        listBuilder.append(", iron Spoon");
        System.out.println(listBuilder);
        listBuilder.append('i');
        System.out.println(listBuilder);
        listBuilder.append(100);
        System.out.println(listBuilder);

        StringBuilder letters = new StringBuilder("ABCDEFGHIJKLM");
        letters.append("KKK WW");
        System.out.println(letters);

        letters.delete(0, 3);
        System.out.println(letters);

        letters.delete(5, 100);
        System.out.println(letters);

        StringBuilder sentence = new StringBuilder("Hello");
        sentence.reverse();
        System.out.println(sentence);

        sentence.deleteCharAt(0);
        System.out.println(sentence);
        sentence.deleteCharAt(sentence.length()-1);
        System.out.println(sentence);

        StringBuilder word=new StringBuilder("keyboard");
        word.insert(3, "-");
        System.out.println(word);

        StringBuilder word1=new StringBuilder("SeleniumAutomation");
        word1.insert(8, " test ");
        System.out.println(word1);

        StringBuilder word3=new StringBuilder("Hello John");
        word3.replace(6,word3.length(), "Don");
        System.out.println(word3);

        String convertedFromSB= String.valueOf(word3);
        System.out.println(convertedFromSB);







    }
}
