package _51_Day_Collection_List;

import java.util.*;

public class C03_List {
    public static void main(String[] args) {


//      collection tipi interface
//      parent type                altsiniflardan birini koyariz
        List<Integer> list1= new ArrayList<>();
        list1.addAll(Arrays.asList(5,10,15,20,25));

        list1.add(5);
        System.out.println("list1 = " + list1);
        System.out.println("list1.get(3) = " + list1.get(3)); // arrayList is better than linkedList wrt get() feature


        System.out.println();

        List<Integer> list2= new LinkedList<>();
        list2.addAll(Arrays.asList(5,10,15,20,25));

        list2.add(9);
        list2.remove(list2.indexOf(9));   // linkList is faster than arrayList wrt add() and remove()

        List<Integer> list3= new ArrayList<>();
        list3.addAll(Arrays.asList(5,10,15,20,25));


        List<Integer> list4= new Stack<>();
        list4.addAll(Arrays.asList(5,10,15,20,25));
        System.out.println("list4.get(2) = " + list4.get(2));


        //                   downcasting yaptik.
        System.out.println("((Stack)list4).pop() = " + ((Stack) list4).pop());  // LIFO --> 25 i atti
        System.out.println(list4);

        System.out.println(((Stack) list4).push(60));    // LIFO
        System.out.println(list4);


    }
}
