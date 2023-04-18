package _35_Day_Arrays_Summary;

import java.util.Arrays;

public class C01_Arrays_Summary {
    public static void main(String[] args) {


        String str= "Merhaba";
        System.out.println(Arrays.toString(terstenYazdir(str)));

        String[] arr={"merhaba"};
        String[] yeni = Arrays.copyOfRange(arr,0,arr.length);
        System.out.println(Arrays.toString(yeni));


    }


    public static String[] terstenYazdir(String str) {
        String[] yeniArray = str.trim().split("");
        String[] resultArray = new String[yeniArray.length];

        for (int i = 0, j = yeniArray.length - 1; i < yeniArray.length; i++, j--) {
            resultArray[i] = yeniArray[j]; // string array oldugu icin boyle sanirim. i ye atadik yani.
        }
        return resultArray;

    }


//
//    String[] yeniArray = str.trim().split("");
//    String[] resultArray = new String[yeniArray.length];
//    for(int i=0; i<yeniArray.length ; i++){
//        resultArray[i]=yeniArray[i];
//    }

    // bos array in icine atamak icin.




}
