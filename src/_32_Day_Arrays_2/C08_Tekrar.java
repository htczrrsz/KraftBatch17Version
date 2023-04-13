package _32_Day_Arrays_2;

public class C08_Tekrar {
    public static void main(String[] args) {

        int[] array={4,5,6,7};
        System.out.println(bestenBuyukMu(array));
        System.out.println();
        if (bestenBuyukMu(array)){
            System.out.println("Uzunluk 5'ten buyuk");
        }else{
            System.out.println("uzunluk 5'ten kucuk");
        }


    }
// Bir metod yazin ve int[] kabul etsin. lenght'i 5ten buyukse true dondursun.

    public static boolean bestenBuyukMu(int[] arr){
        return arr.length>5;
    }



}
