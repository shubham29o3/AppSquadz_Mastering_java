import java.util.*;
public class MyEnumeration {
    public static void main(String[] args) {
        Vector<String> lang = new Vector<String>();
        Enumeration<String> en = null;
        lang.add("java");
        lang.add("c");
        lang.add("phthon");
        lang.add("ruby");
        lang.add("php");
        lang.add("javascript");
        en = lang.elements();
        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
    }
}
