package _31_Day_Arrays_1;

public class C03_Arrays_Tasks {
    public static void main(String[] args) {

        int[] sayi = {3, 5, 7, 9};
        System.out.println("besTenBuyukMu(sayi) = " + besTenBuyukMu(sayi));

        int[] array={2,4,5,6,8};
        System.out.println("icinde5VarMi(array) = " + icinde5VarMi(array));


        int[] num={3,5};
        int num2[]={3,6};
        System.out.println("ilkElemanlarEsitMi(num,num2) = " + ilkElemanlarEsitMi(num, num2));


    }
// Bir method yazın ve int[] kabul etsin. length i 5 den büyükse true döndürsün.

    public static boolean besTenBuyukMu(int[] sayi) {
        return sayi.length > 5;
//        if (sayi.length>5) {
//            return true;
//        }
//        return false;
    }

//    Bir method yazın int array kabul etsin array in içinde 5 olup olmadığını kontrol etsin.

        public static boolean icinde5VarMi ( int[] array){
            for (int i = 0; i < array.length; i++) {
                if (array[i]==5){
                    return true;
                }
            }return false;
        }

// Bir method yazın ve 2 array kabul etsin ilk elemanları eşitse true döndürsün.

    public static boolean ilkElemanlarEsitMi (int[] num, int[] num1){
        for (int i = 0; i <1 ; i++) {
            if (num[0]==num1[0]){
                return true;
            }
        }return false;
    }

}