package _38_Day_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class C02_RemoveDuplicates {
    public static void main(String[] args) {


        ArrayList<Integer> list= new ArrayList<>();
    //    System.out.println(list.size());

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

        System.out.println(list);
        System.out.println(list.size());


        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list) {
            if (result.contains(each)){
               continue;
            }
            result.add(each);

        }
        System.out.println("result = " + result);




    }


}
