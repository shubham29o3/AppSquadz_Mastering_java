import java.util.*;
public class MyVectorArrayCopy {
    public static void main(String[] args) {
        Vector<String> vct = new Vector<String>();
        vct.add("first");
        vct.add("second");
        vct.add("third");
        vct.add("random");
        System.out.println("Actual Vector:" +vct);
        String[] copyArr = new String[vct.size()];
        vct.toArray(copyArr);
        System.out.println("Create Array Content:");
        for(String str:copyArr){
            System.out.println(str);
        }
    }
}
