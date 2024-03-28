import java.util.*;
public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<String> listofcity = new ArrayList<String>();
        listofcity.add("agra");
        listofcity.add("delhi");
        listofcity.add("banglore");
        listofcity.add("hydrabad");

        System.out.println("Before Sorting");
        System.out.println(listofcity);
        for (String counter: listofcity){
            System.out.println(counter);
        }

        Collections.sort(listofcity);

        System.out.println("After Sorting");
        System.out.println(listofcity);
        for (String counter: listofcity){
            System.out.println(counter);
        }
    }
}
