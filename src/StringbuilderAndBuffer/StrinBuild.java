package StringbuilderAndBuffer;

public class StrinBuild {
    public static void main(String[] args) {
        System.out.println(str(new String[]{"a", "b", "c"}));
        StringBuilder strs=new StringBuilder("true, false");

        boolean found=toBe(strs);
        System.out.println(found);

        String [] arrs=new String[]{"abc", "foo bar", "123"};
        StringBuilder str=trimPost(arrs, 5);
        System.out.println(str);

    }
    public static StringBuilder str(String[] arr){
        StringBuilder ret=new StringBuilder();
        for(String s:arr){
            ret.append(s);
        }
        return ret;
    }
    public static boolean toBe(StringBuilder strs) {
        String str = strs.toString();
        String[] arr = str.split(",");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase("true")) {
                return true;
            }
        }
        return false;
    }

    public static StringBuilder trimPost(String[] arrs, int num){
        StringBuilder strs=new StringBuilder();
        for(int i=0; i<arrs.length; i++) {
            if (arrs[i].length() <= num) {
                strs.append(arrs[i] + "<br>");
            } else {
                continue;
            }
        }
        return strs;
    }
    }

