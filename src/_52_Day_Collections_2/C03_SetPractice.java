package _52_Day_Collections_2;

import java.util.*;

public class C03_SetPractice {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90));
        list.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90));
        list.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90));
        list.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90));
        System.out.println("list = " + list);
        System.out.println("list.get(3) = " + list.get(3));

        System.out.println("----------------------------------------");


        
//      !!!!  HashSet  !!!!

        Set<Integer> hashSet= new HashSet<>();
        hashSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,100));
        hashSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,100));
        hashSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,100));
        hashSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,100));
        hashSet.addAll(Arrays.asList(null,null,null,null));   // null girilebiliyor, bir tane aliyor tum setlerde oldugu gibi
        System.out.println("hashSet = " + hashSet);     //       hashcodelarina gore -->  bize gore random

        System.out.println();



//      !!!!  LinkedHashSet  !!!!

        Set<Integer>linkedHashSet= new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,100));
        linkedHashSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,100));
        linkedHashSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,100));
        linkedHashSet.addAll(Arrays.asList(null,null));    // bu da null kabul ediyor
        System.out.println("linkedHashSet = " + linkedHashSet); //    giris sirasini muhafaza ediyor. (insert order preserved)

        System.out.println();



//      !!!!  TreeSet  !!!!

        Set<Integer> treeSet= new TreeSet<>();
        treeSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,100));
        treeSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,100));
        treeSet.addAll(Arrays.asList(10,200,30,400,50,600,70,15,90,100));
//      treeSet.addAll(Arrays.asList(null,null,null));      // runtime error --> null kabul etmiyor (does not accept null values)
        System.out.println("treeSet = " + treeSet);      //      siralayarak yazar  -->  sorted ascending (artan sekilde)












    }
}
