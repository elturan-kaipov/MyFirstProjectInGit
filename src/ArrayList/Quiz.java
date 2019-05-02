package ArrayList;

        import java.util.ArrayList;
        import java.util.List;

public class Quiz {

    List<String> list = new ArrayList<String>();
    List<String> list2 = new ArrayList<String>();

    public List<String> method(List<String> list)
    {
        list.add("a");
        list.add("b");
        return list;
    }
    public static void main(String[] args)
    {
        Quiz newList = new Quiz();
        newList.list2 = newList.method(newList.list);
        newList.list.add("c");
        newList.list.add("d");
        System.out.println(newList.list2);
    }
}
