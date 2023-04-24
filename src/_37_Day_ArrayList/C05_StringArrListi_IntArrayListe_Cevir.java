package _37_Day_ArrayList;

import java.util.ArrayList;

public class C05_StringArrListi_IntArrayListe_Cevir {
    public static void main(String[] args) {

        ArrayList<String> stringNums=new ArrayList<>();
        stringNums.add("10");
        stringNums.add("100");
        stringNums.add("101");
        stringNums.add("1000");

        System.out.println(toIntList(stringNums));

    }


// "10","100","101","1000" sayılarını stringNums isimli arrayList e atalım.
// toIntList(stringNums); methodu Integer bir arrayList e convert edip döndürelim.


    public static ArrayList<Integer> toIntList(ArrayList<String> arrStringList){
        ArrayList<Integer> arrIntList = new ArrayList<>();
        for (int i = 0; i <arrStringList.size() ; i++) {
           arrIntList.add( Integer.valueOf(arrStringList.get(i)));
        }
        return arrIntList;



    }






}
