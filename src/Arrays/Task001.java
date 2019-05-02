package Arrays;

public class Task001 {
    public static void main(String[] args) {
        String a = "aaaa";
        char arra[] = a.toCharArray();
        String b = "bbbb";
        char arrb[] = b.toCharArray();
        int i = 0;
        for (char c : arra) {
            if (i % 2 == 0) {
                arrb[i] = c;
            }
            i++;
        }
        String ab=new String(arrb);
        System.out.println(ab);
    }


    }


