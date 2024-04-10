import java.util.*;
public class MyVectorNewCollection {
    public static void main(String[] args) {
        Vector<String> vct = new Vector<String>();
        vct.add("one");
        vct.add("two");
        vct.add("three");
        vct.add("four");
        System.out.println("Actual Vector : " + vct);
        List<String> list = new ArrayList<String>();
        list.add("first");
        list.add("second");
        list.add("third");
        vct.addAll(list);
        System.out.println("After Copy : " + vct);
    }
}
