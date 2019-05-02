package Methods;

public class HardStuff {
    public static void main(String[] args) {

    }
    public static int getDup(String [] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {

            for (int j = 0; j <= i; j++) {
                String cur = words[j];
                if (words[i].equals(cur)) {
                    continue;
                }

            }
            count++;

        }
        return count;
    }
}
