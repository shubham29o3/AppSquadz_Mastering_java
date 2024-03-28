import java.util.ArrayList;
import java.util.Collections;

public class MyArrayListShuffle {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("java");
        list.add("c");
        list.add("python");

        System.out.println("Result before shuffle operation");
        for(String str: list)
            System.out.println(str);
    }
    Collections.shuffle(list);
    System.out.println("result after Shuffle Operation: ");
    for(String str: list){
        System.out.println(str);
    }

    Collections.shuffle(list);
    System.out.println("result after Shuffle Operation: ");
    for(String str: list){
        System.out.println(str);
    }

}
