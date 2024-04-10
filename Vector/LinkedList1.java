import java.util.*;
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList<>();
        ll1.add(11);
        ll1.add(22);
        ll1.add(33);
        ll1.add(44);
        ll1.add(22);
        ll1.add(2,66);
        System.out.println(ll1);
        System.out.println(ll1.getFirst());
        System.out.println(ll1.getLast());
        System.out.println(ll1.get(3));
        System.out.println(ll1.indexOf(44));
//        ll1.clear();
//        int pp = ll1.getLast();
        System.out.println(ll1);
        System.out.println(ll1.lastIndexOf(22));
        ll1.offerFirst(1); //if there is no restriction then it will add, if there is restriction it will not add, like capacity restriction it will add
        ll1.offerLast("last");
        System.out.println(ll1);
        ll1.addFirst("addfirst");  // this will make sure the object is added in the first index
        ll1.addLast("addlast");
        System.out.println(ll1);
        System.out.println(ll1.peekFirst());
        System.out.println(ll1);
        System.out.println(ll1.pollFirst()); // this will display the first element then remove it fromm the LinkedList
        System.out.println(ll1);
        System.out.println("*********************************************");

        PriorityQueue pq = new PriorityQueue<>();
        pq.add(500);
        pq.add(620);
        pq.add(750);
        pq.add(780);
        pq.add(190);
        System.out.println(pq); //Min Heap Data Structure
    }
}
