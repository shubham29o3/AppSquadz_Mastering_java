import java.util.ArrayList;

public class MyArrayListClone {
    public static void main(String[] args) {
        ArrayList<String> arrl = new ArrayList<String>();
        //adding elements in the end
        arrl.add("first");
        arrl.add("second");
        arrl.add("third");
        arrl.add("random");
        System.out.println("Actual ArrayList:" + arrl);
        ArrayList<String> copy = (ArrayList<String>) arrl.clone();
        System.out.println("cloned ArrayList:" + copy);

        if(arrl.get(0) == copy.get(0)){
            System.out.println("Shallow");
        }
        if(arrl!= copy){
            System.out.println("clone");
        }
    }
}
