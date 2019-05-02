package Arrays;

public class CopySomeValues {
    public static void main(String[] args) {
        String [] arr={"zero", "one", "two", "three", "four"};

        int count=0;
        for(String str:arr){
            if(str.contains("e")){
                count++;
            }
        }
        System.out.println(count);
        String [] fewValues=new String[count];
        int i=0;
        for(String each:arr){
            if(each.contains("e")){
                fewValues[i]=each;
                i++;
            }
        }
        for(String val:fewValues){
            System.out.print(val+" ");
        }
    }
}
