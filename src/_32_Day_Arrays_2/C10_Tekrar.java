package _32_Day_Arrays_2;

public class C10_Tekrar {
    public static void main(String[] args) {

        int array[]={5,6,7,8,9};
        int array2[]={5,7,9,10};
        System.out.println(ilkElemanlarEsitMi(array, array2));

        String[] arr1={"H","a","t"};
        String[] arr2={"D","e"};
        System.out.println(ilkElemanlarEsitMi(arr1, arr2));

    }

// Bir metod yazin ve 2 array kabul etsin , ilk elemanlari esitse true dondursun.

    public static boolean ilkElemanlarEsitMi(int[] arr1, int[] arr2) {
        return arr1[0] == arr2[0];

    }


    public static boolean ilkElemanlarEsitMi(String[] arr1, String[] arr2) {
        return arr1[0].equalsIgnoreCase(arr2[0]);
    }


}