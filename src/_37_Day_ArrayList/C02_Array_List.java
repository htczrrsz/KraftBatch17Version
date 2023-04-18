package _37_Day_ArrayList;

import _21_Day_Class_And_Project.Person;

import java.util.ArrayList;

public class C02_Array_List {
    public static void main(String[] args) {


        ArrayList<String> arrList =new ArrayList<>();
        arrList.add("Harun");  // boolean
        arrList.add("Ziya");

     //   System.out.println(arrList.isEmpty());

      //  arrList.clear();

       // System.out.println(arrList.isEmpty());

        System.out.println(arrList.get(0));
   //     System.out.println(arrList.get(2));  hata. index of bound exception hatasi

        System.out.println(arrList.size());  // kac tane oldugunu gosterir. arraylistin uzunlugunu verir

        arrList.remove(1);
        arrList.add(0,"Mehtap");
        System.out.println(arrList);
        arrList.add(1,"Umit");
        System.out.println(arrList);

        arrList.set(1,"Emine");
        System.out.println(arrList);


        // indexOf

        System.out.println(arrList.indexOf("Emine"));

        // get  get(0) 0. indeksi getir

        // clear  siler.


    }



}
