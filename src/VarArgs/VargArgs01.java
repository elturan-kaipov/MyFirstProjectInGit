package VarArgs;

public class VargArgs01 {
    public static void main(String[] args) {
        sum(10,20);
        sumAll(10,29,39);
        sumAll(-21, 21, 10,20);
        shoppingList("Apple", "Banana", "Eggs", "Bread");

    }
    public static void sum(int n1, int n2){
        System.out.println(n1+n2);
    }
    public static void sumAll(int... nums){
        System.out.println("Number of inputs: "+nums.length);
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        System.out.println("Sum: "+sum);
    }
    public static void shoppingList(String... strs){
        System.out.print("Shopping list: ");
        for(String str:strs){
            System.out.print(str+" ");
        }
        System.out.println();
    }
}
