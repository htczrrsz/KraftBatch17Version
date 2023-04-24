package _35_Day_Arrays_Summary;

public class C07_IkinciArraydeVarMi {
    public static void main(String[] args) {



        int[] arr={5,4,3,2,1};
        int[] arr2={1,2,3,4,7,5,9};
        System.out.println(ikinciArraydeVarMi(arr, arr2));

    }
    // 2 array kabul eden, ilk arrayin icerisindeki tum sayilar ikinci arrayin icinde yer aliyosa true,
    // almiyosa false yazdiran metod.
    // [5,4,3,2,1] , [1,2,3,4,5,7,9] true
    // [5,4,3,2,1,7,5] , [ 1,2,3,4,5] false
    
    public static boolean ikinciArraydeVarMi (int[] arr1, int[] arr2){
       firstLoop: for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j <arr2.length ; j++) {
                if (arr1[i]==arr2[j]){
                    continue firstLoop;
                }
            }
           return false;
        }return true;
    }
    
    
    
}
