package _54_Day_LoopsAndMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {


//      Map map =new HashMap();   // 1. jenerasyon

//         key,   value
        Map<String, String> map = new HashMap<>();

       map.put("12345", "Harun");   // olusturmak icin  -->  put
       map.put("123456","Harun2");
       map.put("1234567","Harun3");

        System.out.println(map.get("12345")); //    cagirmak icin -->  key
        System.out.println(map.get("123456"));


        Map<String , Double> meyveFiyat= new TreeMap<>();
        meyveFiyat.put("Elma", 3.75);
        meyveFiyat.put("Elma", 3.90);  //  artik bunu alir oncekini almaz.
        meyveFiyat.put("Muz", 56.90);
        meyveFiyat.put("Cilek", 50.0);
        meyveFiyat.put("Armut", 30.30);

//        meyveFiyat.remove("Elma");   //  tum elmalari sildi.  clear dersek tum meveler silinir.
        System.out.println(meyveFiyat);  //   --> suslu parantezlerle yazdi --> Map i temsiz eder, koseliler array i.
        System.out.println(meyveFiyat.get("Muz"));

        System.out.println(meyveFiyat.containsKey("Elma"));    //  --> true or false
        System.out.println(meyveFiyat.containsValue("Muz"));  //  false

        System.out.println();

        Set<String> set = meyveFiyat.keySet();
        set.forEach(x-> System.out.println(x));

        for (String str : set){
            System.out.println(meyveFiyat.get(str));

        }




//        {

//      map -->   key,   value
//              "Count": 12345
//        }




    }
}