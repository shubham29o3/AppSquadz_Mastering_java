import java.util.Vector;

public class EnsureCapacityExample {
    public static void main(String[] args) {
        //ArrayList with capacity 4
        //ArrayList<String> al = new ArrayList<String>(4);
        Vector<String> al = new Vector<String>(4);
        System.out.println(al.capacity());
        //Added 4 elements
        al.add("Hi");
        al.add("Hello");
        al.add("Bye");
        al.add("Good");

        //Increase Capacity(76)
        al.ensureCapacity(76);
        System.out.println(al.capacity());
        System.out.println(al);
        al.add("new");
        al.add("new");
        al.add("new");
        //System.out.println(al.capacity());
        //System.out.println(al);
        for(String temp: al){
            System.out.println(temp);
        }
        System.out.println(al.capacity());
    }
}
