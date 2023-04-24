package _35_Day_Arrays_Summary;

import java.util.Arrays;

public class C06_AradakiSayilariIndekslereAtama8_15 {
    public static void main(String[] args) {


        System.out.println(Arrays.toString(createArray(8, 15)));


    }

    // 2 adet integer sayi alan ve arasindaki sayilari indekslere atayan metod
    // createArray(8,15) --> [8,9,10,11,12,13,14,15]

    public static int[] createArray(int x, int y){
        int min=Math.min(x,y);
        int max=Math.max(x,y);
        int [] newArr=new int[max-min+1];
        for (int i = min, j=0; i <= max ; i++, j++) {
            newArr[j]=i;
        }return newArr;
    }




}
