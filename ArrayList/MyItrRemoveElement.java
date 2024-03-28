import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyItrRemoveElement {
    public static void main(String[] args) {
        String removeElem ="perl";
        List<String> myList = new ArrayList<String>();
        myList.add("Hello");
        myList.add("Hi");
        myList.add("Java");
        myList.add("Python");
        myList.add("Random");
        myList.add("Ruby");
        myList.add("Play");
        System.out.println("Before Removal");
        System.out.println(myList);
        Iterator<String> itr = myList.iterator();
        while(itr.hasNext()){
            if(removeElem.equals(itr.next())){
                itr.remove();
            }
        }
        System.out.println("After Remove");
        System.out.println(myList);
    }
}
