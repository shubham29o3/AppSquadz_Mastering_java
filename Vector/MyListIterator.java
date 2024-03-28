import java.util.*;
public class MyListIterator {
    public static void main(String[] args) {
        List<Integer> li = new Vector<Integer>();
        ListIterator<Integer> litr = null;
        li.add(23);
        li.add(98);
        li.add(29);
        li.add(71);
        li.add(5);
        litr = li.listIterator();
        System.out.println("Elements in Forward Direction: ");
        while(litr.hasNext()){
            System.out.println(litr.next());
        }
        System.out.println("Elements in backward Direction");
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }
    }
}