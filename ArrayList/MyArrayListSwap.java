import java.util.ArrayList;
import java.util.Collections;

public class MyArrayListSwap {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Hello");
        list.add("Hi");
        list.add("Happy");
        list.add("Good");
        list.add("Morning");
        System.out.println(list);
        Collections.swap(list,2,5);
        System.out.println("Result after swap Operation: ");
        for (String str: list){
            System.out.println(str);
        }
    }
}
