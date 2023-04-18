package _36_Day_Wrapper_Class;

public class Tasks_Arrays_1_arraydekiTumSayilarToplami {
    public static void main(String[] args) {


        int[] array={3,4,5,6};

        System.out.println(toplam(array));


    }

    public static int toplam(int[] array){
        int result=0;
        for (int x: array) {
            result+=x;
        }return result;
    }


}
