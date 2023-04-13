package _32_Day_Arrays_2;

public class C09_Tekrar {
    public static void main(String[] args) {

int[] array={3,5,6,7,8};

        System.out.println(icindeSayiVarMi(array, 9));


        System.out.println(icindeSayiVarMi2(array, 6));


    }
    // bir metod yazin int array kabul etsin.
    // array in icinde 5 olup olmadigini kontrol etsin.

    public static boolean icindeSayiVarMi(int[] array, int istenenSayi){
        for (int i = 0; i <array.length ; i++) {
            if (array[i]==istenenSayi){
                return true;
            }
        }return false;
    }



    public static boolean icindeSayiVarMi2(int[] array, int istenenSayi){
        for (int x:array
             ) {
            if (x==istenenSayi){
                return true;
        }

            }return false;
        }



}
