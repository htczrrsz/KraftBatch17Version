package _37_Day_ArrayList;

import java.util.ArrayList;

public class C05_Ornek {
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

// yeni bi arrayList olustur icerisine 5 adet sayi ekle
    // dondur(int x) x kadar sayilari kendi icerisinde dondursun.
    // 1 2 3 4 5        dondur(int 1)  51234
    //                  dondur(int 2)  34512  yeni bir arrayList dondur.






}
