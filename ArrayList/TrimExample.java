import java.util.*;
public class TrimExample {
    public static void main(String[] args) {
        Vector<Integer> arraylist = new Vector<Integer>();
        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(3);
        arraylist.add(4);
        arraylist.add(5);
        arraylist.add(6);

        arraylist.trimToSize();
        System.out.println(arraylist.capacity());
        System.out.println(arraylist);
    }
}
