package _52_Day_Collections_2;

import java.util.HashSet;
import java.util.*;

public class C04_SetPractice2 {
    public static void main(String[] args) {


        String str= "Yattın mi \n" +
                "Yorgun musun\n" +
                "Uyu düşünme beni\n" +
                "Ben ki hiç düşünulmmedim senden öncesileri" ;

        // bu String icinde kac farkli harf var ?


        System.out.println("uniqueLetterCount() = " + uniqueLetterCount(str));

        System.out.println("uniqueLetterCount2(str) = " + uniqueLetterCount2(str));
    }

    public static int uniqueLetterCount(String str){
      String[] arr =  str.replace(" ","").split("");
      Set<String> uniqueCharSet= new HashSet<>();
        for (int i = 0; i < arr.length ; i++) {
            uniqueCharSet.add(arr[i]);
        }
        return uniqueCharSet.size();


    }



    public static int uniqueLetterCount2(String str){
        String[] arr =  str.replace(" ","").split("");
        Set<String> uniqueCharSet2= new HashSet<>(Arrays.asList(arr));
//        for (int i = 0; i < arr.length ; i++) {
//            uniqueCharSet2.add(arr[i]);
//        }
        return uniqueCharSet2.size();


    }



}
