import java.util.*;
public class SynchronizedArrayList {
    public static void main(String[] args) {
        List<String>syncal = Collections.synchronizedList(new ArrayList<String>());
        //Adding element to Synchronized ArrayList
        syncal.add("pen");
        syncal.add("Notebook");
        syncal.add("Ink");
        System.out.println("Iterating Synchronized ArrayList: ");
        synchronized (syncal){
            Iterator<String > iterator = syncal.iterator();
            while (iterator.hasNext())
                System.out.println(iterator.next());
        }
    }
}
