package _35_Day_Arrays_Summary;

public class C04_Ornek2 {
    public static void main(String[] args) {


int[] array1={5,4,11};
int[] array2={1,2,3,4,5,7,9};
        System.out.println(ikinciArraydeVarMi(array1, array2));


    }

    public static boolean ikinciArraydeVarMi(int[] arr1, int[] arr2){

       firstLoop: for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i]==arr2[j]){
                    continue firstLoop;
                }
            }
            return false;
        }
        return true;
    }



}
