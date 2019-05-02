package ArrayList;

import java.util.ArrayList;

public class ArrayListGeneral {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add("java");
        list.add("Eclipse");
        list.add("Slack");
        list.add(456);
        list.add(true);
        System.out.println(list);

        list.add('a');
        list.add(12.43);
        System.out.println(list);

        System.out.println(list.get(2));// give us element from INDEX()
        System.out.println(list.size());// give us length of element in ArrayList

    }
}
