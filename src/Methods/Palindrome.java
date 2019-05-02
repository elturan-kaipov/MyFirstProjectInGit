package Methods;

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(pal("cihthic"));
        System.out.println();
        System.out.println(anagram("listen", "silent"));
        System.out.println();
        System.out.println(anagramV2("listen", "silent"));

    }
    public static boolean pal(String word){
        boolean found=false;
        for(int i=0; i<word.length(); i++){
            char c=word.charAt(word.length()-(i+1));
            System.out.print(c+" ");

           if(word.charAt(i)!=word.charAt(word.length()-(i+1))){
               found=false;
               break;
           }
            found=true;
        }
        System.out.println();
        return found;
    }

    public static boolean anagram(String str1, String str2){
        boolean found=false;
       str1=str1.toLowerCase();
       str2=str2.toLowerCase();

       if(str1.length()!=str2.length()){
           found=false;
       }else{
           char[] arr1=str1.toCharArray();
           char[] arr2=str2.toCharArray();
           Arrays.sort(arr1);
           Arrays.sort(arr2);

           for(int i=0; i<arr1.length; i++){
               if(arr1[i]==arr2[i]){
                   found=true;
               }
           }

       }
        return found;

    }
    public static boolean anagramV2(String str1, String str2){
        boolean found=false;
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()==str2.length()){
            for( int i=0; i<str1.length(); i++){
                if(str1.contains(str2.substring(i, i+1))){
                    found=true;
                }
            }
        }
          return found;
        }
    }

