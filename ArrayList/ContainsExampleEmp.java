import java.util.ArrayList;

public class ContainsExampleEmp {
    public static void main(String[] args) {
        ArrayList<Emp1> list = new ArrayList<Emp1>();
        Emp1 e2 = new Emp1(1001);
        //list.add(new Emp1(1001));
        list.add(new Emp1(1002));
        list.add(new Emp1(1003));
        list.add(new Emp1(1004));
        list.add(new Emp1(1005));
        list.add(new Emp1(1001));
        //list.add(new Emp1(1001));
        System.out.println("Actual List:");
        for(Emp1 e: list){
            System.out.println(e.id);
        }
        System.out.println("ArrayList contains the id 1001" + list.contains(e2));
    }
}

class Emp1{
    int id;
    Emp1(int id){
        this.id= id;
    }
    public boolean equals(Object o){
        System.out.println("check");
        Emp1 e = (Emp1)o;
        if(this.id == e.id)
            return true;
        else
            return false;
    }
}
