package _38_Day_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class C03_BulkOperations {
    public static void main(String[] args) {


        ArrayList<Integer> list1= new ArrayList<>();




        ArrayList<Integer> list= new ArrayList<>();



        list1.addAll(list);




        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(40);
        list.add(50);
        list.add(10);


        ArrayList<Integer> list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,3,3,4,2,2,1,1,1,1,1));

        System.out.println("list2 = " + list2);

        list2.removeAll(Arrays.asList(1,2,3));

        System.out.println("list2 = " + list2);

        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,3,3,3,2,2,2,1,1,1));
        System.out.println("list2 = " + list2);

        list2.retainAll(Arrays.asList(1,2,3));   // bunlar haric digerlerini cikar.
        System.out.println("list2 = " + list2);

    }




}
