package ForLoop;

public class UtopianTree {
    public static void main(String[] args) {
        int [] growth={-1,0,1,2,1,0,2,0,2,1};
        int cm=0;
        for(int i=0; i<growth.length;i++){
            if(i<3){
                growth[i+1]=growth[i]+1;
                System.out.println("Year "+(i+1)+" growth 1 cm");
                System.out.println("Tree size: "+growth[i+1]+" cm");
            }else{
                growth[i+1]=growth[i]+2;
                System.out.println("Year "+(i+1)+" growth 2 cm");
                System.out.println("Tree size: "+growth[i+1]+" cm");
            }
            if(growth[i+1]==10){
                break;
            }
        }
    }
}
