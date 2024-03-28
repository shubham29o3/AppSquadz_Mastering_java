import java.util.ArrayList;

public class MyArrayListArray {
    public static void main(String[] args) {
        ArrayList<String> arrl = new ArrayList<String>();
        arrl.add("first");
        arrl.add("second");
        arrl.add("third");
        System.out.println("Actual ArrayList:" +arrl);
        String[] strArr = new String[arrl.size()];
        arrl.toArray(strArr);
        System.out.println("Create Array Content:");
        for(String str:strArr){
            System.out.println(str);
        }
    }
}
