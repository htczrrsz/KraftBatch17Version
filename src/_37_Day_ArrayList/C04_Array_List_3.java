package _37_Day_ArrayList;

import java.util.ArrayList;

public class C04_Array_List_3 {
    public static void main(String[] args) {


        ArrayList<Integer> listOfNums = new ArrayList<>();
        listOfNums.add(5);
        listOfNums.add(10);
        listOfNums.add(15);
        listOfNums.add(20);
        listOfNums.add(25);
        listOfNums.add(25);
        listOfNums.add(100);
        listOfNums.add(100);
        listOfNums.add(500);


        printListOfNumbers(listOfNums);
        System.out.println();
        System.out.println(duplicate(listOfNums));




    }
// 5,10,15,20,25,25,100,100,500 rakamlarini listOfNums isimli bir ArrayListe atın ve
//printListNumbers(listOfNums); methodu ile yazdıralım.

    public static void printListOfNumbers (ArrayList arrList){
        for (int i = 0; i <arrList.size() ; i++) {
            System.out.print(arrList.get(i)+" ");
        }
    }



    // sum(listOfNums); methodu ile de toplam değeri döndürelim.

    public static int sum(ArrayList<Integer> arrList){
        int result=0;
        for (int i = 0; i <arrList.size() ; i++) {
            result+=arrList.get(i);

        }
        return result;
    }




// duplicate(listOfNums); methodu ile de değerleri dublicate edip list i döndürelim.


    public static ArrayList<Integer> duplicate(ArrayList<Integer> arrayList){
        ArrayList<Integer> arrayListYeni= new ArrayList<>();
        for (int i = 0; i <arrayList.size() ; i++) {
            arrayListYeni.add(arrayList.get(i));
            arrayListYeni.add(arrayList.get(i));
        }
        return arrayListYeni;
    }



}
