package _52_Day_Collections_2;

import java.util.*;

public class C01_ListPalindrom {
    public static void main(String[] args) {


        //list içerisinde bulunan palindrom (terside kendisi ile ayni olan kelimeler)
        // kelimeleri ekrana yazdıran metodu yazınız.
        //kaşık,adanada,kazak,radar,ses,harun
        //adanada,kazak,radar,ses

        //list içerisinde bulunan polindrom (terside kendisine ayni  olan kelimeler) kelimeleri string olarak donen
        // metodu yazınız.(aynı kelimeleri ekrana yazma-sın)


        List<String> list= new ArrayList<>();
        list.addAll(Arrays.asList("kazik","adanada","kazak","radar","ses","harun","ses","radar"));


        System.out.println(findPalindromeInList(list));

//        Set<String> list1= new HashSet<>();
//        list1.addAll(list);
//        System.out.println("list1 = " + list1);


    }



    public static String findPalindromeInList (List<String> list) {
        Set<String> list1 = new HashSet<>();
        list1.addAll(list);
        String result = "";
        for (int i = 0; i < list1.size(); i++) {
            String str = list.get(i);
            String reverse = "";
            for (int j = str.length() - 1; j >= 0; j--) {
                reverse += str.charAt(j);
            }
            if (str.equalsIgnoreCase(reverse)) {
                result += str + " ";
            }
        }
        return result;
    }




   // public static String findPalindromeInList (List<String> list){
//        Set<String> list1= new HashSet<>();
//        list1.addAll(list);
//      String result="";
//        for (int i = 0; i < list.size(); i++) {
//            String str= list.get(i);
//            String reverse="";
//            for (int j = str.length()-1; j >=0 ; j--) {
//                reverse+=str.charAt(j);
//            }
//            if (str.equalsIgnoreCase(reverse)){
//                result+=str+" ";
//                list.removeAll(Arrays.asList(str));
//                i--;
//
//            }
//        }
//
//      return result;
//    }







}
