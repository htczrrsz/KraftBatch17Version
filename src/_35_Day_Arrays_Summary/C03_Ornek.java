package _35_Day_Arrays_Summary;

import java.util.Arrays;

public class C03_Ornek {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(createArray(15, 8)));

    }
    // Örnek 6: 2 adet integer sayı alan ve arasındaki sayıları indekslere atayan metodu yazınız.
    // createArray(8,15) → [8,9,10,11,12,13,14,15]

    public static int [] createArray(int x, int y){
        int min=Math.min(x,y);
        int max=Math.max(x,y);

        int[] resultArray=new int[max-min+1];
        for (int i = min, j=0; i <=max ; i++,j++) {
            resultArray[j]=i;
        }
        return resultArray;
    }


}
