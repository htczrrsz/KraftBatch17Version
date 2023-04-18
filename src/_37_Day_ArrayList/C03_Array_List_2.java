package _37_Day_ArrayList;

import java.util.ArrayList;

public class C03_Array_List_2 {
    public static void main(String[] args) {

        // removeAll


        ArrayList<String> arrList = new ArrayList<>();

        arrList.add("Harun");
        arrList.add("Ziya");
        arrList.add("Mehtap");
        arrList.add("Sami");

        ArrayList<String > arrList2 = new ArrayList<>();
        arrList2.add("Ziya");

        arrList.removeAll(arrList2);

        System.out.println(arrList);


        System.out.println("---------------------------------------");






    }



}
