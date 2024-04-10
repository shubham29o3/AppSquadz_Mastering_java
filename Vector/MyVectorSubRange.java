import java.util.*;
public class MyVectorSubRange {
    public static void main(String[] args) {
        Vector<String> vct = new Vector<String>();
        vct.add("First");
        vct.add("Second");
        vct.add("Third");
        vct.add("Random");
        vct.add("Click");
        System.out.println("Actual Vector : " +vct);
        List<String> list = vct.subList(1,4);
        System.out.println("Sub List : " +list);
    }
}
