package _54_Day_LoopsAndMap;

import java.util.*;

public class C01_Loops_Iterator {
    public static void main(String[] args) {


        // 25den kucuk olan sayilari sil ekrana yazdirin.

        List<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(35);
        list.add(8);
        list.add(14);
        list.add(56);
        list.add(4);

        System.out.println(list);

        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i)<25){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);





        Set<Integer> set = new HashSet<>();
        set.add(25);
        set.add(35);
        set.add(8);
        set.add(14);

//        fori kullanamayiz , index no yok, sirasiyla yazmadigi icin.

//        for (Integer sayi : set) {
//            System.out.println(sayi);
//        }



//  set icerisinden 25ten kucuk olanlari silin ve seti ekrana yazdirin.

//        Set<Integer> set1 = new HashSet<>();
//        for (Integer sayi:set){
//            if (sayi>=25){
//                set1.add(sayi);
//            }
//        }
//        System.out.println(set1);


        // yeni bir set olusturmadan bu islemi yapin. --> iterator ile yapilir.


//        for (Integer sayi1: set){
//            if (sayi1<25){
//               continue;
//            }
//            System.out.print(sayi1+" ");
//        }

        System.out.println();



//  ITERATOR    --> genelde while ile kullanilir

        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()){
            Integer sayi= iterator.next();
            if (sayi<25){
                iterator.remove();
            }
        }
        System.out.println(set);




        List<String> list1= Arrays.asList("Harun","Ahmet","Hasan");
        Iterator itr= list1.iterator();
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.hasNext());

//      System.out.println(itr.next());   exception verir. tekrar gezmiyor cunku.


        System.out.println();

//   forEach method :

        List<String> list2= Arrays.asList("Harun","Ahmet","Hasan");

//        for (String str: list2){
//            System.out.println(str);
//        }



        System.out.println();


    list2.forEach(str-> System.out.print(str+" "));

        System.out.println();

    set.forEach(y-> System.out.print(y+" "));
        System.out.println();
    set.forEach(y-> System.out.print(y-2+" "));
        System.out.println();


    List<Integer> list4= new ArrayList<>();
    set.forEach(y-> list4.add(y));
        System.out.println(list4);






    }
}
