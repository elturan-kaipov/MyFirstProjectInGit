package Arrays;

public class ConcatDoubleFromArray {
    public static void main(String[] args) {
//        double[] d=new double[]{0.2, 0.3, 1.0, 1.5, 2.0};
//        //System.out.println(d_r[2]+d_r[3]);
//
//        for(int i=0; i<d.length-1; i++){
//            if(d[i]+d[i+1]==2.5){
//                System.out.println(d[i]+d[i+1]);
//            }
//        }
//        int [] num=new int[]{5,4,3,7,8,11};
//        int sum=0;
////        for(int n:num){
////            System.out.println(n);
//       // }
//        for(int i=0; i<=num.length-1; i++){
//            System.out.println(num[i]);
//            sum+=num[i];
//        }
//        System.out.println(sum);

        String[] list=new String[]{"ba","app","pin","ba","man","banana"};
        int count=0;

        for(int i=0; i<list.length;i++){
            if(list[i].contains("ba")){
                count++;
            }
        }
        System.out.println(count);
    }
}
