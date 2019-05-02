package Methods;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println(wordCount("Foo bar" ));
        System.out.println(words("foo bar", "foo"));
        System.out.println(at3("asdc", 3));
        System.out.println(cut3("foobar", "foo"));
    }
    public static int wordCount(String word){
        String [] split=word.split(" ");
        int count=0;
        for(String w:split){
            count++;
        }
        return count;
    }
    public static String words(String text, String badWord){
        String newStr=text.replace(badWord, "");

        return newStr;
    }
    public static String at3(String word, int num){
        String str=word.substring(0, num);
        return str;
    }
    public static String cut3(String word1, String word2){
        return word1.substring(0,3).concat(word2).concat(word1.substring(3));
    }


}
