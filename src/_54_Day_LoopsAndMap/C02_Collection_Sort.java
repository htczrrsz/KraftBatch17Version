package _54_Day_LoopsAndMap;

import java.util.*;

public class C02_Collection_Sort {
    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(12, 43, 2, 4, 5, 1, 99, 67);

        List<String> list2 = Arrays.asList("harun", "Ahmet");
        System.out.println(list2.get(0));

        Collections.sort(list2);

        System.out.println(list2.get(0));


//        System.out.println(max(list));  // ---> bunu kullandigimiz icin icerik degisti

        System.out.println(max3(list));

        System.out.println(list);

//        System.out.println(max2(list));

    }

    public static int max(List<Integer> list) {
        Collections.sort(list);
        return list.get(list.size() - 1);
    }




    public static int max3(List<Integer> list) {
        List<Integer> copyList = new ArrayList<>();
        copyList.addAll(list);
        Collections.sort(copyList);
        return copyList.get(list.size() - 1);
    }





//        public static int max2(List<Integer> list) {
//        List<Integer> copyList = new ArrayList<>();
//        Collections.copy(copyList, list);
//        Collections.sort(copyList);
//        return copyList.get(copyList.size() - 1);
//    }



}