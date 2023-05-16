package _55_Day_MapAndFinish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Loops_Summary {
    public static void main(String[] args) {

//   forEach Loop :

        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(20);
        for (Integer x: list){
            System.out.println(x);
        }



//   any other loop ( for, while, do while) by using get (index) method

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }




        int i=0;
        while (i<list.size()){
            System.out.println(list.get(i));
            i++;
        }
        i=0;



        System.out.println();



        do {
            System.out.println(list.get(i));
            i++;
        } while (i<list.size());






    }
}
