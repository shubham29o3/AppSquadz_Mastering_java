import java.util.*;
public class ArrayToArrayList {
    public static void main(String[] args) {
        //Array Declaration and Initialization
        String cityname[]={"Agra","Mysore","Delhi","Bangalore"};
        List<String> I = Arrays.asList(cityname);
        //Array to ArrayList Conversion
        ArrayList<String> citylist = new ArrayList<String>(I);

        citylist.add("New City5");
        citylist.add("New City6");

        for(String str: citylist){
            System.out.println(str);
        }
    }
}
