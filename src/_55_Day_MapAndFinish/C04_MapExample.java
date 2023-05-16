package _55_Day_MapAndFinish;

import _48_day_OOP_Review.Person;

import java.util.*;

public class C04_MapExample {
    public static void main(String[] args) {


        Ogrenci ogrenci1= new Ogrenci("Harun","Koc",15);

        Ogrenci ogrenci2= new Ogrenci("Ayse","Caliskan",17);

        Ogrenci ogrenci3= new Ogrenci("Hatice","Akilli",18);

        List<Ogrenci> list= new ArrayList<>();
        list.add(ogrenci1);
        list.add(ogrenci2);
        list.add(ogrenci3);


        Map<Integer, Ogrenci> map= new HashMap<>();

        map.put(ogrenci1.getNo(), ogrenci1);
        map.put(ogrenci2.getNo(), ogrenci2);
        map.put(ogrenci3.getNo(), ogrenci3);


        map.get(18).ekleDers("Almanca");
        map.get(17).ekleDers("Ingilizce");

        System.out.println(map.get(17).getIsim());

        System.out.println(map.get(17).getDersler());
        System.out.println(map.get(17));
        System.out.println(map.get(18));




   /*     for (int i = 0; i <list.size() ; i++) {
            if(list.get(i).getNo()==18){
                list.get(i).ekleDers("Almanca");
                break;
            }
        }

        System.out.println(ogrenci3.getDersler());
*/

//        List<Map<Integer,Ogrenci>>  list1= new ArrayList();

        Map<Integer, Ogrenci> ogrenciler= new HashMap<>();
        ogrenciler.put(ogrenci1.getNo(),ogrenci1);
        ogrenciler.put(ogrenci2.getNo(),ogrenci2);
        ogrenciler.put(ogrenci3.getNo(),ogrenci3);


//        Map<Integer, Person> personeller= new HashMap<>();
//        Person person1= new Person();
//        personeller.put(12,person1);


        List < Map> list3= new ArrayList<>();
        list3.add(ogrenciler);

        Map<Integer, String> yeniMap= new HashMap<>();

        yeniMap.put(12,"Harun");
        yeniMap.put(3,"Cicek");

        Map<String, Map <Integer,String>> map1= new TreeMap<>();

        map1.put("1234564",yeniMap);
        System.out.println(map1.get("1234564").get(12).equals("Harun"));




    }
}
