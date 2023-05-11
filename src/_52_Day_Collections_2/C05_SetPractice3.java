package _52_Day_Collections_2;

import java.util.*;

public class C05_SetPractice3 {
    public static void main(String[] args) {

        String [] arr= {"Book", "Book", "Notebook", "Pen", "Pencil","Pen","Spoon","Ruler","Phone","Mirror","Phone","Brush"};

        Set<String> uniqueItemsInMyBag= new HashSet<>(Arrays.asList(arr));
        System.out.println(uniqueItemsInMyBag);

        Set<String> uniqueItemsInMyBag2= new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println("uniqueItemsInMyBag2 = " + uniqueItemsInMyBag2);

        Set<String> uniqueItemsInMyBag3= new TreeSet<> (Arrays.asList(arr));
        System.out.println("uniqueItemsInMyBag3 = " + uniqueItemsInMyBag3);  // siralayip yazdirdi

//        arr= uniqueItemsInMyBag3.toArray(new String[0]);  // yeni bir array olusturduk gibi --> uzunluklari farkli oldu ilkiyle zaten
//        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));








    }
}
