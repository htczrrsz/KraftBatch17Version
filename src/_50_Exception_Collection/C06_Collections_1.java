package _50_Exception_Collection;

import _48_day_OOP_Review.Person;

import java.util.ArrayList;
import java.util.Objects;

public class C06_Collections_1 {
    public static void main(String[] args) {


        ArrayList<Person> arrayList= new ArrayList<>();

        Person person1= new Person("Harun",25,'E');
        Person person2= new Person("Mehmet",25,'E');
        Person person3= new Person("Ahmet",25,'E');

        arrayList.add(person1);
        arrayList.add(person2);
        arrayList.add(person3);
      //  arrayList.add("Harun"); obje kabul ediyor String degil, o yuzden olmaz.







        ArrayList<Integer> arrayList1= new ArrayList<>();
        arrayList1.add(25);
        arrayList1.add(25);
        arrayList1.add(35);

        ArrayList<Integer> arrayList2= new ArrayList<>();
        arrayList2.add(25);
        arrayList2.add(45);
        arrayList2.add(55);
     //   System.out.println(arrayList1.addAll(arrayList2));

//            arrayList1.clear();
//        arrayList1.remove(0);
//        arrayList1.removeAll(arrayList2);
//        System.out.println(arrayList1.get(0));

        




    }
}
