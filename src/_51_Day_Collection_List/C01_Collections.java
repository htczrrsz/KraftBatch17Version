package _51_Day_Collection_List;

import java.util.*;

public class C01_Collections {
    public static void main(String[] args) {





    /*
     Collection  nesneleri objeleri bir arada tutan yapilar
     Karsilasilan, istenilen durumlara gore kullanilan collection yapilari farklilik gosterir.
     Hangi collection tipini kullanacagimizi belirleriz.

     3 ana collection tipi var
       1- List  : Arraylist, LinkedList, Vector (Stack)
       2- Queue : Priority Que, Arrayque
       3- Set   : hashSet, linkedHashSet, treeSet

       interfacelerden obje olusturamadigimiz icin child classlarin constructorlarini kullanarak objeler olusturuyoruz.



     */


        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
//      arr[4] = 5;  ---> ArrayIndexOutOfBoundException   runtime

        System.out.println(Arrays.toString(arr));



//        List<String > coll1= new List<String>();  ---> interface oldugu icin obje olusturamiyoruz.

        List<String > coll2= new ArrayList<>();      // interfacelerden objeleri child classlari kullanarak olustururuz.
        List<Objects> coll3= new LinkedList<>();

        Queue<String> coll4= new LinkedList<>();
        Queue<String> coll5= new PriorityQueue<>();

        List<String>  coll6= new Stack<>();
        List<String>  coll7= new Vector<>();


        Set<String>  coll8= new HashSet<>();
        Set<String>  coll9= new LinkedHashSet<>();
        Set<String>  coll10= new TreeSet<>();






    }
}
