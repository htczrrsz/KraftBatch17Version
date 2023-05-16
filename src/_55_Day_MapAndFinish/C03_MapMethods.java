package _55_Day_MapAndFinish;

import java.util.*;

public class C03_MapMethods {
    public static void main(String[] args) {


//         put() ,get(),values(),keySet(),clear(),containsKey(),remove(),entrySet(),equals(),forEach(),isEmpty()
//         putAll(),replace()

//  put:
           Map <Integer, String> map= new TreeMap<>();  //  keylere gore dogal siralama
           map.put(12,"Harun koc");
           map.put(13,"Ziya Aslan");


        Map <Integer, String> map2= new TreeMap<>();

//  get:

           System.out.println(map.get(13));


//  values:

        System.out.println(map.values());

        Collection<String> collection = map.values();
        System.out.println(collection);


//  keySet:   key leri yazdirir.

        Set<Integer> set= map.keySet();

        List<Integer> list= new ArrayList<>();

        System.out.println(set);

        set.forEach(x-> list.add(x));
        Collections.sort(list);

        System.out.println(Collections.max(map.keySet()));  //  ONEMLI !
//        Integer id2= list.get(list.size()-1)+1;

        Integer id= Collections.max(map.keySet())+1;
        map.put(id,"Ayse yilmaz");

        System.out.println(map);


//  clear :  hepsini temizler

//        map.clear();

//  containsKey:   true/false

       map.containsKey(12);


//  remove  :  object key ||  object key, value

//        System.out.println(map.remove(12));  // hem siliyor hem sildigini donduruyor.  String dondurur cunku remove key metodu

//        System.out.println(map.remove(13, "Ziya Aslan"));  // true/false dondurur.
        System.out.println(map);


//  entrySet :
        System.out.println(map.entrySet());  // { icinde neler varsa onlari yazdirir }

//  equals :   iki ayri map ler birbirine esit mi ona bakiyor

//  forEach :

    map.forEach((k,v) ->System.out.println("Key: " + k + " value: " + v));


//  putAll :
        map2.putAll(map);
        System.out.println(map2);
        map.putAll(map2);
        System.out.println(map);


//  replace:  2 parametrelide String, 3 olanda true/false

        Map <Integer, String> map3= new TreeMap<>();  //  keylere gore dogal siralama
        map3.put(12,"Harun koc");
        map3.put(13,"Ziya Aslan");

        System.out.println(map3.replace(12, "Ayse yilmaz")); // eski veriyi dondurur yani String --> harun koc yazar, islemi yapar
//                                                          veriyi bulamazsa null der.

        System.out.println(map3.replace(12, "Ayse yilmaz", "Emine Hanim")); // true false

        System.out.println(map3);




    }
}
