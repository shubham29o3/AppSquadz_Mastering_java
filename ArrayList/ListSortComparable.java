import java.util.*;
public class ListSortComparable {
    public static void main(String[] args) {
        ArrayList<Empl> list = new ArrayList<Empl>();
        list.add(new Empl("Ram", 3000));
        list.add(new Empl("Tom", 4000));
        list.add(new Empl("Raghu", 5000));
        list.add(new Empl("Lalu", 6000));

        Collections.sort((list));
        System.out.println("Sorted list entries");
        for (Empl e:list){
            System.out.println(e.getSalary());
        }
        Empl e1 = Collections.max(list);
        Empl e2 = Collections.min(list);
        System.out.println(e1.salary);
        System.out.println(e2.salary);
    }
}

class Empl implements Comparable<Empl>{
    String name;
    int salary;
    Empl(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    int getSalary(){
        return salary;
    }
    public int compareTo(Empl e){
        System.out.println("sort");
        if (this.salary>e.salary)
            return 1;
        else if (this.salary<e.salary)
            return -1;
        else
            return 0;
    }
}