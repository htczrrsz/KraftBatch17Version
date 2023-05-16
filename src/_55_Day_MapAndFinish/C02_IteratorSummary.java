package _55_Day_MapAndFinish;

import java.util.*;

public class C02_IteratorSummary {
    public static void main(String[] args) {


//      Iterator :  gezici (roaming --> not sure )

//      obje obje obje obje

        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(8);
        set.add(35);
        set.add(27);
        set.add(40);
        set.add(4);


        System.out.println(set);

        Iterator<Integer> iterator= set.iterator();

//      8, 12, 27, 35
//        System.out.println(iterator.next());


        while (iterator.hasNext()){
            if (iterator.next() > 25){
               iterator.remove();
            }
        }

        System.out.println(set);

        System.out.println("-----------------------");

//        while (iterator.hasNext()){              --->   yanliss
//            Integer sayi= iterator.next();              yukardakinde sona geldigi icin burda yaziyor gibi cikti.
//            if (sayi > 25){
//                set.remove(sayi);   -- > sette de sildigi icin siralamasi karisiyor sanirim
//            }
//        }
//
        System.out.println(set);




        set.forEach(x-> System.out.println(x));

        List<String> list = Arrays.asList("Harun", "Ahmet", "Mehmet");

        list.forEach(x-> System.out.println(x+" Hosgeldiniz"));



    }
}
