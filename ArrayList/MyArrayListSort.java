import java.util.*;
public class MyArrayListSort {
    public static void main(String[] args) {
        ArrayList<Empl> list = new ArrayList<Empl>();
        list.add(new Empl("Ram", 3000));
        list.add(new Empl("Tom", 4000));
        list.add(new Empl("Raghu", 5000));
        list.add(new Empl("Lalu", 6000));

        //Collections.sort(List l, Comparator c);
        Collections.sort(list,new MySalaryComp());
        System.out.println("Sorted List entries: ");
        for(Empl e: list){
            System.out.println(e.getSalary());
        }
        Collections.sort(list, new MyNameComp());
        for (Empl e:list){
            System.out.println(e.name);
        }
    }
}

class MySalaryComp implements Comparator<Empl>{
    public int compare (Empl e1, Empl e2){
        if(e1.getSalary()> e2.getSalary()){
            return 1;
        }
        else {
            return -1;
        }
    }
}

class MyNameComp implements Comparator<Empl>{
    public int compare(Empl e1, Empl e2){
        return e1.name.compareTo(e2.name);
    }
}

class Empl{
    String name;
    int salary;
    Empl(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    int getSalary(){
        return salary;
    }
}