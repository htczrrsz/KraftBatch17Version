package _37_Day_ArrayList;

import java.util.ArrayList;

public class C06_Odev {
    public static void main(String[] args) {

     ArrayList<Integer> newArrayList = new ArrayList<>();
     newArrayList.add(1);
     newArrayList.add(2);
     newArrayList.add(3);
     newArrayList.add(4);
     newArrayList.add(5);

        System.out.println(dondur(newArrayList,3));
        System.out.println(newArrayList);


    }

    // yeni bi arrayList olustur icerisine 5 adet sayi ekle
    // dondur(int x) x kadar sayilari kendi icerisinde dondursun.
    // 1 2 3 4 5        dondur(int 1)  51234
    //                  dondur(int 2)  34512  yeni bir arrayList dondur.



    public static ArrayList<Integer> dondur(ArrayList<Integer> arrayList, int x){

        return arrayList;
    }



    // squared(listOfNums); metodu ile degerleri kendi ile carpan list i dondurun.



    // ArrayList<Integer> myList = getList(20); // return method System.out.println(myList);
    //[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20]







}
