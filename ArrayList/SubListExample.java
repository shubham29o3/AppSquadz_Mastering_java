import java.util.ArrayList;
import java.util.List;

public class SubListExample {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        //Adding Elements to ArrayList
        al.add("Amit");
        al.add("Lalu");
        al.add("Ram");
        al.add("Shyam");
        al.add("Raghu");

        System.out.println("Original ArrayList Content: " +al);

        //Sublist to ArrayList
        ArrayList<String> al2 = new ArrayList<String>(al.subList(1,4));
        System.out.println("Sublist stored in ArrayList : " +al2);

        //Sublist to list
        List<String>list = al.subList(1,4);
        System.out.println("Sublist stored in List: " +list);
    }
}
